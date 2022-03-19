package br.com.generation.collections;

/* 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades: Armazenar dados da List, 
Remover dados da list, Atualizar dados da list, Apresentar todos os dados da list. * */


public class ProdutoNoEstoque {

	// Atributos

	private String produto;
	private int quantidade;

	// construtor da classe

	public ProdutoNoEstoque(String produto, int quantidade) {
		super();

		this.produto = produto;
		this.quantidade = quantidade;

	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// polimorfismo

	@Override
	public String toString() {
		return "Produto: " + produto + " | Quantidade: " + quantidade;
	}

}
