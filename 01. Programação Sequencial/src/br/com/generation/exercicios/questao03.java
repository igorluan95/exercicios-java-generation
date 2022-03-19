package br.com.generation.exercicios;

import java.util.Scanner;

/* # (Exercicio de Programação Sequencial)
  	  
	  3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	  expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */

public class questao03 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int tempo, h, m, s;

		System.out.println("#### Tempo de duração de um evento expresso em horas, minutos e segundos. ####\n");

		System.out.print("Insira o tempo da duração do evento expresso em segundos(Número inteiro): ");
		tempo = sc.nextInt();

		h = tempo / 3600;
		m = (tempo % 3600) / 60;
		s = (tempo % 3600) % 60;

		System.out.println("\nTempo de duração do evento:\n" + h + "h " + m + "m " + s + "s");

		sc.close();

	}

}

/*
 Exemplo de uma Saída do Console após executar o código:
		  
#### Tempo de duração de um evento expresso em horas, minutos e segundos.####
		  
Insira o tempo da duração do evento expresso em segundos(Número inteiro):
 3600
  
 Tempo de duração do evento: 1h 0m 0s
  
 */
