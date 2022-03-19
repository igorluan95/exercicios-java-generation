package br.com.generation.exercicio03;

/*(Exercicio de Orientação a Objetos)
 * 
 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
 referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

public class ProdutoEletronico {

	private String nome;
	private String marca;
	private int ano;
	private double preco;
	private double precoPagar;
	private int pagamento;

	
			
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoPagar() {
		return precoPagar;
	}

	public void setPrecoPagar(double precoPagar) {
		this.precoPagar = precoPagar;
	}

	public void pagarComDinheiro(double valorProduto) {
		precoPagar = valorProduto*0.9;
		
	}

	public int getPagamento() {
		return pagamento;
	}

	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
	void processar(){
		System.out.println("\nDados processados...\n");
	}
		
	void concluir(){
			System.out.println("\nConsulta concluída!");
		
	}

}
