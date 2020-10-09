/*Lista 3 Repetição: 3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas 
 com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/ 

package lista_3_java;

import java.util.*;

public class questao_3 
{
	public static void main (String args[])
	{
		Scanner input= new Scanner (System.in);
		
		int age=0, acm1=0, acm2=0;
		
		System.out.println("Escreva sua idade: ");
		age= input.nextInt();
		while (age>0 && age!=-99)
		{
			System.out.println("Escreva sua idade: ");
			age= input.nextInt();
			
			if (age<21)
			{
				acm1++;
			}
			else if (age>50)
			{
				acm2++;
			}
		}
		
		System.out.println("Foi digitado " + acm1 + " pessoas com menos de 21 anos de idade e " + acm2 + " pessoas com mais de 50 anos");
	}
}
