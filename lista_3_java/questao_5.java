/*Lista 3 Repeti��o: 5. Crie um programa que leia um n�mero do teclado at� que encontre 
um n�mero igual a zero. No final, mostre a soma dos n�meros
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
			System.out.println("Digite um n�mero: ");
			numero= read.nextDouble();
			soma= soma + numero;
		} while (numero!=0);
		
		System.out.println("A soma dos n�mero digitados foi " + soma);
	}
}
