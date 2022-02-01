package br.com.generation.OrientacaoAObjetos;

public class Questao01ClienteAplicacao {

	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Questao01Cliente igor = new Questao01Cliente();
		igor.nome = "Igor Luan Souza Silva";
		igor.endereco = "Rua Araujo Gondim";
		igor.celular = "(11)95711-0269";
		igor.email = "igorluansouzasilva@gmail.com";
		igor.dataNasc = "24/06/1995";
		igor.totalCompra = 0;
	
	
		
		System.out.println("Nome: "+igor.nome);
		System.out.println("Endereço: "+igor.endereco);
		System.out.println("Celular: "+igor.celular);
		System.out.println("E-mail: "+igor.email);
		System.out.println("Data de Nascimento: "+igor.dataNasc);


		System.out.println();
		
		igor.valorNovoProduto(50.99);
		System.out.println("O total da compra com o novo produto adicionado no carrinho é R$ " + igor.totalCompra + ".");
		
		igor.descontar(10.00);	
		System.out.println("Após utilizar o cupom de desconto o valor abaixou para R$ " + igor.totalCompra + ".");

		

	}

}

