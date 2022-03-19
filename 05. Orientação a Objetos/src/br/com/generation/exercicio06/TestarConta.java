package br.com.generation.exercicio06;

import java.util.Scanner;

/*(Exercicio de Orientação a Objetos)
 * 
6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class TestarConta {


	public static void main(String[] args) {
	Conta c1 = new Conta();
	Scanner input = new Scanner(System.in);
	
	/* 	 * 
	 * Contas cadastradas: [Utilizar para teste]
	 * 
	 * (conta = 1234, agencia = 1234, senha = 1234 )
	 * (conta = 4321, agencia = 4321, senha = 4321 )
	 * (conta = 1233, agencia = 1233, senha = 1233 )
	 * 
	 */
	

	System.out.println("#### Acessar conta bancária ####\n");
	
	c1.dados();
	
	System.out.print("Conta: ");
	c1.setConta(input.nextInt());
	
	System.out.print("Agência: ");
	c1.setAgencia(input.nextInt());
	
	System.out.print("Senha: ");
	c1.setSenha(input.nextInt());
	
	c1.entrar();
	
	input.close();
		
	}

}

/* 
	    Contas cadastradas: [Utilizar para teste]
	 
	    (conta = 1234, agencia = 1234, senha = 1234 )
	    (conta = 4321, agencia = 4321, senha = 4321 )
	    (conta = 1233, agencia = 1233, senha = 1233 )
	   
	 
 ----------------------------------------------------------------------
 
 
  Exemplo de uma Saída do Console após executar o código:
 
		  
		#### Acessar conta bancária ####
		
		Insira os dados para acessar a conta existente:
		
		Conta: 1235
		Agência: 2563
		Senha: 2156
		
		Dados inválidos ou conta inexistente, tente novamente.
		
		
-------------------------------------------------------------------------
		
		
		#### Acessar conta bancária ####

		Insira os dados para acessar a conta existente:
		
		Conta: 1234
		Agência: 1234
		Senha: 1234
		
		Acesso permitido!
		
		Bem vindo, Igor
		Saldo em conta: R$ 495.000,00
 
 */




