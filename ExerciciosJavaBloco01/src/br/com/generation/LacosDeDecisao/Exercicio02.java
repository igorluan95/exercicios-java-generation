package br.com.generation.LacosDeDecisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, menor, meio=0, maior;
		
		System.out.println("Entre com o 1º número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Entre com o 2º número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Entre com o 3º número: ");
		num3 = entrada.nextInt();
		
		/////////////////////////////////////// maior
		
		if (num1>num2){
			if(num1>num3)
				maior=num1;
			else
				maior=num3;						
		}
		
		else {
			if (num2 > num3)
				maior = num2;
			else
				maior=num3;		
		
		///////////////////////////////////	menor
			
		}
		
		if (num1<num2) {
			if(num1<num3)
				menor=num1;
			else
				menor=num3;
		}
		
		else { 
			if(num2<num3)
				menor=num2;
			else
				menor=num3;		
				
		}
		
		/////////////////////////////// meio
		
		if ((num1==maior||num1==menor) && (num3==maior||num3==menor))
			meio = num2;
		
		if ((num2==maior||num2==menor) && (num3==maior||num3==menor))
			meio = num1;
		
		if ((num1==maior||num1==menor) && (num2==maior||num2==menor))
			meio = num3;
				
	
		System.out.println("\nA ordem cresceste dos números digitados é: " + menor + " , " + meio + " , " + maior);
		
		entrada.close();
		
		}
		
		
		
		
		

	}