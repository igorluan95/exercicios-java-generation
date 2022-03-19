package br.com.generation.exercicio02;

/*(Exercicio de Orientação a Objetos)
 * 
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta
classe, em seguida crie um objeto avião, defina as instancias deste objeto e
apresente as informações deste objeto no console.*/

public class Aviao {

	private String fabricante;
	private String modelo;
	private String uso;
	private int qtdPassageiros;
	private int velocidadeInicial=0;
	private int velocidadeVoo;
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


	public String getUso() {
		return uso;
	}


	public void setUso(String uso) {
		this.uso = uso;
	}


	public int getQtdPassageiros() {
		return qtdPassageiros;
	}


	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}


	public int getVelocidadeInicial() {
		return velocidadeInicial;
	}


	public void setVelocidadeInicial(int velocidadeInicial) {
		this.velocidadeInicial = velocidadeInicial;
	}


	public int getVelocidadeVoo() {
		return velocidadeVoo;
	}


	public void setVelocidadeVoo(int velocidadeVoo) {
		this.velocidadeVoo = velocidadeVoo;
	}


	public int getVelocidadeMax() {
		return velocidadeMax;
	}


	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	void dadosVelocidade() {
	System.out.println("\nDados da velocidade:");
	}

	void levantarVoo(int velocidadeMin) {             
		velocidadeInicial = velocidadeInicial + velocidadeMin;
	}
	
	
	void acelerarMax(int velocidadeMax) {
		velocidadeInicial = velocidadeInicial + velocidadeMax;
		
	}
	
}
