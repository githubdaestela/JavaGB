/*Lista 4 Lista de Array: 2. Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/

package lista_4_java;

import java.util.*;

public class questao_2 
{
	public static void main (String args[])
	{
		Scanner input= new Scanner (System.in);
		
		int [] number= new int [5];
		int acmPar=0, somaPar=0, acmImpar=0, somaImpar=0;
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Entre com um n�mero: ");
			number[i]= input.nextInt();
			
			if (i%2==0)
			{
				acmPar++;
				somaPar= somaPar+i;
			}
			else 
			{
				acmImpar++;
				somaImpar=somaImpar+i;
			}
		}
		System.out.println("Foram digitados " + acmPar + " n�meros pares.");
		System.out.println("A soma de n�mero pares � " + somaPar + ".");
		System.out.println("Foram digitados " + acmImpar + " n�meros �mpares.");
		System.out.println("A soma de n�mero pares � " + somaImpar + ".");
	}
}
