/*Lista 4 Lista de Array: 3.Leia uma matriz 3 x 3, conte e escreva 
 quantos valores maiores que 10 ela possui.*/

package lista_4_java;

import java.util.*;

public class questao_3 
{
	public static void main (String args[])
	{
		Scanner input= new Scanner (System.in);
		int [][] matriz = new int[3][3];
		
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.printf("Insira o número da linha " + (i+1) + " e da coluna " + (j+1) + ": ");
				matriz[i][j] = input.nextInt();	
			}
		}
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.printf(" [" + matriz[i][j] + "] ");
			}
			
			System.out.println();
		}
	}
}
