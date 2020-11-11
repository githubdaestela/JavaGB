/*Lista de Heran�a e Encapsulamento: 5) Implemente a classe Operario como subclasse da classe Pessoa. Um determinado oper�rio
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorProducao
(que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e
comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao
vencimento base do oper�rio). */

package lista_6_java;

public class QuestaoOperario extends QuestaoPessoa
{
	private double valorProducao;
	private double comissao;

	public QuestaoOperario (String nome, String endereco, String cpf, int telefone, int idade, double valorProducao, double comissao)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado:"+getNome()+
				"\n"+"CPF: "+getCpf()+
				"\n"+"Idade:"+getIdade()+
				"\n"+"Telefone: "+getTelefone()+
				"\n"+"Endere�o: "+getEndereco()+
				"\n"+"Valor Produ��o:"+getValorProducao()+"\n"+"Porcentagem da comiss�o deste artigo: :"+getComissao());
	}

	public void calcularValorArtigo() 
	{
		double valor_total = valorProducao + (valorProducao*(comissao/100));
		System.out.println("O valor total a ser recebido pelo oper�rio: "+getNome()+" � igaul a: "+valor_total);
	}

	public double getValorProducao() 
	{
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) 
	{
		this.valorProducao = valorProducao;
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
