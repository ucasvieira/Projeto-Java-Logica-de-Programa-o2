package br.edu.ifsp.xyz.leitor;

import java.util.ArrayList;

public class Item {
	private Pedido idPedido;
	private Produto produto;
	private int qtVenda;
	private double precoVenda;

	public Item(Pedido idPedido, Produto produto, int qtVenda, double precoVenda) {
		this.idPedido = idPedido;
		this.produto = produto;
		this.qtVenda = qtVenda;
		this.precoVenda = precoVenda;
	}
	@Override
	public String toString() {
		return "Item [idPedido=" + idPedido + ", produto=" + produto + ", qtVenda=" + qtVenda + ", precoVenda="+ precoVenda +"]";
	}
	
	

}
