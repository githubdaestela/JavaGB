/*Lista de Heran�a e Polimorfismo: quest�o 1 e 3) Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.*/

package lista_7_java;

public class Polimorfismo 
{
	public static void main(String[] args) 
	{
		Preguica p = new Preguica();
		Cachorro c = new Cachorro();
		Cavalo k = new Cavalo();

		p.emitirSom();
		c.emitirSom();
		k.emitirSom();
	}
}
