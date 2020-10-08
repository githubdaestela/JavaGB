package lista_1_java;

import java.util.*;

public class questao_1 
{
	public static void main (String args[])
	{
		int anos, meses, dias, idade; 
		
		Scanner ler= new Scanner (System.in);
		System.out.println("Insira sua idade em anos: ");
		anos=ler.nextInt();
		System.out.println("em meses: ");
		meses=ler.nextInt();
		System.out.println("em dias: ");
		dias=ler.nextInt();
		
		idade=(anos*365)+(meses*30)+dias;
		System.out.println ("Você tem " + idade +" dias de idade.");
		
	}

}
