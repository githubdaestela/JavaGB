/*Lista de Heran�a e Encapsulamento: 6) Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorVendas
(correspondente ao valor monet�rio dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que ser� adicionado ao vencimento base do Vendedor).*/

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
				"\nEndere�o: " + getEndereco() + 
				"\nValor Vendas: " + getValorVendas() +
				"\nComiss�o: " + getComissao() + "%");
	}

	public void salarioTotal() 
	{
		double salarioTotal = valorVendas + (valorVendas * comissao / 100);
		System.out.println("O sal�rio total � = " + salarioTotal);
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
