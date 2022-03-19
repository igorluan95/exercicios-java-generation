package br.com.generation.exercicios;

import java.util.Scanner;

public class questao07 {
	/*
	 (Exercicio de Programação Sequencial)
	 
	 7. Um sistema de equações lineares do tipo ax + by = c e dx +ey = f pode ser resolvido segundo mostrado abaixo: 
	 x=[(ce-bf)/(ae-bd)] e y = [(af-cd)/(ae/bd)]. Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
	 e calcula e mostra os  valores de x e y*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// variáveis

		double a, b, c, d, e, f, x, y;

		// valores de entrada das variáveis

		System.out.println("#### Sistema de equações linerares: ####\n");
		System.out.print("Entre com o valor do coeficiente a: ");
		a = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente b: ");
		b = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente c: ");
		c = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente d: ");
		d = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente e: ");
		e = sc.nextDouble();
		System.out.print("Entre com o valor do coeficiente f: ");
		f = sc.nextDouble();

		///// cálculo e impressão dos valores de x e y

		if ((a * e) - (b * d) == 0) {
			System.out.println("X e Y possuem valores indefinidos pois o denominador da equação é zero.");
		}

		else {
			x = ((c * e) - (b * f)) / ((a * e) - (b * d));
			y = ((a * f) - (c * d)) / ((a * e) - (b * d));
			System.out.println("\nPortanto, x = " + x + " e y = " + y);
		}

		System.out.println();

		sc.close();
	}

}

/*
Exemplo de uma Saída do Console após executar o código:

	#### Calculo da média ponderada. Insira notas no intervalo de 0 até 10 ####
	
	Insira a 1ª nota: 7
	Insira a 2ª nota: 8
	Insira a 3ª nota: 9
	
	A média ponderada das notas inseridas é 8,3
	*/
