package fvs.edu.br.topicos.domain;

import java.io.Serializable;

import javax.persistence.ManyToOne;

public class ItemPedidosPK implements Serializable{
	private static final long serialVersionUID = 1L;  
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Pedido pedido;

}
