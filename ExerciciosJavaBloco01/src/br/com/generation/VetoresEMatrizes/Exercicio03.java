package br.com.generation.VetoresEMatrizes;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada  = new Scanner (System.in);	
		ThreadLocalRandom sorteio = ThreadLocalRandom.current(); /// fazer o sorteio de numeros aleatorios em um intervalo especifico
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		
		System.out.println();
		System.out.println("Valores de entrada da Matriz N1: ");
		
		///////////////////////////////////////////////////////////////
		
		System.out.println();
		
		for(int l=0; l <N1.length; l++) {
			for(int c =0; c < N1[l].length; c++) {
				                                                           
				N1[l][c] = sorteio.nextInt(30,50 + 1) ;
				System.out.printf("Valor da posição [%d][%d]: " , l,c);
				System.out.println(N1[l][c]);                                  
				                                                                           
					}
				System.out.println();
		}

			
			
			////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("____________________________________\n");

			System.out.println("Valores de entrada da Matriz N2: ");
			System.out.println();			
			
			for(int l=0; l <N2.length; l++) {
				for(int c =0; c < N2[l].length; c++) {
					                                                         
					N2[l][c] = sorteio.nextInt(10,20 + 1) ;
					System.out.printf("Valor da posição [%d][%d]: " , l,c);
					System.out.println(N2[l][c]);                                  
					                                                                       
						}
					System.out.println();
			}
			

			System.out.println("____________________________________\n");
			
			
	         System.out.println("MATRIZ N1:");
			for(int l=0; l <N1.length; l++) {
				for(int c =0; c < N1[l].length; c++) {
				
				System.out.print( "[ " + N1[l][c]+ " ]");
			}
			System.out.println();
		}
			System.out.println("____________________________________\n");
			

					System.out.println("MATRIZ N2:");

					for(int l=0; l <N1.length; l++) {
						for(int c =0; c < N2[l].length; c++) {
						
						System.out.print( "[ " + N2[l][c]+ " ]");
					}
					System.out.println();				
								
															
				}

					
					
				    for (int l = 0; l < M1.length; l++) {
				        for (int c = 0; c < M1[l].length; c ++) {

				            M1[l][c] = N1[l][c] + N2[l][c];
				        }
				    }
				    
				    for (int l = 0; l < M2.length; l++) {
				        for (int c = 0; c < M2[l].length; c ++) {

				            M2[l][c] = N1[l][c] - N2[l][c];
				        }
				    }
				////////////////////////////////////////////////////////////////////////////////


					System.out.println("____________________________________\n");

					
			         System.out.println("a) MATRIZ M1: (matriz com as somas dos elementos de mesma posição das matrizes N1 e N2)");
					for(int l=0; l <M1.length; l++) {
						for(int c =0; c < M1[l].length; c++) {
						
						System.out.print( "[ " + M1[l][c]+ " ]");
					}
					System.out.println();
				}
			
				System.out.println();
					
							System.out.println("b) MATRIZ M2: (matriz com a subtração dos elementos de mesma posição das matrizes N1 e N2)");

							for(int l=0; l <M2.length; l++) {
								for(int c =0; c < M2[l].length; c++) {
								
								System.out.print( "[ " + M2[l][c]+ " ]");
							}
							System.out.println();				
										
																	
						}
							System.out.println();
							System.out.println("____________________________________\n");
						

				

	}
				
}

