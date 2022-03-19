package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao07daintroducao {
	/*
	 (Exercicio de Programação Sequencial)
	 
	 7. Um sistema de equações lineares do tipo ax + by = c e dx +ey = f 
	 pode ser resolvido segundo mostrado abaixo: 
	 x=[(ce-bf)/(ae-bd)] e y = [(af-cd)/(ae/bd)]
	 Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
	 e calcula e mostra os  valores de x e y*/


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("######.####");

		// variáveis

		double x, y;
		double[] vetor = new double[6];
		String[] coef = { "a", "b", "c", "d", "e", "f" };

		// valores de entrada das variáveis

		System.out.println("#### Sistema de equações linerares: ####\n");

		for (int i = 0; i < 6; i++) {
			System.out.print("Entre com o valor do coeficiente " + coef[i] + ": ");
			vetor[i] = sc.nextDouble();

		}

		if ((vetor[0] * vetor[4]) - (vetor[1] * vetor[3]) == 0) {
			System.out.println("X e Y possuem valores indefinidos pois possuem denominador igual a zero.");
		}

		else {
			x = ((vetor[2] * vetor[4]) - (vetor[1] * vetor[5])) / ((vetor[0] * vetor[4]) - (vetor[1] * vetor[3]));
			y = ((vetor[0] * vetor[5]) - (vetor[2] * vetor[3])) / ((vetor[0] * vetor[4]) - (vetor[1] * vetor[3]));
			System.out.println("\nPortanto, x = " + dec.format(x) + " e y = " + dec.format(y));
		}

		System.out.println();

		sc.close();
	}

}

/*
Exemplo de uma Saída do Console após executar o código:

#### Sistema de equações linerares: ####

Entre com o valor do coeficiente a: 50
Entre com o valor do coeficiente b: 60
Entre com o valor do coeficiente c: 90
Entre com o valor do coeficiente d: 80
Entre com o valor do coeficiente e: 2
Entre com o valor do coeficiente f: 2

Portanto, x = -0,0128 e y = 1,5106
*/