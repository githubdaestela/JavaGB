/*Lista 3 Repeti��o: 2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

package lista_3_java;

import java.util.*;

public class questao_2 
{
	public static void main (String args[])
	{
		Scanner input= new Scanner (System.in);
		
		int x, numero, acmP=0, acmI=0;
		
		for (x=1; x<=10; x++)
		{
			System.out.println("Digite um n�mero: ");
			numero= input.nextInt();
			
			if (numero%2==0)
			{
				acmP ++;
			}
			else
			{
				acmI ++;
			}
		}
		System.out.println("Foi digitado " + acmP+ " n�meros pares e " + acmI + " n�meros �mpares.");
	}
}
