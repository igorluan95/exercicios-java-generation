package br.com.generation.exercicios;

import java.util.Scanner;


/*/* # (Exercicio de Repetição)
 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

public class questao02 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, qtdPar = 0, qtdImpar = 0;

		System.out.println("#### Insira 10 números para programa retornar quantos são pares e quantos são ímpares. ####\n");

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i + 1) + "º número: ");
			num = sc.nextInt();

			if (num % 2 == 0) {
				qtdPar += 1;
			} else {
				qtdImpar += 1;
			}
		}
		System.out.println("\nDos números inseridos " + qtdPar + " são pares e " + qtdImpar + " são ímpares.");
		sc.close();
	}

}

/*
Exemplo de saída do Console após executar o código:

#### Insira 10 números para programa retornar quantos são pares e quantos são ímpares. ####
		
		Insira o 1º número: 1
		Insira o 2º número: 2
		Insira o 3º número: 3
		Insira o 4º número: 4
		Insira o 5º número: 5
		Insira o 6º número: 6
		Insira o 7º número: 7
		Insira o 8º número: 8
		Insira o 9º número: 9
		Insira o 10º número: 10
		
		Dos números inseridos 5 são pares e 5 são ímpares.

*/
