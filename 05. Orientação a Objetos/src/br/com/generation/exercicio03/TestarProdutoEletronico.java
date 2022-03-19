package br.com.generation.exercicio03;
import java.text.DecimalFormat;
import java.util.Scanner;

/*(Exercicio de Orientação a Objetos)
 * 
 * 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/


public class TestarProdutoEletronico {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.00");
		ProdutoEletronico p1 = new ProdutoEletronico();
		Scanner input = new Scanner(System.in);

		System.out.println("#### Iniciando inserção de dados e consulta de preço a vista ####\n");

		System.out.println("Insira o nome do produto: ");
		p1.setNome(input.nextLine());

		System.out.println("Insira a marca do produto: ");
		p1.setMarca(input.nextLine());

		System.out.println("Insira o ano de fabricação do produto: ");
		p1.setAno(input.nextInt());

		System.out.println("Insira o preço do produto: ");
		p1.setPreco(input.nextDouble());

		while ((p1.getPreco()) <= 0) {
			System.out.println("(O preço precisa ser maior que zero).");
			System.out.println("Insira o preço do produto: ");
			p1.setPreco(input.nextDouble());
		}

		System.out.println("Digite 1 para compra em dinheiro ou outro número para conta com cartão: ");
		p1.setPagamento(input.nextInt());

		if (p1.getPagamento() == 1) {
			p1.pagarComDinheiro(p1.getPreco());
	   }

		p1.processar();

		System.out.println("Produto: " + p1.getNome());
		System.out.println("Marca: " + p1.getMarca());
		System.out.println("Ano de fabricação: " + p1.getAno());
		System.out.println("Preço: R$ " + df.format(p1.getPreco()));

		if ((p1.getPagamento() == 1)) {
			System.out.println("Paga pagamento em dinheiro o preço abaixa para R$ " + df.format(p1.getPrecoPagar()));
		}

		else {
			System.out.println("Sem desconto para pagamento em cartão.");
		}

		p1.concluir();

		input.close();
	}
}
/*
 * 
 * Exemplo de uma Saída do Console após executar o código:
 * 
	#### Iniciando inserção de dados e consulta de preço a vista ####
	
	Insira o nome do produto: 
	Galaxy S20
	Insira a marca do produto: 
	Samsung
	Insira o ano de fabricação do produto: 
	2020
	Insira o preço do produto: 
	4277
	Digite 1 para compra em dinheiro ou outro número para conta com cartão: 
	1
	
	Dados processados...
	
	Produto: Galaxy S20
	Marca: Samsung
	Ano de fabricação: 2020
	Preço: R$ 4.277,00
	Paga pagamento em dinheiro o preço abaixa para R$ 3.849,30
	
	Consulta concluída!

 * 
 * 
 */
