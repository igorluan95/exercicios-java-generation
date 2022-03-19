package br.com.generation.exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


/*(Exercicio de Programação Sequencial)

8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao 
consumidor*/

public class questao08 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);

		// variáveis
		double custoFabrica, dist = 0.28, imp = 0.45, custoConsumidor;

		System.out.println(
				"#### Custo de fabricação de um carro e quanto o consumidor paga por causa do acréscimo do distribuidor e impostos sobre o carro: ####\n");

		// valor de entrada
		System.out.print("Entre com o custo de fábrica do carro: ");
		custoFabrica = sc.nextInt();

		if (custoFabrica > 0) {
			// cálculo
			custoConsumidor = ((custoFabrica * dist) + (custoFabrica * imp) + custoFabrica);
			System.out.println("\nO custo de fábrica do carro é " + moeda.format(custoFabrica)
					+ ". O preço que chega para o consumidor é " + moeda.format(custoConsumidor) + ".");
		} else {
			System.out.println("\nPreço inválido, digite um valor maior que zero.");
		}

		sc.close();
	}

}

/*
	Exemplo de uma Saída do Console após executar o código:
	
	#### Custo de fabricação de um carro e quanto o consumidor paga por causa do acréscimo do distribuidor e impostos sobre o carro: ####
	
	Entre com o custo de fábrica do carro: 32150
	
	O custo de fábrica do carro é R$ 32.150,00. O preço que chega para o consumidor é R$ 55.619,50.
	*/
