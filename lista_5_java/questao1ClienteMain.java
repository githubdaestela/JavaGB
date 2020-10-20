/*Lista Incial de POO: 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package lista_5;

public class questao1ClienteMain 
{
	public static void main (String [] args)
	{
		questao1Cliente cliente1= new questao1Cliente ("Ana Maria", "Pereira", "Macuco", "Rua Beija flor 235");
		cliente1.status();
		
	
		questao1Cliente cliente2= new questao1Cliente ("Luis", "Franco", "Ycuara", "Rua crystal 1628");
		cliente2.status();
		
	}
}
 