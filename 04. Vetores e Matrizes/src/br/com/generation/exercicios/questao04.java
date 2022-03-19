package br.com.generation.exercicios;

import java.util.Scanner;

/*	(Exercicio de Array)
 * 4. Crie um programa que receba valores do usuário para preencher uma matriz
 * 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da
 * primeira diagonal, ou seja, diagonal principal.
 */

public class questao04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] M1 = new int[3][3];
		int soma = 0, somaDiag = 0;

		System.out.println("#### Soma de todos os valores de uma matriz e soma da diagonal principal da matriz ####\n");
		
		System.out.println("Insira os valores da matriz M1. (Apenas valores inteiros):\n");

		for (int l = 0; l < M1.length; l++) {
			for (int c = 0; c < M1[l].length; c++) {
				System.out.printf("Entre com o valor da posição [%d][%d]: ", l, c);
				M1[l][c] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("\nMATRIZ M1:");
		for (int l = 0; l < M1.length; l++) {
			for (int c = 0; c < M1[l].length; c++) {

				System.out.print("[" + M1[l][c] + "]");

				soma += M1[l][c];

				if (l == c) {
					somaDiag += M1[l][c];
				}

			}
			System.out.println();
		}
		System.out.println("\nA soma de todos os valores da matriz é " + soma + ".");
		System.out.println("\nA soma dos valores da diagonal principal é " + somaDiag + ".");

		sc.close();
	}

}

/*
 * Exemplo de resultado mostrado no console: 
 * 
#### Soma de todos os valores de uma matriz e soma da diagonal principal da matriz ####

Insira os valores da matriz M1. (Apenas valores inteiros):

Entre com o valor da posição [0][0]: 7
Entre com o valor da posição [0][1]: 5
Entre com o valor da posição [0][2]: 6

Entre com o valor da posição [1][0]: 5
Entre com o valor da posição [1][1]: 6
Entre com o valor da posição [1][2]: 2

Entre com o valor da posição [2][0]: 3
Entre com o valor da posição [2][1]: 5
Entre com o valor da posição [2][2]: 4


MATRIZ M1:
[7][5][6]
[5][6][2]
[3][5][4]

A soma de todos os valores da matriz é 43.

A soma dos valores da diagonal principal é 17.
 * 
 **/
