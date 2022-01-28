package br.com.generation.VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] matriz = new int [3][3];
		int somaTotal=0, somaDiagonal=0, num;
		
		
		for (int l = 0; l<3; l++ ) {
			for(int c=0; c<3; c++) {
				System.out.print("Insira o valor localizado na posição ("+ l + ", " + c + "): ");
				matriz[l][c]= entrada.nextInt();
				
				somaTotal += matriz[l][c];	
				
				if (l==c) 
					somaDiagonal = somaDiagonal + matriz[l][c];
							
			}
					

			
		}
        System.out.println("\nMATRIZ:");
		for(int l=0; l <matriz.length; l++) {
			for(int c =0; c < matriz[l].length; c++) {
			
			System.out.print( "[ " + matriz[l][c]+ " ]");
		}
		System.out.println();
	}
		
		
		System.out.println("\nA soma dos valores da matriz é " +somaTotal +".");

		
		System.out.println("\nA soma dos valores da Diagonal Principal da matriz é "+ somaDiagonal+".");
		
		
		
		
		

	}

}
