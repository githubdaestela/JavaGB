/*Lista de Herança e Encapsulamento: 4) Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias). */

package lista_6_java;

public class QuestaoAdministrador extends QuestaoPessoa
{
	private double estadias;
	private double viagens;
	
	
	public QuestaoAdministrador (String nome, String endereco, String cpf, int telefone, int idade, double estadias, double viagens) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.estadias = estadias;
		this.viagens = viagens;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nNome do administrador: " + getNome() 
						   +"\nCPF: " + getCpf()
						   +"\nIdade: " + getIdade()
						   +"\nTelefone: "+ getTelefone()
						   +"\nEndereço: " + getEndereco());
	}
	
	public void totalAjuda() 
	{
		double ajudaDeCustos = estadias + viagens;
		System.out.println("Ajuda de Custos: " + ajudaDeCustos);
	}

	public double getEstadias() 
	{
		return estadias;
	}

	public void setEstadias(double estadias) 
	{
		this.estadias = estadias;
	}


	public double getViagens()
	{
		return viagens;
	}


	public void setViagens(double viagens)
	{
		this.viagens = viagens;
	}
}