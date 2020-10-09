/*Lista 3 Repetição: 6. Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

package lista_3_java;

import java.util.*;

public class questao_6 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
		
		int numero, media=0, soma=0, acumulador=0;
		
		do
		{
			System.out.println("Digite um número: ");
			numero= read.nextInt();
			if(numero%3==0) 
			{
				soma=soma+numero;
				acumulador ++;
			}
		} while (numero!=0);
		
		 media=soma/acumulador;
		 
		System.out.println("A media dos número digitados múltiplos de 3 três é: " + media);
	}
}
