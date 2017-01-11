package br.com.administracaofarmacia.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.administracaofarmacia.domain.Fabricante;
import br.com.administracaofarmacia.util.HibernateUtil;

/*
  *   Document   : Administrativo para Farmácia
  *   Created on : 31/12/2016, 18:20:02
  *   Descriçao  : Fabricante dao.
  *   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
 */

 public class FabricanteDao {
   
	 public void Salvar(Fabricante fabricante) throws Exception{
		 Session sessao = HibernateUtil.getCurrentSession().getSession();
		 Transaction transacao = null;
		 
		 try {
			 transacao = sessao.beginTransaction();
			 sessao.save(fabricante);
			 transacao.commit();
			 	
		   } catch (RuntimeException e) {
			  if(transacao != null){
				  transacao.rollback();
			  }
			  
		}finally {
			sessao.close();
		}
		 
	 }
	 
	  public List<Fabricante> listar(Exception ex){
		  Session sessao = HibernateUtil.getCurrentSession().getSession();
		  List<Fabricante> fabricantes = null;
		  
		  try {
			Query consulta = sessao.createQuery("Fabricante.listar");
		    fabricantes = consulta.list();
		    
		  } catch (RuntimeException ex1) {
			throw ex1;
		}finally{
			sessao.close();
		}
		  return fabricantes;
	  }
}
