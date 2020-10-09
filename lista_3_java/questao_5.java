/*Lista 3 Repetição: 5. Crie um programa que leia um número do teclado até que encontre 
um número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package lista_3_java;

import java.util.*;

public class questao_5 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
		
		double numero, soma=0;
		
		do
		{
			System.out.println("Digite um número: ");
			numero= read.nextDouble();
			soma= soma + numero;
		} while (numero!=0);
		
		System.out.println("A soma dos número digitados foi " + soma);
	}
}
