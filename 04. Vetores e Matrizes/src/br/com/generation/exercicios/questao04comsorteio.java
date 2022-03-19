package br.com.generation.exercicios;

import java.util.concurrent.ThreadLocalRandom;

/* (Exercicio de Array)
 * 
 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e 
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
diagonal, ou seja, diagonal principal.*/

public class questao04comsorteio {

	
	public static void main(String[] args) {
		
		ThreadLocalRandom rd = ThreadLocalRandom.current();
		
		int[][] M1 = new int[3][3];
		int soma=0, somaDiag=0;
		
		System.out.println("#### Soma de todos os valores de uma matriz e soma da diagonal principal da matriz ####");
		
		System.out.println("\nMATRIZ M1:");
		for(int l=0; l<M1.length;l++) {
			for(int c = 0; c<M1[l].length;c++){
				M1[l][c]=rd.nextInt(1,9);
				
						
				System.out.print("["+M1[l][c]+"]");
						
				soma+=M1[l][c];
				
				if(l==c) {
					somaDiag+=M1[l][c];
				}
							
			}
			System.out.println();	
		}
		System.out.println("\nA soma de todos os valores da matriz é "+soma+".");
		System.out.println("A soma dos valores da diagonal principal é "+somaDiag+".");
		
		
	}

}


/* Exemplo de resultado mostrado no console:
 
#### Soma de todos os valores de uma matriz e soma da diagonal principal da matriz ####
  
MATRIZ M1:
[7][7][6]
[2][6][8]
[5][3][2]

A soma de todos os valores da matriz é 46.

A soma dos valores da diagonal principal é 15.
*/
