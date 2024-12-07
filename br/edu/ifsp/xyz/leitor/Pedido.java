package br.edu.ifsp.xyz.leitor;

import java.util.ArrayList;
import java.util.Arrays;

public class Pedido {
	private int idPedido;
	private Cliente cliente;
	private double valor;
	private Item[] itens;

	public Pedido(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		String pedido = pedidos.get(0);
		String[] campos = pedido.split(";");
        this.idPedido = Integer.parseInt(campos[0]);
        String idCliente = campos[1];
        System.out.println(idCliente);
        this.valor = Double.parseDouble(campos[3]);
        this.cliente = new Cliente("./src/Cliente.txt", 0, idCliente);

        leitor = new Leitor("./src/Item.txt", 1, this.idPedido+"");
        
        ArrayList<String> itens = leitor.conteudo();
		int qtItens = itens.size();
		this.itens = new Item[qtItens];
		
		int indice = 0;
		for (String item : itens) {
			campos = item.split(";");
			int idItem = Integer.parseInt(campos[0]);
			int idPedido = Integer.parseInt(campos[1]);
			String idProduto = campos[2];
    		Produto produto = new Produto("./src/Produto.txt", 0, idProduto);
			int qtVenda = Integer.parseInt(campos[3]);
			this.itens[indice] = new Item(idItem,idPedido,produto, qtVenda);
			indice++; 
		}
        
 	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cliente=" + cliente + ", valor=" + valor + ", itens="
				+ Arrays.toString(itens) + "]";
	}

	

}
