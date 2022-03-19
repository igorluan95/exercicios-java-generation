package br.com.generation.exercicios;

import java.util.concurrent.ThreadLocalRandom;

/* (Exercicio de Array)
3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma
matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos
elementos de mesma posição das matrizes N1 e N2.
*/

public class questao03 {



	public static void main(String[] args) {

		// entrada de dados aleatorios(sorteio de valores)
		ThreadLocalRandom rd = ThreadLocalRandom.current();

		// declaração das matrizes
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];

		System.out.println("\n#### SOMA DE DUAS MATRIZES (4,6) ####\n ");
		
		System.out.println("---------------------------------------------");

		// entrada de valores aleatorios N1
		System.out.println("ENTRADAS DOS VALORES ALEATÓRIOS NA MATRIZ N1:\n");
		for (int l = 0; l < N1.length; l++) {
			for (int c = 0; c < N1[l].length; c++) {
				N1[l][c] = rd.nextInt(50, 60);
				System.out.printf("Valor da posição [%d][%d]: ", l, c);
				System.out.println(N1[l][c]);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");

		// entrada de valores aleatorios N2
		System.out.println("ENTRADAS DOS VALORES ALEATÓRIOS NA MATRIZ N2:\n");
		for (int l = 0; l < N2.length; l++) {
			for (int c = 0; c < N2[l].length; c++) {
				N2[l][c] = rd.nextInt(10, 39);
				System.out.printf("Valor da posição [%d][%d]: ", l, c);
				System.out.println(N2[l][c]);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");

		// Matriz N1
		System.out.println("MATRIZ N1:");
		for (int l = 0; l < N1.length; l++) {
			for (int c = 0; c < N1[l].length; c++) {
				System.out.print("[" + N1[l][c] + "]");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------------------");

		// Matriz N2
		System.out.println("MATRIZ N2:");
		for (int l = 0; l < N1.length; l++) {
			for (int c = 0; c < N1[l].length; c++) {
				System.out.print("[" + N2[l][c] + "]");
			}
			System.out.println();
		}
		
		// soma N1+N2=M1
		for (int l = 0; l < M1.length; l++) {
			for (int c = 0; c < M1[l].length; c++) {

				M1[l][c] = N1[l][c] + N2[l][c];		
			}
		}
		
		// subtração N1-N2=M2
		for(int l = 0; l<M2.length; l++) {
			for(int c = 0; c< M2[l].length;c++) {
				
				M2[l][c]=	N1[l][c]-N2[l][c];				
			}
		}		
		System.out.println("\n---------------------------------------------");

		// Matriz M1
		System.out.println("MATRIZ M1 (N1+N2):");
		for (int l = 0; l < M1.length; l++) {
			for (int c = 0; c < M1[l].length; c++) {
				System.out.print("[" + M1[l][c] + "]");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------------------");

		// Matriz M2
		System.out.println("MATRIZ M2 (N1-N2):");
		for (int l = 0; l < M2.length; l++) {
			for (int c = 0; c < M2[l].length; c++) {
				System.out.print("[" + M2[l][c] + "]");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------------------");
	}
}
 

/*Exemplo de resultado mostrado no console:

#### SOMA DE DUAS MATRIZES (4,6) ####
 
---------------------------------------------
ENTRADAS DOS VALORES ALEATÓRIOS NA MATRIZ N1:

Valor da posição [0][0]: 54
Valor da posição [0][1]: 56
Valor da posição [0][2]: 50
Valor da posição [0][3]: 53
Valor da posição [0][4]: 55
Valor da posição [0][5]: 58

Valor da posição [1][0]: 56
Valor da posição [1][1]: 55
Valor da posição [1][2]: 58
Valor da posição [1][3]: 52
Valor da posição [1][4]: 55
Valor da posição [1][5]: 58

Valor da posição [2][0]: 55
Valor da posição [2][1]: 59
Valor da posição [2][2]: 52
Valor da posição [2][3]: 55
Valor da posição [2][4]: 55
Valor da posição [2][5]: 58

Valor da posição [3][0]: 56
Valor da posição [3][1]: 54
Valor da posição [3][2]: 56
Valor da posição [3][3]: 55
Valor da posição [3][4]: 58
Valor da posição [3][5]: 54

---------------------------------------------
ENTRADAS DOS VALORES ALEATÓRIOS NA MATRIZ N2:

Valor da posição [0][0]: 31
Valor da posição [0][1]: 33
Valor da posição [0][2]: 33
Valor da posição [0][3]: 10
Valor da posição [0][4]: 17
Valor da posição [0][5]: 27

Valor da posição [1][0]: 31
Valor da posição [1][1]: 35
Valor da posição [1][2]: 26
Valor da posição [1][3]: 13
Valor da posição [1][4]: 10
Valor da posição [1][5]: 36

Valor da posição [2][0]: 30
Valor da posição [2][1]: 38
Valor da posição [2][2]: 21
Valor da posição [2][3]: 18
Valor da posição [2][4]: 35
Valor da posição [2][5]: 21

Valor da posição [3][0]: 25
Valor da posição [3][1]: 38
Valor da posição [3][2]: 20
Valor da posição [3][3]: 21
Valor da posição [3][4]: 18
Valor da posição [3][5]: 33

---------------------------------------------
MATRIZ N1:
[54][56][50][53][55][58]
[56][55][58][52][55][58]
[55][59][52][55][55][58]
[56][54][56][55][58][54]

---------------------------------------------
MATRIZ N2:
[31][33][33][10][17][27]
[31][35][26][13][10][36]
[30][38][21][18][35][21]
[25][38][20][21][18][33]

---------------------------------------------
MATRIZ M1 (N1+N2):
[85][89][83][63][72][85]
[87][90][84][65][65][94]
[85][97][73][73][90][79]
[81][92][76][76][76][87]

---------------------------------------------
MATRIZ M2 (N1-N2):
[23][23][17][43][38][31]
[25][20][32][39][45][22]
[25][21][31][37][20][37]
[31][16][36][34][40][21]

---------------------------------------------
*/




