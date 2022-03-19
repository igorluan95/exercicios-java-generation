package br.com.generation.exercicios;

import java.util.Scanner;

public class questao05daintroducao {
	
	/*
	(Exercicio de Array)
	 5. Faça um sistema que leia as 3 notas
	 de um aluno e calcule a média final deste aluno. Considerar que a média é
	 ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
	 */


	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		double[] nota = new double[3];
		double media;
		double a = 2, b = 3, c = 5;

		System.out.println("#### Calculo da média ponderada. Insira notas no intervalo de 0 até 10 ####\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("Insira a " + (i + 1) + "ª nota: ");
			nota[i] = entrada.nextDouble();

			if (nota[i] < 0 || nota[i] > 10) {
				System.out.println("\nNota inválida, sistema encerrado.");
				break;
			}
		}

		media = ((nota[0] * a) + (nota[1] * b) + (nota[2] * c)) / (a + b + c);
		System.out.println("\nA média ponderada das notas inseridas é " + media);
		entrada.close();

	}

}

/*
Exemplo de uma Saída do Console após executar o código:

#### Calculo da média ponderada. Insira notas no intervalo de 0 até 10 ####

Insira a 1ª nota: 7
Insira a 2ª nota: 8
Insira a 3ª nota: 10

A média ponderada das notas inseridas é 8.8

*/
