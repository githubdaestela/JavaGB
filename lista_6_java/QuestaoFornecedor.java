/*Lista de Heran�a e Encapsulamento: 2) Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe
Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos
que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito
m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores,
um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e
valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe
Fornecedor e os herdados da classe Pessoa.*/

package lista_6_java;

public class QuestaoFornecedor extends QuestaoPessoa
{
	private double valorCredito;
	private double valorDivida;

	public QuestaoFornecedor(String nome, String endereco, String cpf, int telefone, int idade, double valorCredito, double valorDivida) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public void imprimirInfo() 
	{
		System.out.println("\nNome do empregado: " + getNome() + "\n" + "CPF: " + getClass() + "\n" + "Idade: "
				+ getNome() + "\n" + "Telefone: " + getTelefone() + "\n" + "Endere�o: " + getEndereco() + "\n" + "\n"
				+ "Valor cr�dito: " + valorCredito + "\n" + "Valor d�vida: " + valorDivida);
	}

	public void obterSaldo() 
	{
		double diferencasaldo = valorCredito - valorDivida;
		System.out.println("O saldo referente ao fornecedor � igual a: " + diferencasaldo);
	}

	public double getValorCredito() 
	{
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) 
	{
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() 
	{
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) 
	{
		this.valorDivida = valorDivida;
	}
}
