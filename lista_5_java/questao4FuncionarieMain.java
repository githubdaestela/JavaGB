/*Lista Incial de POO: 4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

package lista_5;

public class questao4FuncionarieMain 
{
	public static void main (String [] args)
	{
		questao4Funcionarie f1 = new questao4Funcionarie("Magda", "Silva", "Ferage", "gerente", 8, 2015, "Rua dos Flamingo, 135", 4500.00);
		f1.nome();
		f1.cadastro();
	}
}
