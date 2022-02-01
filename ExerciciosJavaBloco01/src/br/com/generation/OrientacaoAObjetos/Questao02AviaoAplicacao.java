package br.com.generation.OrientacaoAObjetos;

import java.util.Scanner;

public class Questao02AviaoAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		Questao02Aviao a1 = new Questao02Aviao();
		
		a1.fabricante = "Embraer";
		a1.modelo = "E-195";
		a1.uso = "Comercial";
		a1.qtdPassageiros = 124;
		a1.velocidade=0;
		
		
		System.out.println("Fabricante: "+a1.fabricante);
		System.out.println("Modelo: "+a1.modelo);
		System.out.println("Tipo de uso: "+a1.uso);
		System.out.println("Quantidade máxima de passageiros: "+a1.qtdPassageiros);
		
		

		System.out.println();
		
		a1.levantarVoo(280);
		System.out.println("Velocidade minima para decolar: " + a1.velocidade + "Km/h");
		
		a1.acelerar(610);
		System.out.println("Velocidade máxima atingida: " + a1.velocidade + "Km/h");		
		
		
		entrada.close();

	}
		
}
