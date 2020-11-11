/*Lista de Heran�a e Encapsulamento: 3) Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/

package lista_6_java;

public class QuestaoEmpregado extends QuestaoPessoa
{
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public QuestaoEmpregado(String nome, String endereco, String cpf, int telefone, int idade) 
	{
		super (nome, endereco, cpf, telefone, idade);
	}
	
	public void imprimirInfo()
	{
	System.out.println("\nNome do empregado: " + getNome() + 
			"\n"+"CPF: " + getCpf() + 
			"\n"+"Idade: " + getIdade( ) +
			"\n"+"Telefone: " + getTelefone() +
			"\n"+"Endere�o: " + getEndereco() +
			"\n"+"C�digo do setor: "+ getCodigoSetor() +
			"\n" +"Sal�rio Base: "+ getSalarioBase() +
			"\n"+"Valor em porcentagem de imposto a ser retido do sal�rio: "+ getImposto());
	}

		public void calcularSalario() 
		{
			double salario_total = salarioBase - (salarioBase * (imposto / 100));
			System.out.println ("O sal�rio total a ser recebido pelo empregado: " + getNome() + " � igual a: " + salario_total);
		}

		public int getCodigoSetor() 
		{
			return codigoSetor;
		}

		public void setCodigoSetor(int codigoSetor) 
		{
			this.codigoSetor = codigoSetor;
		}

		public float getSalarioBase() 
		{
			return salarioBase;
		}

		public void setSalarioBase(float salarioBase) 
		{
			this.salarioBase = salarioBase;
		}

		public float getImposto() 
		{
			return imposto;
		}

		public void setImposto(float imposto) 
		{
			this.imposto = imposto;
		}
}
