/*Lista Incial de POO: 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

package lista_5;

public class questao4Funcionarie 
{
	private String nome1;
	private String nome2;
	private String nome3;
	private String cargo;
	private int mesDeAdmissao;
	private int anoDeAdmissao;
	private String endereco;
	private double salario;
	
	void nome()
	{
		System.out.println("O nome du fincion�rie � " + nome1+ " " + nome2+ " "+nome3);
	}
	void cadastro ()
	{
		System.out.println("Com o cargo de " + cargo);
		System.out.println("Admitido no ano " + anoDeAdmissao + " no m�s " +mesDeAdmissao);
		System.out.println("Atualmente ganhando sal�rio de R$" + salario);
		System.out.println("Atualmente reside no enredere�o " + endereco);
	}
	
	public questao4Funcionarie (String nomee1, String nomee2, String nomee3, String cargoo, int mesDeAdmissaoo, int anoDeAdmissaoo,	 String enderecoo, double salarioo) 
	{
		this.nome1 = nomee1;
		this.nome2 = nomee2;
		this.nome3 = nomee3;
		this.cargo = cargoo;
		this.mesDeAdmissao = mesDeAdmissaoo;
		this.anoDeAdmissao = anoDeAdmissaoo;
		this.endereco = enderecoo;
		this.salario = salarioo;
	}
}
