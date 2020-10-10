/*Lista 4 Lista de Array: 2. Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/

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
			System.out.println("Entre com um número: ");
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
		System.out.println("Foram digitados " + acmPar + " números pares.");
		System.out.println("A soma de número pares é " + somaPar + ".");
		System.out.println("Foram digitados " + acmImpar + " números ímpares.");
		System.out.println("A soma de número pares é " + somaImpar + ".");
	}
}
