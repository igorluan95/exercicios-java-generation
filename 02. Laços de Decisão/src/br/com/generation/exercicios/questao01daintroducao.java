package br.com.generation.exercicios;

import java.util.Scanner;


/*		(Exercicio de Programação Sequencial e Laço de Decisão)
 * 
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

public class questao01daintroducao {

	public static void main(String[] args) {

		int TotalDiasNoAno = 365;
		int TotalDiasNoMes = 30;
		int dias, meses, anos;
		Scanner sc = new Scanner(System.in);

		System.out.println("##### Idade de uma pessoa expressa em dias ##### \n");

		System.out.print("Insira quantos anos completos a pessoa tem: ");
		anos = sc.nextShort();

		if (anos >= 0 && anos <= 130) {

			System.out.print("Insira quantos meses completos se passaram após o aniversário da pessoa: ");
			;
			meses = sc.nextShort();

			if (meses >= 0 && meses <= 12) {
				System.out.print("Insira quantos dias se passaram após o último mês completo citado anteriormente: ");
				dias = sc.nextShort();

				if (dias >= 0 && dias <= 30) {
					dias += (TotalDiasNoAno * anos) + (TotalDiasNoMes * meses);

					System.out.println("\nA pessoa tem " + dias + " dias de idade!");
				}

				else
					System.out.println("\nValor inválido, esse campo só permite valores entre 0 e 30.");

			}

			else
				System.out.println("\nValor inválido, esse campo só permite valores entre 0 e 12.");

		}

		else
			System.out.println("\nValor inválido, esse campo só permite valores entre 0 e 130.");

		sc.close();

	}

}

/*
 * Exemplo de uma Saída do Console após executar o código:
 * 
		 * 
		 * ##### Idade de uma pessoa expressa em dias #####
		 * 
		 * Insira quantos anos completos a pessoa tem: 1 Insira quantos meses completos
		 * se passaram após o aniversário da pessoa: 0 Insira quantos dias se passaram
		 * após o último mês completo citado anteriormente: 1
		 * 
		 * A pessoa tem 366 dias de idade!
		 * 
		 * 
		 * ##### Idade de uma pessoa expressa em dias ##### 

			Insira quantos anos completos a pessoa tem: 1
			Insira quantos meses completos se passaram após o aniversário da pessoa: -1
			
			Valor inválido, esse campo só permite valores entre 0 e 12.
			 * 
 * 
 */


