package br.com.generation.OrientacaoAObjetos;

public class Questao02Aviao {
	
	String fabricante;
	String modelo;
	String uso;
	int qtdPassageiros;
	int velocidade;
	
	void levantarVoo(int aceleracao) {             
		velocidade = velocidade + aceleracao;
	}
	
	
	void acelerar(int aceleracaoMax) {
		velocidade = velocidade + aceleracaoMax;
		
	}
	

}
