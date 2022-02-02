package br.com.generation.HerancaEPolimorfismo;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	Cachorro ca1 = new Cachorro();
	Cavalo cav1 = new Cavalo();
	Preguica pr1 = new Preguica();
	
	ca1.setNome ("Amigo (Cachorro)");
	ca1.setIdade (7);
	System.out.println("Nome: " + ca1.getNome());
	System.out.println("Idade: " + ca1.getIdade());
	ca1.correr();
	ca1.emitirSomCachorro();
	
	
	System.out.println();
	
	cav1.setNome ("Pé de Pano (Cavalo)");
	cav1.setIdade (4);
	System.out.println("Nome: " + cav1.getNome());
	System.out.println("Idade: " + cav1.getIdade());
	cav1.correr();
	cav1.emitirSomCavalo();
	
	
	System.out.println();
	
	pr1.setNome ("Bonita (Preguiça)");
	pr1.setIdade (8);
	System.out.println("Nome: " + pr1.getNome());
	System.out.println("Idade: " + pr1.getIdade());
	pr1.subirArvore();
	pr1.emitirSomPreguica();
	
	


	}

}
