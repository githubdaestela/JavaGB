/*Lista 2 La�o Condicional Java: 3. Fa�a um programa que receba a idade de uma pessoa e 
 mostre na sa�da em qual categoria ela se encontra: 10-14 infantil; 15-17 juvenil; 18-25 adulto*/

package lista_2_java;

import java.util.*;

public class questao_3 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
	
		int idade;
	
		System.out.println("Insira sua idade: ");
		idade= read.nextInt();
	
		if (idade>=10 && idade<=14)
		{
			System.out.println("Voc� � da categoria Infatil.");
		}
		else if (idade>14 && idade<=17)
		{
			System.out.println("Voc� � da categoria Juvenil.");
		}
		else if (idade>17 && idade<=25)
		{
			System.out.println("Voc� � da categoriaa Adulto.");
		}
		else 		
		{
			System.out.println("Insira uma idade v�lida.");
		}
		
	}

}
