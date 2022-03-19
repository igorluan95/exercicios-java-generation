package br.com.generation.exercicio06;

/*(Exercicio de Orientação a Objetos)
 * 
6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Conta {


	private int conta;
	private int agencia;
	private int senha;

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	void dados() {
		System.out.println("Insira os dados para acessar a conta existente:\n");
	}

	void entrar() {
		if (conta == 1234 && agencia == 1234 && senha == 1234 ) {	
				System.out.println("\nAcesso permitido!\n");
				System.out.println("Bem vindo, Igor");
				System.out.println("Saldo em conta: R$ 495.000,00");
			}
		
		else if (conta == 4321 && agencia == 4321 && senha == 4321 ) {	
			System.out.println("\nAcesso permitido!\n");
			System.out.println("Bem vinda, Luana");
			System.out.println("Saldo em conta: R$ 100.000,00");
		}
		
		else if (conta == 1233 && agencia == 1233 && senha == 1233 ) {	
			System.out.println("\nAcesso permitido!\n");
			System.out.println("Bem vinda, Bruna");
			System.out.println("Saldo em conta: R$ 500.000,00");
		}
		
		else {
			System.out.println("\nDados inválidos ou conta inexistente, tente novamente.");
		}
	
	}
	


}
