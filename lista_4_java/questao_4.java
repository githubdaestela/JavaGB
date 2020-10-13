/*Lista 4 Lista de Array: 4. Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. 
 Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor
da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na
pr�pria matriz.*/

package lista_4_java;

import java.util.*;

public class questao_4  
{
	public static void main (String args[]) 
	{
		Scanner input= new Scanner (System.in);
		float [][] matriceOne = new float[2][2];
		float [][] matriceTwo = new float[2][2];
		float [][] matriceThree = new float[2][2];
		int option, constant, i, j;

		
		for ( i = 0; i < 2; i++) 
		{
			for ( j = 0; j < 2; j++) 
			{
				System.out.println("Sobre a primeira matriz, insira o n�mero da linha "+ (i+1)+ " e da coluna "+ (j+1)+ ": ");
				matriceOne[i][j]= input.nextFloat();
			} 
		}
		
		for ( i = 0; i < 2; i++) 
		{
			for ( j = 0; j < 2; j++) 
			{
				System.out.println("Sobre a segunda matriz, insira n�mero da linha "+ (i+1)+ " e da coluna "+ (j+1)+ ".");
				matriceTwo[i][j]= input.nextFloat();
			} 
		}
		System.out.println("Escolha umas das seguintes op��es: ");
		System.out.println("(1) Somar as duas matrizes.");
		System.out.println("(2) Subtrair a primeira matriz da segunda.");
		System.out.println("(3) Adicionar uma constante as duas matrizes.");
		System.out.println("(4) Imprimir as matrizes.");
		System.out.println("Digite o n�mero da op��o escolhida: ");
		option= input.nextInt();
		
		if (option==1)
		{
			System.out.println("A soma das duas matrizes � ");
			for ( i = 0; i < 2; i++) 
			{
				for ( j = 0; j < 2; j++) 
				{
					matriceThree[i][j]= matriceOne[i][j] + matriceTwo[i][j];
					System.out.printf("[ " + matriceThree[i][j] + " ]");
				} 
				System.out.println();
			}
		}
		else if (option==2)
		{
			System.out.println("A subtra��o das duas matrizes � ");
			for ( i = 0; i < 2; i++) 
			{
				for ( j = 0; j < 2; j++) 
				{
					matriceThree[i][j]= matriceTwo[i][j] + matriceOne[i][j];
					System.out.printf("[ " + matriceThree[i][j] + " ]");
				} 
				System.out.println();
			}
		}
		else if(option==3)
		{
			System.out.println("Digite o valor da contante: ");
			constant= input.nextInt();
			System.out.println("Para a contante= " + constant);
			System.out.println();
			System.out.println("A matriz um fica: ");
			for ( i = 0; i < 2; i++) 
			{
				for ( j = 0; j < 2; j++) 
				{ 
					matriceOne[i][j]= matriceOne[i][j]+constant;
					System.out.printf("[ " +  matriceOne[i][j] + " ]");
				} 
				System.out.println();
			}
			System.out.println();
			System.out.println("A matriz dois fica: ");
			for ( i = 0; i < 2; i++) 
			{
				for ( j = 0; j < 2; j++) 
				{ 
					matriceTwo[i][j]= matriceTwo[i][j]+constant;
					System.out.printf("[ " +  matriceTwo[i][j] + " ]");
				} 
				System.out.println();
			}
		}
		else if (option==4)
		{
			System.out.println();
			System.out.println("Matriz 1= ");
			for ( i = 0; i < 2; i++) 
			{
				for ( j = 0; j < 2; j++) 
				{
					System.out.printf("[" + matriceOne[i][j] +  "]");
						
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Matriz 2= ");
			for ( i = 0; i < 2; i++) 
			{
				for ( j = 0; j < 2; j++) 
				{
					System.out.printf("[" + matriceTwo[i][j] + "]");		
				}
				System.out.println();
			} 
		}
		else 
		{
			System.out.println("Insira um n�mero v�lido.");
		}
	}
	
}

