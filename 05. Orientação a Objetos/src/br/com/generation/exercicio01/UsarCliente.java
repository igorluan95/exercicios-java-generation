package br.com.generation.exercicio01;

import java.text.DecimalFormat;
import java.util.Scanner;

/* (Exercicio de Orientação a Objetos)
 * 
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

public class UsarCliente extends Cliente {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.00");
		Cliente c1 = new Cliente();
		Scanner input = new Scanner(System.in);
		double valorAPagar;
		
		c1.inicio();

		System.out.println("Insira o nome do cliente: ");
		c1.setNome(input.nextLine());
			
		System.out.println("Insira o CPF: ");
		c1.setCpf(input.nextLine());
		
		System.out.println("Insira o E-mail: ");
		c1.setEmail(input.nextLine());
		
		System.out.println("Insira o Endereço: ");
		c1.setEndereco(input.nextLine());
		
		System.out.println("Insira o valor da compra: ");
		c1.setValorDaCompra(input.nextDouble());
			
			while ((c1.getValorDaCompra()) <= 0) {
				System.out.println("(O valor da compra precisa ser maior que zero).");
				System.out.println("Insira o valor da compra: ");
				c1.setValorDaCompra(input.nextDouble());				
		}
		
		System.out.println("Insira o valor do cupom de desconto: ");
		c1.setValorCupomDeDesconto(input.nextDouble());
		
			while ((c1.getValorCupomDeDesconto() < 0)) {
				System.out.println("(O valor do cupom de desconto não pode ser negativo).");
				System.out.println("Insira o valor do cupom de desconto: ");
				c1.setValorCupomDeDesconto(input.nextDouble());			
		}

		c1.comprar();

		valorAPagar = (c1.getValorDaCompra() - c1.getValorCupomDeDesconto());

		if (c1.getValorDaCompra() == c1.getValorCupomDeDesconto()) {
			System.out.println("Cliente: " + c1.getNome());
			System.out.println("Valor da Compra: R$ " + df.format(c1.getValorDaCompra()));
			System.out.println("Valor do cupom de desconto: R$ " + df.format(c1.getValorCupomDeDesconto()));
			System.out.println("O valor da compra no mesmo valor do cupom de desconto, cliente sem débitos.");
		}

		else if (c1.getValorDaCompra() < c1.getValorCupomDeDesconto()) {
			System.out.println("Cliente: " + c1.getNome());
			System.out.println("Valor da Compra: R$ " + df.format(c1.getValorDaCompra()));
			System.out.println("Valor do cupom de desconto: R$ " + df.format(c1.getValorCupomDeDesconto()));
			System.out.println("O valor da compra foi descontado do valor do cupom, cliente sem débitos.");
			System.out.println("Crédito em cupom para utilizar em compras futuras: R$ " + df.format(valorAPagar * (-1))+".");

		}
		

		else if (c1.getValorDaCompra() > c1.getValorCupomDeDesconto() && c1.getValorCupomDeDesconto() >0) {
			System.out.println("Cliente: " + c1.getNome());
			System.out.println("Valor da Compra: R$ " + df.format(c1.getValorDaCompra()));
			System.out.println("Valor do cupom de desconto: R$ " + df.format(c1.getValorCupomDeDesconto())+".");
			System.out.println("Valor pago: R$ " + df.format(valorAPagar));
		}


		else {
			System.out.println("Cliente: " + c1.getNome());
			System.out.println("Valor da Compra: R$ " + df.format(c1.getValorDaCompra()));
			System.out.println("Cliente não utilizou cupom de desconto.");
			System.out.println("Valor pago: R$ " + df.format(valorAPagar));
		}

		c1.pagar();

		input.close();

	}

}


/*
 * Exemplo de uma Saída do Console após executar o código:
 * 
		  
		 #### Iniciando processamento de compra ####
		  
		Insira o nome do cliente: 
		Igor Luan
		Insira o CPF: 
		123.456.789-65
		Insira o E-mail: 
		igorluansouzasilva@gmail.com
		Insira o Endereço: 
		Rua A
		Insira o valor da compra: 
		-50
		(O valor da compra precisa ser maior que zero).
		Insira o valor da compra: 
		0
		(O valor da compra precisa ser maior que zero).
		Insira o valor da compra: 
		80
		Insira o valor do cupom de desconto: 
		-2
		(O valor do cupom de desconto não pode ser negativo).
		Insira o valor do cupom de desconto: 
		0
		
		Dados processados...
		
		Cliente: Igor Luan
		Valor da Compra: R$ 80,00
		Cliente não utilizou cupom de desconto.
		Valor pago: R$ 80,00
		
		Compra concluída!
 
 
 */

