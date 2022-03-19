package br.com.generation.exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

/*(Exercicio de Orientação a Objetos)
 * 
 * 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class TestarFuncionario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		Funcionario f1 = new Funcionario();
		

		System.out.println("#### Consulta de funcionários ####\n");

		System.out.println("Insira o nome: ");
		f1.setNome(input.nextLine());

		System.out.println("Insira o CPF: ");
		f1.setCpf(input.nextLine());

		System.out.println("Insira o cargo: ");
		f1.setCargo(input.nextLine());

		System.out.println("Insira o salário: ");
		f1.setSalario(input.nextDouble());

		f1.processar();

		System.out.println("Nome: " + f1.getNome());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Salário: R$ " + df.format(f1.getSalario()));
		
		f1.concluir();

		input.close();
	}
	
	
}

/*
 * 
 * Exemplo de uma Saída do Console após executar o código:
 * 
	#### Consulta de funcionários ####
	
				Insira o nome: 
				Amanda Araújo
				Insira o CPF: 
				123.456.789-43
				Insira o cargo: 
				Desenvolvedora Jr.
				Insira o salário: 
				3500
				
				Dados processados...
				
				Nome: Amanda Araújo
				CPF: 123.456.789-43
				Cargo: Desenvolvedora Jr.
				Salário: R$3.500,00
				
				Consulta concluída!

 * 
 * 
 */
