package br.com.administracaofarmacia.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 *   Document   : Administrativo para Farmácia
 *   Created on : 01/01/2017, 22:29:02
 *   Descriçao  : Classe Venda.
 *   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
*/

   @Entity
   @Table(name = "tbl_venda")
   public class Venda {
	   
//===================================================================================================	   
	   // Declaração dos dados para persistirem no banco de dados
	   
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name = "Id_Venda")
	   private int Venda;
	 
	   @Temporal(value = TemporalType.TIMESTAMP)
	   @Column(name = "Horario_Venda", nullable = false)
	   private Date HorarioVenda;

	   @Column(name = "Venda_Valor", precision = 7, scale = 2, nullable = false)
	   private BigDecimal ValorVenda;
	   
	   @ManyToOne(fetch = FetchType.EAGER)
	   @JoinColumn(name = "tbl_funcionarios_Id_funcionario", referencedColumnName = "Id_funcionario", nullable = false)
	   private Funcionario funcionario;
	   
//===================================================================================================
		//Declaração dos Getters and Setters

	public int getVenda() {
		return Venda;
	}

	public void setVenda(int venda) {
		Venda = venda;
	}

	public Date getHorarioVenda() {
		return HorarioVenda;
	}

	public void setHorarioVenda(Date horarioVenda) {
		HorarioVenda = horarioVenda;
	}

	public BigDecimal getValorVenda() {
		return ValorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		ValorVenda = valorVenda;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	   
	   
	   
}
