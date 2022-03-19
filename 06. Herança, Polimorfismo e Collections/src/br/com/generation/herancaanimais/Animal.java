package br.com.generation.herancaanimais;

/* (Exercicio de Herança)
 * 
	 *01) Crie uma hierarquia de classes os atributos e comportamentos descritos, utilize os seus conhecimentos e distribua as
	características de forma que tudo o que for comum a todos os animais fique na classe Animal: 
	
	Cachorro: Possui nome, possui idade, deve emitir som e deve correr
	Cavalo: Possui nome, possui idade, deve emitir som e deve correr
	Preguiça: Possui nome, possui idade, deve emitir som e deve subir em árvore*/

public class Animal {

	private String nome;
	private int idade;
	
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
	
	

}
