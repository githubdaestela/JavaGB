/*Lista de Herança e Encapsulamento: 6) Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que será adicionado ao vencimento base do Vendedor).*/

package lista_6_java;

public class QuestaoVendedor extends QuestaoPessoa
{
	private double valorVendas;
	private double comissao;

	public QuestaoVendedor (String nome, String endereco, String cpf, int telefone, int idade, double valorVendas, double comissao) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public void imprimirInfo() 
	{
		System.out.println("\nNome do vendedor(a): " + getNome() + 
				"\nCPF: " + getCpf() + 
				"\nIdade: " + getIdade()+
				"\nTelefone: " + getTelefone() + 
				"\nEndereço: " + getEndereco() + 
				"\nValor Vendas: " + getValorVendas() +
				"\nComissão: " + getComissao() + "%");
	}

	public void salarioTotal() 
	{
		double salarioTotal = valorVendas + (valorVendas * comissao / 100);
		System.out.println("O salário total é = " + salarioTotal);
	}

	public double getValorVendas() 
	{
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) 
	{
		this.valorVendas = valorVendas;
	}

	public double getComissao() 
	{
		return comissao;
	}

	public void setComissao(double comissao) 
	{
		this.comissao = comissao;
	}
}
