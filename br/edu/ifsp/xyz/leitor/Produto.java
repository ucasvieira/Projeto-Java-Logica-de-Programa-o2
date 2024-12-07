package br.edu.ifsp.xyz.leitor;

import java.util.ArrayList;

public class Produto {
	private int idProduto;
	private String codigo;
	private double preco;
	private int idCategoria;
	private String nomeProduto;

	public Produto(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		String produto = pedidos.get(0);
		String[] campos = produto.split(";");
        this.idProduto = Integer.parseInt(campos[0]);
        this.codigo = campos[1];
        this.preco = Double.parseDouble(campos[2]);
 	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", codigo=" + codigo + ", preco=" + preco + "]";
	}
}