/*Lista 2 La�o Condicional Java: 2. Fa�a um programa que entre com tr�s 
 n�meros e coloque em ordem crescente. */

package lista_2_java;

import java.util.*;

public class questao_2 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
		{
			float n1, n2, n3;
	
			System.out.println("Insira um n�mero: ");
			n1= read.nextFloat();
			System.out.println("Insira outro n�mero: ");
			n2= read.nextFloat();
			System.out.println("Insira mais um n�mero: ");
			n3= read.nextFloat();
			
			if (n1>n2 && n1>n3)
			{
				if (n2>n3)
				{
					System.out.println("Os n�mero inseridos em ordem crescente " + n1 + ">" + n2 + ">" + n3);
				}
				else if (n3>n2)
				{
					System.out.println("Os n�mero inseridos em ordem crescente " + n1 + ">" + n3 + ">" + n2);
				}
			}
			
			if (n2>n1 && n2>n3)
			{
				if (n1>n3)
				{
					System.out.println("Os n�mero inseridos em ordem crescente " + n2 + ">" + n1 + ">" + n3);
				}
				else if (n3>n1)
				{
					System.out.println("Os n�mero inseridos em ordem crescente " + n2 + ">" + n3 + ">" + n1);
				}
			}
			
			if (n3>n1 && n3>n2)
			{
				if (n1>n2)
				{
					System.out.println("Os n�mero inseridos em ordem crescente " + n3 + ">" + n1 + ">" + n2);
				}
				else if (n2>n1)
				{
					System.out.println("Os n�mero inseridos em ordem crescente " + n3 + ">" + n2 + ">" + n1);
				}
			}
			
		}
	}
}
