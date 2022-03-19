package br.com.generation.exercicio07;

/*(Exercicio de Orientação a Objetos)
 * 
6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Paciente {

	private String nome;
	private String cpf;
	private int idade;
	
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
		
	void cadastrar () {
		System.out.println("#### Cadastrar novo paciente: ####\n");
	}
	
	void dados () {
		System.out.println("\nDados inseridos:\n");
	}

	void fim () {
		System.out.println("\nSistema encerrado!\n");
	}

	

}
