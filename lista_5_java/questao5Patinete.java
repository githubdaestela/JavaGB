/*Lista Incial de POO: 5) Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package lista_5;

public class questao5Patinete
{
	private String cor;
	private boolean capacete;
	private int abec;
	private String sistemaDeTrava;
	private int rodas;
	
	void status ()
	{
		System.out.println("A cor do patinete �: " + cor);
		System.out.println("O padr�o de rolamento �: ABEC" + abec);
		System.out.println("O sistema de trava �: "+ sistemaDeTrava);
		System.out.println("O di�metro das rodas s�o: " + rodas+ "mm");
	}
	
	void andar()
	{
		if (capacete==true) {
			System.out.println("Voc� est� seguro, pode andar de patinete.");
		} else  { System.out.println("Voc� n�o est� seguro. Coloque o capacete.");}
	}
	
	
	public String getcor() 
		{return this.cor;}
	public int getabec()
		{return this.abec;}
	public String getsistemaDeTrava()
		{return this.sistemaDeTrava;}
	public int getrodas()
		{return this.rodas;}
	
	public void setcor(String c)
		{this.cor=c;}
	public void setabec(int a)
		{this.abec=a;}
	public void setsistemaDeTrava(String s)
		{this.sistemaDeTrava=s;}
	public void setrodas(int r)
		{this.rodas=r;}
		
	questao5Patinete(String corr, boolean capacetee, int abecc, String sistemaDeTravaa, int rodass)
	{
		cor=corr;
		capacete=capacetee;
		abec=abecc;
	    sistemaDeTrava=sistemaDeTravaa;
		rodas=rodass;
	}
}
