/*Lista 1 Programação Sequencial: 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D=(R+S)/2. Onde R=(A+B)^2 e S=(B+C)^2*/

package lista_1_java;

import java.util.*;

public class questao_4
{
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		
		int a, b, c, R, S, D;
		
		System.out.println("Digite o valor de a: ");
		a= ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b= ler.nextInt();
		System.out.println("Digite o valor de c: ");
		c= ler.nextInt();
		
		R= (a+b)*(a+b);
		S=(b+c)*(b+c);
		D=(R+S)/2;
		
		System.out.println("O valor de D é: "+ D);
	}

}

