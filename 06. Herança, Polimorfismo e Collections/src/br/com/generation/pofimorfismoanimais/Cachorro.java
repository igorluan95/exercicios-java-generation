package br.com.generation.pofimorfismoanimais;

/* (Exercicio de Polimorfismo)
 * 
	 *01)  Implemente um programa que crie os 3 tipos de animais definidos
		e invoque 2 métodos: um que emite o som e um que mostre o movimento de cada animal, de forma polimórfica, isto é,
		independente do tipo de animal.
	 
			Cachorro: Emite som e corre
			Cavalo: Emite som e corre
			Preguiça: Emite som e sobe em árvore*/

public class Cachorro extends Animal{        //------------> clico

	@Override //--> sobrescrita de método
	public void som() {	
		System.out.println("Som do cachorro: au au au...");
		
	}

	@Override //--> sobrescrita de método
	public void movimento() {	
		System.out.println("Cachorro correndo...");
		
	}

	

}

