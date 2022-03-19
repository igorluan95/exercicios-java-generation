package br.com.generation.exercicios;

import java.util.Scanner;

/*(Exercicio de Array)
 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

public class questao01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] nota = new double[5];
		double maior = 0;

		System.out.println(
				"#### Leitura de 5 valores de notas e apresentação da maior nota.#### \n     (Insira valores dentro do intervalo de 0 a 10)\n");

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o valor da " + (i + 1) + "ª nota: ");
			nota[i] = sc.nextDouble();

			if (nota[i] < 0 || nota[i] > 10) {
				System.out.println("\nNota inválida. Insira uma nota dentro do intervalo de 0 a 10.\n");
				i--;
			} else if (nota[i] > maior) {
				maior = nota[i];
			}

		}
		System.out.printf("\nA maior nota inserida foi a nota " + maior);

		sc.close();
	}

}

/*
 * /* Exemplo de saída do Console após executar o código: 
 * 
#### Leitura de 5 valores de notas e apresentação da maior nota.#### 
     (Insira valores dentro do intervalo de 0 a 10)

Insira o valor da 1ª nota: 5
Insira o valor da 2ª nota: 7
Insira o valor da 3ª nota: -5

Nota inválida. Insira uma nota dentro do intervalo de 0 a 10.

Insira o valor da 3ª nota: 10
Insira o valor da 4ª nota: 7
Insira o valor da 5ª nota: 7

A maior nota inserida foi a nota 10.0
 * 
 * 
 * 
 */
