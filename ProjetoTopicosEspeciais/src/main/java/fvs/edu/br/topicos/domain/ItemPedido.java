package fvs.edu.br.topicos.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

  @Entity
  public class ItemPedido implements Serializable{
		private static final long serialVersionUID = 1L;  
	
	 @JsonIgnore
	 @EmbeddedId
	 private ItemPedidosPK id = new ItemPedidosPK();
	
	 private Double desconto;
	 private Double preco;
	 private Integer quantidade;

	 public ItemPedido() {
}

	public ItemPedido(Pedido pedido, Produto produto, Double desconto, Double preco, Integer quantidade) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.desconto = desconto;
		this.preco = preco;
		this.quantidade = quantidade;
		}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
	}

	public ItemPedidosPK getId() {
		return id;
	}

	public void setId(ItemPedidosPK id) {
		this.id = id;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	}
