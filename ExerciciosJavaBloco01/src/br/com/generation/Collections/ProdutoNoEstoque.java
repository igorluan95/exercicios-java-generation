package br.com.generation.Collections;

public class ProdutoNoEstoque {
	
	//Atributos
	private int codigo;
	private String produto;
	private double quantidade;
	
	
	//construtor da classe

	public ProdutoNoEstoque(int codigo, String produto, double quantidade) {
		super();
		this.codigo = codigo;
		this.produto = produto;
		this.quantidade = quantidade;
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
			

		
	
	//polimorfismo

	@Override
	public String toString() {
		return "Código: " + codigo + " | Produto: " + produto + " | quantidade: " + quantidade + " Kg";
	}


	
	
}
