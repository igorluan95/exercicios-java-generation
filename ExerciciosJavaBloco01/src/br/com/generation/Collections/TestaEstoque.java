package br.com.generation.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList <ProdutoNoEstoque> estoque = new ArrayList<>();
		
		
		
		System.out.print("Insira quantos produtos deseja adicionar no Estoque: ");
		int qtdProdutos = entrada.nextInt();
	
		for(int i=0; i<qtdProdutos; i++) {
			int codigo = i;
			System.out.print("\nInsira o nome do "+(i+1)+"º produto: ");
			String nome = entrada.next();
			System.out.print("Insira a quantidade adicionada em Kg do "+(i+1)+"º produto: ");
			double quantidade = entrada.nextDouble();
			
			estoque.add(new ProdutoNoEstoque(codigo, nome, quantidade));
		}
		
		System.out.println("\nLISTA DO ESTOQUE:");
		
		for (ProdutoNoEstoque i :estoque) {
			System.out.println(i);
		}
		
		if(qtdProdutos>0) {
		System.out.print("\nDigitou algum item erro e deseja remover algum produto da lista? (Digite 1 para sim | Digite 2 para não) ");
		int sn = entrada.nextInt();
		
		
		if (sn==1) {
			System.out.println("\nInsira o código do item que deseja remover:");
			int codRem = entrada.nextInt();
			estoque.remove(codRem);
			
			System.out.println("\nLISTA DO ESTOQUE ATUALIZADA:");
			for (ProdutoNoEstoque i :estoque) {
				System.out.println(i);
			}
		}
		
		else {
			System.out.println("\nSistema finalizado!");
		}
		}
		entrada.close();
		
		

	}

}
