/*Lista de Herança e Encapsulamento: 1) Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
String telefone;*/

package lista_6_java;

public class QuestaoPessoa 
{
	
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;

	public QuestaoPessoa (String nome, String endereco, String cpf, int telefone, int idade) 
	{
		super ();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public int getTelefone() 
	{
		return telefone;
	}

	public void setTelefone(int telefone)
	{
		this.telefone = telefone;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}

	public void validarCpf() 
	{
		if (getCpf().length() != 11)
		{
			System.out.println("--CPF inválido");
		} else

		{
			System.out.println("--CPF válido");
		}
	}
}
