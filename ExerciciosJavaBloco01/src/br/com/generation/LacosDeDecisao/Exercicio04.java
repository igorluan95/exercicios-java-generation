package br.com.generation.LacosDeDecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		int num;
		double raiz, potencia; 
		
		System.out.println("Digite um númeiro inteiro: ");
		num = entrada.nextInt();
		
		if(num % 2 ==0) {
			
			if(num>=0) {
				System.out.println("Número par.");
				raiz = Math.sqrt(num);
				System.out.println("Raiz quadrada: " + raiz);
			}
			else {
				System.out.println("Número par negativo sem raiz definida pois não existem dois números reais onde o produto seja um número negativo.");
			}
										
		}
		else {
			System.out.println("Ímpar");
			potencia = Math.pow(num,2);
			System.out.println("Potência: " + potencia);
		}
		
		
		
		
		
		
		

	}

}
