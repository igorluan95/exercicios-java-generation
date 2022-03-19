package br.com.generation.exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * (Exercicio de Array) 2. Um dado é lançado 10 vezes e o valor correspondente é
 * anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse
 * vetor. A seguir determine e imprima a média aritmética dos lançamentos,
 * contabilize e apresente também quantas foram as ocorrências da maior
 * pontuação.
 */

public class questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);

		System.out.println(
				"#### Lançamento automático de um dado, média dos valores que aparecem, qual maior valor apareceu e quantas vezes ele apareceu. ####\n");

		int[] num = new int[10];
		double soma = 0, media = 0;
		int qtd = 0, maior = 0;

		for (int i = 0; i < 10; i++) {
			num[i] = rd.nextInt(1, 7);

			soma += num[i];
			media = (soma) / (i + 1);

			if (num[i] > maior) {
				maior = num[i];
				qtd = 1;
			} else if (num[i] == maior) {
				qtd++;
			}

			System.out.println("Valor no " + (i + 1) + "º lançamento: " + num[i]);

		}
		if (qtd == 1) {
			System.out.println("\nA média dos valores dos lançamentos foi " + numberFormat.format(media)
					+ ".\nO maior número que apareceu foi o " + maior + " e ele apareceu " + qtd + " vez.");
		} else {
			System.out.println("\nA média dos valores dos lançamentos foi " + numberFormat.format(media)
					+ ".\nO maior número que apareceu foi o " + maior + " e ele apareceu " + qtd + " vezes.");

		}
		sc.close();
	}

}

/*
 * /* #### Lançamento automático de um dado, média dos valores que aparecem,
 * qual maior valor apareceu e quantas vezes ele apareceu. ####
 * 
 * Valor no 1º lançamento: 6 Valor no 2º lançamento: 6 Valor no 3º lançamento: 5
 * Valor no 4º lançamento: 4 Valor no 5º lançamento: 6 Valor no 6º lançamento: 1
 * Valor no 7º lançamento: 3 Valor no 8º lançamento: 6 Valor no 9º lançamento: 3
 * Valor no 10º lançamento: 3
 * 
 * A média dos valores dos lançamentos foi 4,3. O maior número que apareceu foi
 * o 6 e ele apareceu 4 vezes.
 * 
 * 
 * 
 * 
 */
