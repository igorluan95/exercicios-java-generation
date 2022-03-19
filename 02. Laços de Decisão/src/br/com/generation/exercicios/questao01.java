package br.com.generation.exercicios;

import java.util.Scanner;

/* (Exercicio de Laço de Decisão)

 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior. */

public class questao01 {

	public static void main(String[] args) {

		int num1, num2, num3, maior = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"#### Insira 3 números e o programa retornará com uma mensagem dizendo qual deles é o maior ####\n");

		System.out.print("Insira o 1º número: ");
		num1 = sc.nextInt();

		System.out.print("Insira o 2º número: ");
		num2 = sc.nextInt();

		System.out.print("Insira o 3º número: ");
		num3 = sc.nextInt();

		if (num1 >= maior) {

			maior = num1;
		}

		if (num2 >= maior) {

			maior = num2;
		}

		if (num3 >= maior) {

			maior = num3;
		}

		System.out.println("\nO maior número inserido foi o " + maior + ".");

		sc.close();

	}

}

/*
   Exemplo de uma Saída do Console após executar o código:
  
		#### Insira 3 números e o programa retornará com uma mensagem dizendo qual deles é o maior ####
		
		Insira o 1º número: -10
		Insira o 2º número: 0
		Insira o 3º número: 12
		
		O maior número inserido foi o 12.
 
 
 */

