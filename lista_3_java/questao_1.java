/*Lista 3 Repetição: 1. Informar todos os números de 1000 a 1999 que quando divididos por 
11 obtemos resto = 5. (FOR) */

package lista_3_java;

import java.util.*;

public class questao_1 
{
	public static void main (String args[])
	{
		int x=0, acm=0;
		
		for (x= 1000; x <= 1999; x++)
		{
			if (x%11==5)
			{
				acm++;
				System.out.println(x + ",");
			}
		}
	}
}
