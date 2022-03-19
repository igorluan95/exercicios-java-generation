package br.com.generation.exercicio02;

import java.util.Scanner;

/*(Exercicio de Orientação a Objetos)
 * 
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta
classe, em seguida crie um objeto avião, defina as instancias deste objeto e
apresente as informações deste objeto no console.*/

public class TestarAviao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Aviao a1 = new Aviao();
		
		System.out.println("#### Inserindo dados de um Avião ####\n");
		
		System.out.println("Fabricante: ");
		a1.setFabricante(input.nextLine());
		System.out.println("Modelo: ");
		a1.setModelo(input.nextLine());
		System.out.println("Tipo de uso: ");
		a1.setUso(input.nextLine());
		System.out.println("Quantidade máxima de passageiros: ");
		a1.setQtdPassageiros(input.nextInt());
		System.out.println("Insira a velocidade mínima para levantar voo (km/h): ");
		a1.setVelocidadeVoo(input.nextInt());
		System.out.println("Insira a velocidade máxima que pode ser atingida durante o voo (km/h): ");
		a1.setVelocidadeMax(input.nextInt());

		System.out.println("\nDados do avião:\n");
		
		System.out.println("Fabricante: "+ a1.getFabricante());
		System.out.println("Fabricante: "+ a1.getModelo());
		System.out.println("Fabricante: "+ a1.getUso());
		System.out.println("Fabricante: "+ a1.getQtdPassageiros());
		
		a1.dadosVelocidade();

		a1.levantarVoo(a1.getVelocidadeVoo());
		System.out.println("\nEsse tipo de avião decola com a velocidade mínima de " + a1.getVelocidadeVoo() + "Km/h.");

		a1.acelerarMax(a1.getVelocidadeMax());
		System.out.println("\nA velocidade máxima atingida pode chegar até " + a1.getVelocidadeMax() + "Km/h.");

		input.close();

	}

}

/*
 * Exemplo de uma Saída do Console após executar o código:
 * 
		  
		#### Iniciando vooInserindo dados de um Avião ####
		
		Fabricante: 
		Embraer
		Modelo: 
		E-195
		Tipo de uso: 
		Comercial
		Quantidade máxima de passageiros: 
		124
		Insira a velocidade mínima para levantar voo (km/h): 
		280
		Insira a velocidade máxima que pode ser atingida durante o voo (km/h): 
		890
		
		Dados do avião:
		
		Fabricante: Embraer
		Fabricante: E-195
		Fabricante: Comercial
		Fabricante: 124
		
		Dados da velocidade:
				
		Esse tipo de avião decola com a velocidade mínima de 280Km/h.
		
		A velocidade máxima atingida pode chegar até 890Km/h.
			 
 
 */
