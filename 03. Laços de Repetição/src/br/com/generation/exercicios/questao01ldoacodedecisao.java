package br.com.generation.exercicios;

import java.util.Scanner;

/* (Exercicio com Laço de Decisão, laço de Repetição e Vetor.)

 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior. */

public class questao01ldoacodedecisao {

	public static void main(String[] args) {

		int[] vetor = new int[3];
		int maior = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"#### Insira 3 números e o programa retornará com uma mensagem dizendo qual deles é o maior. ####\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("Insira o " + (i + 1) + "º número: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] >= maior) {
				maior = vetor[i];

			}
		}

		System.out.println("\nO maior número inserido foi " + maior+".");

		sc.close();

	}

}

/*
Exemplo de saída do Console após executar o código:

#### Insira 3 números e o programa retornará com uma mensagem dizendo qual deles é o maior. ####

Insira o 1º número: -50
Insira o 2º número: 0
Insira o 3º número: 127

O maior número inserido foi 127.

*/
