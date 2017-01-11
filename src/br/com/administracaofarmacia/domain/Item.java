package br.com.administracaofarmacia.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
   *   Document   : Administrativo para Farmácia
   *   Created on : 01/01/2017, 23:19:02
   *   Descriçao  : Item.
   *   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
 */

  
    @Entity
    @Table(name = "tbl_Itens")
    public class Item {
    	
//===================================================================================================	   
 	   // Declaração dos dados para persistirem no banco de dados
    	
    	@Id
    	@GeneratedValue(strategy = GenerationType.AUTO)
    	@Column(name = "Itens_Id")
    	private int IdItens;
    	
    	@Column(name = "Quantidade_Itens", nullable = false)
    	private  Integer Quantidade;        
    	
    	@Column(name = "Itens_Valor_Parcial", precision = 7, scale = 2, nullable = false)
    	private BigDecimal valor;
    	
    	@ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "tbl_venda_Id_venda", referencedColumnName = "Id_Venda", nullable = false)
    	private Venda venda;
    	
    	@ManyToOne(fetch = FetchType.EAGER)
    	@JoinColumn(name = "tbl_produtos_Id", referencedColumnName = "Id_Produtos", nullable = false)
    	private Produto produto;
    	
//===================================================================================================
    	//Declaração dos Getters and Setters

		public int getIdItens() {
			return IdItens;
		}

		public void setIdItens(int idItens) {
			IdItens = idItens;
		}

		public Integer getQuantidade() {
			return Quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			Quantidade = quantidade;
		}

		public BigDecimal getValor() {
			return valor;
		}

		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}

		public Venda getVenda() {
			return venda;
		}

		public void setVenda(Venda venda) {
			this.venda = venda;
		}

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}
    	
    	
    	
    	

}
