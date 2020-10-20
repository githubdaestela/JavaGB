/*Lista Incial de POO: 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package lista_5;

import java.util.*;

public class questao2Aviao 
{
	private String modelo;
	private float capacidadePessoas;
	private float capacidadeCarga;
	private String nomeFabricante;
	private boolean combustivel;
	

	
	public questao2Aviao (String fabricante, String modeelo, int assentos, float carga, boolean gasolina)
	{
		this.nomeFabricante=fabricante;
		this.modelo=modeelo;
		this.capacidadePessoas=assentos;
		this.capacidadeCarga=carga;
		this.combustivel=gasolina;
	}
	
	void voar()
	{
		this.combustivel= true;
	}
	
	void status()
	{
		System.out.println("\nO nome do fabricante do avi�o �: " + nomeFabricante);
		System.out.println("O modelo do avi�o �: " + modelo);
		System.out.println("Tem " + capacidadePessoas + " assentos");
		System.out.println("Tem " + capacidadeCarga + " toneladas m�tricas de carga");
		System.out.println("Tem combust�vel? " + combustivel);
		if (combustivel==true) {
			System.out.println("Pode voar.");
		} else { System.out.println("N�o pode voar. Coloque combust�vel.");}
	}

}
