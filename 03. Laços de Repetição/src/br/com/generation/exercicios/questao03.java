package br.com.generation.exercicios;

import java.util.Scanner;

/*(Exercicio de Repetição)
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 
	anos. Total de pessoas com mais de 50 anos. O programa termina quando idade 
	for =-99. */

public class questao03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = 0, menos21 = 0, mais50 = 0;

		System.out.println("#### Entre com a idade de várias pessoas e o programa retorna quantas pessoas tem menos"
				+ " de 21 anos \ne quantas pessoas tem mais de 50 anos. (Para encerrar o programa insira a idade -99) \n");

		while (idade != -99) {
			System.out.print("Insira uma idade válida: ");
			idade = sc.nextInt();
			if (idade < 0 && idade != -99) {
				System.out.println("Idade inválida, essa idade não entrará para a contagem das idades.");
			}

			else if (idade >= 0 && idade < 21) {
				menos21 += 1;
			} else if (idade > 50) {
				mais50 += 1;
			} else if (idade == -99) {
				System.out.println("\n(-99 não entrará para a contagem das idades, programa finalizado.)\n ");
			}

		}
		System.out.println("Número de pessoas com menos de 21 anos: " + menos21
				+ "\nNúmero de pessoas com mais de 50 anos: " + mais50);
		sc.close();
	}

}

/*
Exemplo de saída do Console após executar o código:

#### Entre com a idade de várias pessoas e o programa retorna quantas pessoas tem menos de 21 anos 
e quantas pessoas tem mais de 50 anos. (Para encerrar o programa insira a idade -99) 

Insira uma idade válida: -5
Idade inválida, essa idade não entrará para a contagem das idades.
Insira uma idade: 15
Insira uma idade: 55
Insira uma idade: -99

(-99 não entrará para a contagem das idades, programa finalizado.)
 
Número de pessoas com menos de 21 anos: 1
Número de pessoas com mais de 50 anos: 1

*/
