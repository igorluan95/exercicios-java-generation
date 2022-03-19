package br.com.generation.exercicios;

import java.util.Scanner;

/* (Exercicio de Programação Sequencial)

	6. Construa um programa em JAVA que, tendo como dados de entrada dois pontos 
	quaisquer no plano, P1(x1, y1) e P2(x2, y2), escreva a distância entre eles. A fórmula 
	que efetua tal cálculo é: d= raiz [(x2-x1)²+(y2-y1)²]  */

public class questao06 {
	

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d, resX, resY;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("#### Calculo da distância entre dois pontos quaisquer no plano. ####\n");
		
		System.out.print("Entre com x1 do ponto P1: ");
		x1=sc.nextDouble();
		System.out.print("Entre com y1 do ponto P1: ");
		y1=sc.nextDouble();
		
		System.out.print("\nEntre com x2 do ponto P2: ");
		x2=sc.nextDouble();
		System.out.print("Entre com y2 do ponto P2: ");
		y2=sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Ponto inseridos: P1("+x1+", "+y1+") e P2("+x2+", "+y2+")");
		
		resX= Math.pow((x2-x1),2);
		resY= Math.pow((y2-y1),2);
		
		d= Math.sqrt((resX+resY));
		// sem arredondar: System.out.println("\nA distância entre P1 e P2 é "+d);
		
		System.out.printf("\nA distância entre P1 e P2 é %.2f " , d);
		// ou System.out.printf("\nA distância entre P1 e P2 é " + new DecimalFormat (".##").format(d));
		
		sc.close();
		
	}
	
}


/*
Exemplo de uma Saída do Console após executar o código:

#### Calculo da distância entre dois pontos quaisquer no plano. ####

Entre com x1 do ponto P1: 10
Entre com y1 do ponto P1: 50

Entre com x2 do ponto P2: 20
Entre com y2 do ponto P2: 25

Ponto inseridos: P1(10.0, 50.0) e P2(20.0, 25.0)

A distância entre P1 e P2 é 26,93 
*/