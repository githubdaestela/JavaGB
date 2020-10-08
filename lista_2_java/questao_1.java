/*Lista 2 Laço Condicional Java: 1. Faça um programa que receba três 
 inteiros e diga qual deles é o maior. */

package lista_2_java;

import java.util.*;

public class questao_1 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Os números devem ser inteiros.");
		System.out.println("Insira um número: ");
		n1= read.nextInt ();
		System.out.println("Insira outro número: ");
		n2= read.nextInt ();
		System.out.println("Insira mais um número: ");
		n3= read.nextInt ();
		
		if (n1>n2 && n1>n3) 
		{
			System.out.println("O maior número inserido é " + n1);
		}
		else if (n2>n1 && n2>n3) 
		{
			System.out.println("O maior número inserido é " + n2);
		}
		else if (n3>n1 && n3>n2) 
		{
			System.out.println("O maior número inserido é " + n3);
		}
	}
}
