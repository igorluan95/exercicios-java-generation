package br.com.generation.exercicio05;

import java.util.Scanner;


/*(Exercicio de Orientação a Objetos)
 * 
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class TestarPatinete {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Patinete p1 = new Patinete();

		
		System.out.println("#### Inserindo dados do Patinete ####\n");
		
		System.out.println("Fabricante: ");
		p1.setFabricante(input.nextLine());
		
		System.out.println("Modelo: ");
		p1.setModelo(input.nextLine());
		
		System.out.println("Insira a velocidade máxima que pode ser atingida (Km/h): ");
		p1.setVelocidadeMax(input.nextInt());
		
		p1.dadosDoPatinete();
		
		System.out.println("\nFabricante: " + p1.getFabricante());			
		System.out.println("Modelo: "+ p1.getModelo());			
		System.out.println("Velocidade máxima: "+ p1.getVelocidadeMax() + " Km/h.");
				
		p1.fim();
		
		input.close();
		
	}
	
	
}

/*
 * Exemplo de uma Saída do Console após executar o código:
 * 
		  
		#### Inserindo dados do Patinete ####

	Fabricante: 
	Atrio
	Modelo: 
	FUN X - Patinete elétrico
	Insira a velocidade máxima que pode ser atingida (Km/h): 
	23
	
	Dados do Patinete:
	
	Fabricante: Atrio
	Modelo: FUN X - Patinete elétrico
	Velocidade máxima: 23 Km/h.
	
	Programa Finalizado!
			 
 
 */
