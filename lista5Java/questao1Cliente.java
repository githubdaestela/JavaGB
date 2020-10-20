/*Lista Incial de POO: 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package lista_5;

public class questao1Cliente 
{
	private String primeiroNome;
	private String nomeDoMeio;
	private String ultimoNome;
	private String endereco;
	
	
	public questao1Cliente (String nome1, String nome2, String nome3, String local)
	{
		this.primeiroNome=nome1;
		this.nomeDoMeio=nome2;
		this.ultimoNome=nome3;
		this.endereco=local;
		
	}
	
	
	void status () 
	{
		System.out.println ("\nNome completo: " + primeiroNome + " " + nomeDoMeio + " " + ultimoNome);
		System.out.println ("O endereço du cliente é: " + endereco);	
	}
}
