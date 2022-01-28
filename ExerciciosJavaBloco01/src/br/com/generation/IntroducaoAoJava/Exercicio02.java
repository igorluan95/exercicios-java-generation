package br.com.generation.IntroducaoAoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int segundosTotais, horas, minutos, segundos;
		
		
		System.out.println("Entre como tempo de duração do evento em segundos:");
		segundosTotais = entrada.nextInt();
		
		if (segundosTotais<0){
			System.out.println("\nValor inválido, entre com um novo valor.");
			
		}
		
		else {
		
		horas = segundosTotais/3600;
		
		minutos = (segundosTotais % 3600) / 60;
		
		segundos = (segundosTotais % 3600)  % 60;
		
		
		System.out.println("\n" + segundosTotais + " segundos são " + horas + " horas " + minutos + " minutos e " + segundos + " segundos.");
		
		
		}
		
		
		
		
		

	}

}