package br.com.generation.exercicios;

import java.util.Scanner;

/* (Exercicio de Repetição)
 * 5- Crie um programa que leia um número do teclado até que encontre um número 
igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/

public class questao05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, soma = 0, i = 0;

		System.out.println(
				"#### Insira números inteiros, após o número 0 ser digitado o programa apresenta a soma dos números inseridos. #### \n");

		do {
			System.out.print("Insira o " + (i + 1) + "º número: ");
			num = sc.nextInt();
			soma += num;
			i++;
		} while (num != 0);

		System.out.println("\nO número 0 encerrou o programa. A soma dos números digitados é " + soma + ".");

		sc.close();
	}

}

/* Exemplo de saída do Console após executar o código:
#### Insira números inteiros, após o número 0 ser digitado o programa apresenta a soma dos números inseridos. #### 

	Insira o 1º número: 1
	Insira o 2º número: 2
	Insira o 3º número: 3
	Insira o 4º número: 0
	
	O número 0 encerrou o programa. A soma dos números digitados é 6.


*/
