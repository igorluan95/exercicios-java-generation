package br.com.generation.exercicios;

import java.util.Scanner;


/*(Exercicio de Laço de Decisão)
 * 2- Faça um programa que entre com três números e coloque em ordem crescente
 */

public class questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;

		System.out.println("#### Insira 3 números para serem exibidos em ordem crescente. ####\n");

		System.out.print("Insira o 1º número: ");
		num1 = sc.nextDouble();
		System.out.print("Insira o 2º número: ");
		num2 = sc.nextDouble();
		System.out.print("Insira o 3º número: ");
		num3 = sc.nextDouble();

		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println("\nA ordem crescente dos números inseridos é: " + num1 + ", " + num2 + " e " + num3);
			} else if (num1 < num3) {
				System.out.println("\nA ordem crescente dos números inseridos é: " + num1 + ", " + num3 + " e " + num2);
			} else {
				System.out.println("\nA ordem crescente dos números inseridos é: " + num3 + ", " + num1 + " e " + num2);
			}
		}

		else if (num2 < num3) {
			if (num1 < num3) {
				System.out.println("\nA ordem crescente dos números inseridos é: " + num2 + ", " + num1 + " e " + num3);
			} else {
				System.out.println("\nA ordem crescente dos números inseridos é: " + num2 + ", " + num3 + " e " + num1);
			}
		}

		else {
			System.out.println("\nA ordem crescente dos números inseridos é: " + num3 + ", " + num2 + " e " + num1);
		}
		sc.close();
	}

}

			/*   Exemplo de uma Saída do Console após executar o código:
			 * 
			 * #### Insira 3 números para serem exibidos em ordem crescente. ####
			
			Insira o 1º número: -500
			Insira o 2º número: 0
			Insira o 3º número: 127
			
			A ordem crescente dos números inseridos é: -500.0, 0.0 e 127.0
			*/
