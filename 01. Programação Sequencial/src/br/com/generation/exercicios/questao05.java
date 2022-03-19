package br.com.generation.exercicios;

import java.util.Scanner;

/*
(Exercicio de Programação Sequencial)

	5. Faça um sistema que leia as 3 notas
	de um aluno e calcule a média final deste aluno. Considerar que a média é
	ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
	*/


public class questao05 {


	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);

		double A, B, C, media;
		double a = 2, b = 3, c = 5;

		System.out.println("#### Calculo da média ponderada. Insira notas no intervalo de 0 até 10 ####\n ");

		System.out.print("Insira a  1ª nota: ");
		A = sc.nextDouble();
		System.out.print("Insira a  2ª nota: ");
		B = sc.nextDouble();
		System.out.print("Insira a  3ª nota: ");
		C = sc.nextDouble();

		media = ((A * a) + (B * b) + (C * c)) / (a + b + c);

		if (A < 0 || A > 10 || B < 0 || B > 10 || C < 0 || C > 10) {
			System.out.println("\nSistema encerrado, insira notas de 0 até 10 e tente novamente.");

		}

		else

			System.out.printf("\nA média ponderada das notas inseridas é %.1f ", media);

		sc.close();

	}

}

/*
 Exemplo de uma Saída do Console após executar o código:
 
#### Calculo da média ponderada. Insira notas no intervalo de 0 até 10 ####
 
 Insira a 1ª nota: 7
 Insira a 2ª nota: 8
 Insira a 3ª nota: 9
 
 A média ponderada das notas inseridas é 8,3
 */
