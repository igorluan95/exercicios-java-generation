package br.com.generation.exercicios;

import java.util.Scanner;


/*  4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos
  de uma região. Para tanto, a cada uma das pessoas 
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 
pessoas, calcule e mostre: (WHILE)
	• o número de pessoas calmas
	• o número de mulheres nervosas
	• o número de homens agressivos
	• o número de outros calmos
	• o número de pessoas nervosas com mais de 40 anos
	• o número de pessoas calmas com menos de 18 anos
	*/

public class questao04 {

	public static void main(String[] args) {

		int idade=0, sexo, psi, qtdDados = 0, i = 0;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
		int outrosCalmos = 0, pessoasNervosas40 = 0, pessoasCalmas18 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("#### CARACTERÍSTICAS PSICOLÓGICAS DA EMPRESA ####");
		System.out.println(
				"\n(Para serem contabilizados, os dados devem ser preenchidos com números inteiros e devem respeitar as opções.)\n");

		System.out.print("Insira a quantidade de pessoas que terão dados coletados (Valor máximo 150): ");
		qtdDados = sc.nextInt();
		if (qtdDados > 150) {
			qtdDados = 150;
			System.out.println("A quantidade máxima foi excedida, o sistema aceitará 150 dados.");
		}

		while (i < qtdDados && idade >=0 && idade <=130) {
			System.out.println("\nDados da " + (i + 1) + "ª pessoa:");
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Sexo (1-feminino, 2-masculino, 3-outros): ");
			sexo = sc.nextInt();
			System.out.print("Característica psicológica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): ");
			psi = sc.nextInt();

			if (psi == 1) {
				pessoasCalmas++;
			}
			if (sexo == 1 && psi == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && psi == 3) {
				homensAgressivos++;
			}
			if (sexo == 3 && psi == 1) {
				outrosCalmos++;
			}
			if (idade > 40 && psi == 2) {
				pessoasNervosas40++;
			}
			if (idade < 18 && psi == 1) {
				pessoasCalmas18++;
			}
			i++;
		}

		if (qtdDados <= 0) {
			System.out.println("\nSistema encerrado, a quantidade mínima para coleta de dados é 1.");
		}
		if (idade <0 || idade >130) {
			System.out.println("\nSistema encerrado, a idade é inválida e impossível continuar. A idade precisa ser entre entre 0 e 130.");
		}

		else {
			System.out.println();
			System.out.println("Resultados:");
			System.out.println("Número de pessoas calmas: " + pessoasCalmas);
			System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
			System.out.println("Número de homens agressivos: " + homensAgressivos);
			System.out.println("Número de outros calmos: " + outrosCalmos);
			System.out.println("Número de pessoas nervosas com mais de 40 anos: " + pessoasNervosas40);
			System.out.println("Número de pessoas calmas com menos de 18 anos: " + pessoasCalmas18);
		}

		sc.close();
	}
}


/*
Exemplo de saída do Console após executar o código:

#### CARACTERÍSTICAS PSICOLÓGICAS DA EMPRESA ####

		(Para serem contabilizados, os dados devem ser preenchidos com números inteiros e devem respeitar as opções.)
		
		Insira a quantidade de pessoas que terão dados coletados (Valor máximo 150): 4
		
		Dados da 1ª pessoa:
		Idade: 15
		Sexo (1-feminino, 2-masculino, 3-outros): 1
		Característica psicológica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 1
		
		Dados da 2ª pessoa:
		Idade: 55
		Sexo (1-feminino, 2-masculino, 3-outros): 3
		Característica psicológica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 2
		
		Dados da 3ª pessoa:
		Idade: 50
		Sexo (1-feminino, 2-masculino, 3-outros): 3
		Característica psicológica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 1
		
		Dados da 4ª pessoa:
		Idade: 20
		Sexo (1-feminino, 2-masculino, 3-outros): 2
		Característica psicológica ( 1-pessoa calma, 2-pessoa nervosa, 3-pessoa agressiva): 3
		
		Resultados:
		Número de pessoas calmas: 2
		Número de mulheres nervosas: 0
		Número de homens agressivos: 1
		Número de outros calmos: 1
		Número de pessoas nervosas com mais de 40 anos: 1
		Número de pessoas calmas com menos de 18 anos: 1

*/