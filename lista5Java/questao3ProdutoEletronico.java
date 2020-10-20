/*Lista Incial de POO: 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package lista_5;

public class questao3ProdutoEletronico 
{
	//atributos
	private String marca;
	private String modelo;
	private String cor;
	private float bateria;
	private String sistemaOperacional;
	private int armazenamentoInterno;
	private int memoriaRam;
	
	//metodos
	void status()
	{
		System.out.println("A marca desse celular é: " + marca);
		System.out.println("O modelo desse celular é: "+ modelo);
		System.out.println("Os sistema operacional desse celular é: "+sistemaOperacional);
		System.out.println("A cor desse celular é: "+ cor);
		System.out.println("O armazanemnto interno desse celular é: "+armazenamentoInterno);
		System.out.println("A memória RAM desse celular é: "+ memoriaRam);
	}
	
	//estado
	void ligar ()
	{
		if (bateria<=5)
		{
			System.out.println("Coloque o celular para carregar está com " + bateria + "%");
		}
		else if (bateria>5 && bateria<=100)
		{
			System.out.println("Sua bateria está em " + bateria + "%");
		}
	}
	
	//metodo construtor
	public questao3ProdutoEletronico (String marcaa, String modeloo, String corr, float bateriaa, String sistemaOperacionall, int armazenamentoInternoo, int memoriaRamm)
	{
		this.marca=marcaa;
		this.modelo=modeloo;
		this.cor=corr;
		this.bateria=bateriaa;
		this.sistemaOperacional=sistemaOperacionall;
		this.armazenamentoInterno=armazenamentoInternoo;
		this.memoriaRam=memoriaRamm;
	}
}
