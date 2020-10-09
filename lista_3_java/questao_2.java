/*Lista 3 Repetição: 2. Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

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
			System.out.println("Digite um número: ");
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
		System.out.println("Foi digitado " + acmP+ " números pares e " + acmI + " números ímpares.");
	}
}
