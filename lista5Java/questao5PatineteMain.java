/*Lista Incial de POO: 5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package lista_5;

public class questao5PatineteMain 
{
	public static void main (String [] args)
	{
		questao5Patinete patinete1 = new questao5Patinete("azul", true, 7, "no guidão", 70);
		questao5Patinete patinete2 = new questao5Patinete("pink", false, 9, "na roda traseira",80);
		
		System.out.println("-------Patinete 1-------");
		patinete1.status();
		patinete1.andar();
		System.out.println("\n-------Patinete 2-------");
		patinete2.status();
		patinete2.andar();
	}
}
