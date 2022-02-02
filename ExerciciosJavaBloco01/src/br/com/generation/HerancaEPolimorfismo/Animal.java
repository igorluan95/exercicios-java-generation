package br.com.generation.HerancaEPolimorfismo;

public class Animal {
	
	//Atributos - variavéis
	
	private String nome;
	private int idade; 
	private String som;
	
	public void correr(){
		System.out.println("Correndo!");
	}
	
	public void subirArvore(){
		System.out.println("Subindo árvore!");
	}
	
	public void emitirSomCavalo(){
		System.out.println("Som emitido: iiirrrrí!");
	}
	
	public void emitirSomCachorro(){
		System.out.println("Som emitido: auauau! ");
	}
	
	public void emitirSomPreguica(){
		System.out.println("Som emitido: ahh ahhh ahh! ");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	
	
	
	
}
