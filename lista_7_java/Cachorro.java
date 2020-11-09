package lista_7_java;

public class Cachorro extends Animal
{
	@Override
	public void emitirSom() 
	{
		System.out.println("Au! Au! Au!");
	}

	@Override
	public void locomover() 
	{
		System.out.println("Correndo");
	}
}
