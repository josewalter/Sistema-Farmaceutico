package br.com.administracaofarmacia.domain;

  import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
  *   Document   : Administrativo para Farmácia
  *   Created on : 26/12/2016, 13:22:02
  *   Descriçao  : Fabricante.
  *   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
 */

   @Entity
   @Table(name="tbl_fabricantes")
   @NamedQueries({ @NamedQuery(name = "Fabricante.listar", query = "SELECT fabricante FROM Fabricante fabricante ")})
   public class Fabricante {
	   
//===================================================================================================	   
	   // Declaração dos dados para persistirem no banco de dados
	   
	   @javax.persistence.Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name = "Id")
	   private int Id;
	   
	   @Column(name = "NomeFabricante", length = 50, nullable = false)
	   private String NomeFabricante;
	   
	   @Column(name = "Endereco", length = 45, nullable = false)
	   private String Endereco;
	   
	   @Column(name = "Bairro", length = 45, nullable = false)
	   private String Bairro;
	   
	   @Column(name = "Telefone", length = 14, nullable = true)
	   private String Telefone;
	   
	   @Column(name = "Celular", length = 15, nullable = false)
	   private String Celular;
	   
	   @Column(name = "Email", length = 50, nullable = false)
	   private String Email;
	   
	   @Column(name = "Cnpj", length = 17, nullable = false)
	   private int Cnpj;
	   
	   @Column(name = "Descricao", length = 150, nullable = false)
	   private String Descricao;
	   
//===================================================================================================
	//Declaração dos Getters and Setters
	   
		public int getId() {
		 return Id;
	    }

	     public void setId(int id) {
	    	Id = id;
	    }

	     public String getNomeFabricante() {
		   return NomeFabricante;
     	}

         public void setNomeFabricante(String nomeFabricante) {
		   NomeFabricante = nomeFabricante;
	    }

	      public String getEndereco() {
		    return Endereco;
	      }

        	public void setEndereco(String endereco) {
		      Endereco = endereco;
	       }

	        public String getBairro() {
		      return Bairro;
	       }

	         public void setBairro(String bairro) {
		       Bairro = bairro;
	         }

	           public String getTelefone() {
		         return Telefone;
	          }

	           public void setTelefone(String telefone) {
		         Telefone = telefone;
	           }

	             public String getCelular() {
		           return Celular;
	             }

	               public void setCelular(String celular) {
		             Celular = celular;
	              }

	                public String getEmail() {
		             return Email;
	                }

	                  public void setEmail(String email) {
		               Email = email;
	                 }

	                     public int getCnpj() {
		                   return Cnpj;
	                    }

	                public void setCnpj(int cnpj) {
		              Cnpj = cnpj;
	                }

	           public String getDescricao() {
		          return Descricao;
	          }

	       public void setDescricao(String descricao) {
		     Descricao = descricao;
	}
}
