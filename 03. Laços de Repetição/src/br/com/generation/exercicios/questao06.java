package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * (Exercicio de Repetição)
 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
 * final imprimir a média dos números múltiplos de 3. Para sair digitar
 * 0(zero).(
 */

public class questao06 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		
		int num, i = 0;
		double media, soma=0, qtd=0;

		System.out.println("#### Média dos números inteiros múltiplos de 3 que foram inseridos.####\n  (Para encerrar o programa e obter o resultado insire o número 0.) \n");

		do {
			System.out.print("Insira o " + (i+1) + "º número: ");
			num = sc.nextInt();

			if (num % 3 == 0) {
				soma += num;
				qtd++;
				i++;
			}
			else {
				i++;
			}
						
		} while (num != 0); 
		
		media=(soma/(qtd-1)); 
		
		System.out.println("\nA média dos números múltiplos de 3 inseridos é " + df.format(media) +".") ;

		sc.close();

	}

}

/*
 * 
/* Exemplo de saída do Console após executar o código:
#### Média dos números inteiros múltiplos de 3 que foram inseridos.####
  (Para encerrar o programa e obter o resultado insire o número 0.) 

	Insira o 1º número: 2
	Insira o 2º número: 4
	Insira o 3º número: 3
	Insira o 4º número: 3
	Insira o 5º número: 0

A média dos números múltiplos de 3 inseridos é 3.



*/
