/*Lista Incial de POO: 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package lista_5;

public class questao2AviaoMain 
{
	public static void main (String [] args)
	{
		questao2Aviao aviao1= new questao2Aviao("Boeing", "747", 660 , (float) 137.7 , true);
		questao2Aviao aviao2= new questao2Aviao("Airbus", "A320", 220 , (float) 16.2 , false);
		
		System.out.println("\n:::::::::::::::AVIÃO 1::::::::::::::::");
		aviao1.status();
		aviao1.voar();
		System.out.println("\n:::::::::::::::AVIÃO 2::::::::::::::::");
		aviao2.status();
		aviao2.voar();
	}
}
