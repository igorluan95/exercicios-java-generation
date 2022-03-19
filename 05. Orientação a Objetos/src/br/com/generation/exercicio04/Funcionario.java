package br.com.generation.exercicio04;

public class Funcionario {
				
		private String nome;
		private String cpf;
		private String cargo;
		private double salario;
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		void processar(){
			System.out.println("\nDados processados...\n");
		}
			
		void concluir(){
				System.out.println("\nConsulta concluída!");
			
		}

		
		
	}


