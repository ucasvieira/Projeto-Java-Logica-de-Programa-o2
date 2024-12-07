package br.edu.ifsp.xyz.leitor;

import java.util.ArrayList;

public class Item {
	private int idItem;
	private int idPedido;
	private Produto produto;
	private int qtVenda;
	public Item(int idItem, int idPedido, Produto produto, int qtVenda) {
		this.idItem = idItem;
		this.idPedido = idPedido;
		this.produto = produto;
		this.qtVenda = qtVenda;
	}
	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", idPedido=" + idPedido + ", produto=" + produto + ", qtVenda=" + qtVenda
				+ "]";
	}
	
	

}
