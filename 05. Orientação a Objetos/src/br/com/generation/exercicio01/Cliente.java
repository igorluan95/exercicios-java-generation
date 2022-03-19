package br.com.generation.exercicio01;

/* (Exercicio de Orientação a Objetos)
 * 
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private double valorDaCompra;
	private double valorCupomDeDesconto;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValorDaCompra() {
		return valorDaCompra;
	}
	public void setValorDaCompra(double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}
	public double getValorCupomDeDesconto() {
		return valorCupomDeDesconto;
	}
	public void setValorCupomDeDesconto(double valorCupomDeDesconto) {
		this.valorCupomDeDesconto = valorCupomDeDesconto;
	}

	void comprar(){
		System.out.println("\nDados processados...\n");
	}
		
	void pagar(){
			System.out.println("\nCompra concluída!");
		
	}
	
	void inicio(){
		System.out.println("#### Iniciando processamento de compra ####\n");
	}
	
	
}