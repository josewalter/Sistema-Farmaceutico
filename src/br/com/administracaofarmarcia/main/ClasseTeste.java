package br.com.administracaofarmarcia.main;

import br.com.administracaofarmacia.dao.FabricanteDao;

/*
 *   Document   : Administrativo para Farmácia
 *   Created on : 31/12/2016, 19:15:02
 *   Descriçao  : Fabricante teste.
 *   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
*/

 import br.com.administracaofarmacia.domain.Fabricante;

  public class ClasseTeste {
	
	public void Salvar(){
		Fabricante f1 = new Fabricante();
		f1.setNomeFabricante("Jose Walter" );
		f1.setEndereco("Rua Dos Girassois n 35");
		f1.setBairro("Cidade Jardim 2");
		f1.setTelefone("(193621-4722");
		f1.setCelular("(19)99996-9973");
		f1.setEmail("josewalter408@gmail.com");
		f1.setCnpj(13467-130);
		f1.setDescricao(" Desenvolvedor de Software");
		
		FabricanteDao dao = new FabricanteDao();
		try {
			dao.Salvar(f1);
			System.out.println("Fabricante salvo com sucesso!!!");
		} catch (Exception e) {
			
			System.out.println("Erro ao salvar o fabricante, tente novamente!!!");
		}
	}
	
}
