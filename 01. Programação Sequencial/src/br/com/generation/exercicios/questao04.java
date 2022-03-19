package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;


/* (Exercicio de Programação Sequencial)
	 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	 calcule a seguinte expressão: D=[(R+S)/2], onde R=(A+B)² e S=(B+C)²
	 */

public class questao04 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("######.##");

		double D, R, S;
		int A, B, C;
		System.out.println(
				"#### Sistema para calcular a expressão: D=[(R+S)/2], onde R=(A+B)² e S=(B+C)². #### \n(Esse sistema só aceita números inteiros e positivos.)\n");

		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();

		if (A < 0 || B < 0 || C < 0) {
			System.out.println("\nSistema encerrado, esse sistema só aceita números inteiros e positivos.");
		}
		if (A > 0 && B > 0 && C > 0) {
			R = (int) Math.pow((A + B), 2);
			S = (int) Math.pow((B + C), 2);
			D = (R + S) / 2;
			System.out.println("\nD = " + dec.format(D));

			sc.close();
		}

	}

}

/*
Exemplo de uma Saída do Console após executar o código:
		  
#### Sistema para calcular a expressão: D=[(R+S)/2], onde R=(A+B)² e S=(B+C)². #### 
(Esse sistema só aceita números inteiros e positivos.)

Digite o valor de A: 5
Digite o valor de B: 15
Digite o valor de C: 30

D = 1212,5
 */
