package br.com.administracaofarmacia.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
   *   Document   : Administrativo para Farmácia
   *   Created on : 01/01/2017 18:33:02
   *   Descriçao  : Produto.
   *   Author     : Jose Walter (Bacharel em Ciencias da Computaçao)
  */

    @Entity
    @Table(name = "tbl_produtos")
     public class Produto {
    	
//===================================================================================================    	    	
    	// Declaração dos dados para persistirem no banco de dados
    	 
    	 @javax.persistence.Id
         @GeneratedValue(strategy = GenerationType.AUTO)
    	 @Column(name = "Id")
    	 private int IdProduto;
    	 
    	 @Column(name = "PrecoCusto", precision = 7, scale = 2, nullable = false)
    	 private BigDecimal PrecoCusto;
    	 
    	 @Column(name = "PrecoVenda", precision = 7, scale = 2, nullable = false)
    	 private BigDecimal PrecoVenda;
    	 
    	 @Column(name = "CodigoBarra", length = 16, nullable = false)
    	 private int CodigoBarra;
    	 
    	 @Temporal(value = TemporalType.TIMESTAMP)
    	 @Column(name = "DataFabricacao", nullable = false)
    	 private Date DataFabricacao;
    	 
    	 @Temporal(value = TemporalType.TIMESTAMP)
    	 @Column(name = "DataValidade", nullable = false)
    	 private Date DataValidade;
    	 
    	 @Column(name = "DescricaoProduto", length = 150)
    	 private String DescricaoProduto;
    	 
    	 @Column(name = "Quantidade", nullable = false)
    	 private Integer Quantidade;
    	 
    	 @ManyToOne(fetch = FetchType.EAGER)
    	 @JoinColumn(name = "tbl_fabricantes_Id", referencedColumnName = "Id", nullable = false)
    	 private Fabricante fabricante;
    	 
    	 
//===================================================================================================
    	//Declaração dos Getters and Setters

		public int getIdProduto() {
			return IdProduto;
		}

		public void setIdProduto(int idProduto) {
			IdProduto = idProduto;
		}

		public BigDecimal getPrecoCusto() {
			return PrecoCusto;
		}

		public void setPrecoCusto(BigDecimal precoCusto) {
			PrecoCusto = precoCusto;
		}

		public BigDecimal getPrecoVenda() {
			return PrecoVenda;
		}

		public void setPrecoVenda(BigDecimal precoVenda) {
			PrecoVenda = precoVenda;
		}

		public int getCodigoBarra() {
			return CodigoBarra;
		}

		public void setCodigoBarra(int codigoBarra) {
			CodigoBarra = codigoBarra;
		}		

		public Date getDataFabricacao() {
			return DataFabricacao;
		}

		public void setDataFabricacao(Date dataFabricacao) {
			DataFabricacao = dataFabricacao;
		}

		public Date getDataValidade() {
			return DataValidade;
		}

		public void setDataValidade(Date dataValidade) {
			DataValidade = dataValidade;
		}

		public String getDescricaoProduto() {
			return DescricaoProduto;
		}

		public void setDescricaoProduto(String descricaoProduto) {
			DescricaoProduto = descricaoProduto;
		}

		public Integer getQuantidade() {
			return Quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			Quantidade = quantidade;
		}

		public Fabricante getFabricante() {
			return fabricante;
		}

		public void setFabricante(Fabricante fabricante) {
			this.fabricante = fabricante;
		}
    	 
    	 
    	 

}
