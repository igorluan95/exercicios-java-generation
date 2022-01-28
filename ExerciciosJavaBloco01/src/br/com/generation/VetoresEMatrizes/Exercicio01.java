package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner (System.in);
		
		int[] pontuacao = new int [5];
		int maiorPont=0;
		
		for( int i = 0 ; i<5; i++ ){
			System.out.println("Entre com a nota do "+ (i+1) + "º exercício: ");
			pontuacao[i] = entrada.nextInt();
			
			
		     if (pontuacao[i]>=0)
			
						if (pontuacao[i]>maiorPont) {
								maiorPont=pontuacao[i];
									}			
							}
							System.out.print("\nAs notas inseridas foram ");
							for( int i = 0 ; i<4; i++ ) {
								System.out.print(pontuacao[i]+", ");
							}
							
							System.out.print("e "+ pontuacao[4]+ ". \n\nA maior nota inserida foi "+ maiorPont +".");
							
		
		
		

	}

}
