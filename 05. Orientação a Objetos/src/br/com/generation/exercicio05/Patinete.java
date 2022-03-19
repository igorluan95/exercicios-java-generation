package br.com.generation.exercicio05;

/*(Exercicio de Orientação a Objetos)
 * 
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Patinete {
	
	private String fabricante;
	private String modelo;
	private int velocidadeInicial=0;
	private int velocidadeMax;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeInicial() {
		return velocidadeInicial;
	}
	public void setVelocidadeInicial(int velocidadeInicial) {
		this.velocidadeInicial = velocidadeInicial;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	void dadosDoPatinete() {
	System.out.println("\nDados do Patinete:");
	}
	
	void fim() {
	System.out.println("\nPrograma Finalizado!");
	}
	

}
