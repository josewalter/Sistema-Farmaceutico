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
  *   Created on : 01/01/2017 14:10:02
  *   Descriçao  : Funcionário.
  *   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
 */

   @Entity
   @Table(name = "tbl_funcionarios")
   @NamedQueries({@NamedQuery( name = "Funcionarios.Listar", query = "SELECT funcionarios FROM Funcionarios funcionarios")})
   public class Funcionario {
	   
 //======================================================================================	   

   // Declaração dos dados para persistirem no banco de dados.
	   
	   @javax.persistence.Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name = "Id_funcionario")
	   private int IdFuncionario;
	   
	   @Column(name = "NomeFuncionario", length = 50, nullable = false)
	   private String NomeFuncionario;
	   
	   @Column(name = "Endereco", length = 50, nullable = false)
	   private String Endereco;
	   
	   @Column(name = "Bairro", length = 45, nullable = false)
	   private String Bairro;
	   
	   @Column(name = "Telefone", length = 14, nullable = true)
	   private String Telefone;
	   
	   @Column(name = "Fun_Celular", length = 15, nullable = true)
	   private String Celular;
	   
	   @Column(name = "Email", length = 50, nullable = false)
	   private String Email;
	   
	   @Column(name = "Cep", length = 10, nullable = false)
	   private int Cep;
	   
	   @Column(name = "Fun_Cpf", length = 32, unique = true)
	   private String Cpf;
	   
	   @Column(name = "Fun_Senha", length = 32, nullable = false)
	   private String Senha;
	   
	   @Column(name = "Fun_Funcao", length = 45, nullable = false)
	   private String Funcao;
	   
//======================================================================================	   

	 //Declaração dos Getters and Setters
	   
	   
	   public int getIdFuncionario() {
		return IdFuncionario;
	   }

	    public void setIdFuncionario(int idFuncionario) {
		   IdFuncionario = idFuncionario;
	    }

	     public String getNomeFuncionario() {
		   return NomeFuncionario;
	     }

	       public void setNomeFuncionario(String nomeFuncionario) {
		    NomeFuncionario = nomeFuncionario;
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

	public int getCep() {
		return Cep;
	}

    	public void setCep(int cep) {
	     	Cep = cep;
	    }

	   	
    	public String getCpf() {
			return Cpf;
		}

		public void setCpf(String cpf) {
			Cpf = cpf;
		}

		public String getSenha() {
		    return Senha;
	      }

	        public void setSenha(String senha) {
		      Senha = senha;
	       }

	         public String getFuncao() {
		       return Funcao;
         	}

	          public void setFuncao(String funcao) {
		        Funcao = funcao;
	         }
         }
