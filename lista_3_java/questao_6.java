/*Lista 3 Repeti��o: 6. Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/

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
			System.out.println("Digite um n�mero: ");
			numero= read.nextInt();
			if(numero%3==0) 
			{
				soma=soma+numero;
				acumulador ++;
			}
		} while (numero!=0);
		
		 media=soma/acumulador;
		 
		System.out.println("A media dos n�mero digitados m�ltiplos de 3 tr�s �: " + media);
	}
}
