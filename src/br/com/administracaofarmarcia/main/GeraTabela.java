package br.com.administracaofarmarcia.main;

import br.com.administracaofarmacia.util.HibernateUtil;

/*
*   Document   : Administrativo para Farmácia
*   Created on : 22/12/2016, 22:50:02
*   Descriçao  : Gera Tabela.
*   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
*/

public class GeraTabela {

	public static void main(String[] args) {
	
		HibernateUtil.getCurrentSession();
		HibernateUtil.getCurrentSession().clear();

	}

}
