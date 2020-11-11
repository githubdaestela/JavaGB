/*Lista de Herança e Encapsulamento: 2) Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos
que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).
Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
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
				+ getNome() + "\n" + "Telefone: " + getTelefone() + "\n" + "Endereço: " + getEndereco() + "\n" + "\n"
				+ "Valor crédito: " + valorCredito + "\n" + "Valor dívida: " + valorDivida);
	}

	public void obterSaldo() 
	{
		double diferencasaldo = valorCredito - valorDivida;
		System.out.println("O saldo referente ao fornecedor é igual a: " + diferencasaldo);
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
