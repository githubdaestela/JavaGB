/*Lista de Herança e Polimorfismo: questão 1 e 3) Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/

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
