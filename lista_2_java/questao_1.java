/*Lista 2 La�o Condicional Java: 1. Fa�a um programa que receba tr�s 
 inteiros e diga qual deles � o maior. */

package lista_2_java;

import java.util.*;

public class questao_1 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Os n�meros devem ser inteiros.");
		System.out.println("Insira um n�mero: ");
		n1= read.nextInt ();
		System.out.println("Insira outro n�mero: ");
		n2= read.nextInt ();
		System.out.println("Insira mais um n�mero: ");
		n3= read.nextInt ();
		
		if (n1>n2 && n1>n3) 
		{
			System.out.println("O maior n�mero inserido � " + n1);
		}
		else if (n2>n1 && n2>n3) 
		{
			System.out.println("O maior n�mero inserido � " + n2);
		}
		else if (n3>n1 && n3>n2) 
		{
			System.out.println("O maior n�mero inserido � " + n3);
		}
	}
}
