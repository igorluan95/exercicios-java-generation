package br.com.generation.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/* (Exercicio de Laço de Decisão)
  
	 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.
	 
 */

public class questao04 {

	public static void main(String[] args) {
		
		DecimalFormat dec = new DecimalFormat("######.##");
		Scanner sc = new Scanner(System.in);
		int num;
		double raiz, potencia;

		System.out.print("#### Digita um número que o sistema retornará se ele é ímpar ou par.\nSe for ímpar também será apresentado o valor do número ao quadrado\ne se for par será apresentado o valor da raíz quadrada dele. ####");
		
		System.out.print("\n\nDigite um númeiro inteiro: ");
		num = sc.nextInt();

		if (num % 2 == 0) {

			if (num >= 0) {
				raiz = Math.sqrt(num);
				System.out.println("\nO número "+num+" é par e sua raiz quadrada é "+dec.format(raiz)+".");
				
			} else {
				System.out.println(
						"\nO número "+num+" não tem raiz definida, não existem dois números reais onde o produto seja um número negativo.");
			}

		} else {
			potencia = Math.pow(num, 2);
			System.out.println(
					"\nO número "+num+" é impar e quando elevado ao quadrado resulta em "+potencia+".");
		}
		sc.close();
	}

}


/* Exemplo de uma Saída do Console após executar o código:

#### Digita um número que o sistema retornará se ele é ímpar ou par.
Se for ímpar também será apresentado o valor do número ao quadrado
e se for par será apresentado o valor da raíz quadrada dele. ####

Digite um númeiro inteiro: -2

O número -2 não tem raiz definida, não existem dois números reais onde o produto seja um número negativo.


#### Digita um número que o sistema retornará se ele é ímpar ou par.
Se for ímpar também será apresentado o valor do número ao quadrado
e se for par será apresentado o valor da raíz quadrada dele. ####

Digite um númeiro inteiro: 3

O número 3 é impar e quando elevado ao quadrado resulta em 9.0.


* */