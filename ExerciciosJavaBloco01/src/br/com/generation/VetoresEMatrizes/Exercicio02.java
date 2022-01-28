package br.com.generation.VetoresEMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int soma=0, maiorValor=0, ocor=0;
		double media=0;
		
		int[] numeros = new int [11];
		
		Random sorteio = new Random();
		
		System.out.println("Um dado é lançado 10 vezes: ");
		System.out.println();
		
		for (int i = 1 ; i<11; i++ ) {
			numeros[i] = sorteio.nextInt(6)+1;         // (6)+1 sorteio de numeros de 1 ate 6
			System.out.println((i) + "º lançamento: " + numeros[i] );
			
			soma+=numeros[i];
			
				if(numeros[i]>maiorValor) {
				maiorValor=numeros[i];
				ocor=1;
				}
			
				else if (maiorValor==numeros[i]) {
				ocor++;				
				}
			
		}
		
		System.out.println("\nA média aritmética dos valores que apareceram nos lançamentos é "+soma/10+".");
		
				
		if(ocor<2) {
			System.out.println("\nO maior valor que apareceu foi "+ maiorValor +" e esse valor apareceu " + ocor+ " vez.\n");
		}
		else if(ocor>1) {
			System.out.println("\nO maior valor que apareceu foi "+ maiorValor +" e esse valor apareceu " + (ocor)+ " vezes.\n");
		 
		}
		
		
		
	}

}
