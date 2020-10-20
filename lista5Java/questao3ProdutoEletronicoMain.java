/*Lista Incial de POO: 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package lista_5;

public class questao3ProdutoEletronicoMain
{
	public static void main (String [] args)
	{
		//instanciar
		questao3ProdutoEletronico celular1 = new questao3ProdutoEletronico("motorola", "One fusion plus", "Azul Indigo", 89, "Android 10", 128, 4);
		questao3ProdutoEletronico celular2 = new questao3ProdutoEletronico("apple", "Iphone 11", "Product Red", 3, "iOS 14", 64, 4);
		
		System.out.println("\n:::::::::::::::Celular 1::::::::::::::::");
		celular1.status();
		celular1.ligar();
		System.out.println("\n:::::::::::::::Celualr 2::::::::::::::::");
		celular2.status();
		celular2.ligar();
	}
}
