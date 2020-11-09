/*Lista Incial de POO: 4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
