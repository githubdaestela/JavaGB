/*Lista 1 Programação Sequencial: 6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula d= raiz((x2-x1)^2 + (y2-y1)^2) 
que efetua tal cálculo é:*/

package lista_1_java;

import java.util.*;
import java.math.*;

public class questao_6
{
	public static void main (String args[]) 
	{
		Scanner read= new Scanner (System.in);
		
		float x1, y1, x2, y2, d;
		
		System.out.println("Considerando dois pontos qualquer no plano P(x1, y1) e P(x2, y2)");
		System.out.println("Insira o valor de x1: ");
		x1= read.nextFloat();
		System.out.println("Insira o valor de y1: ");
		y1= read.nextFloat();
		System.out.println("Insira o valor de x2: ");
		x2= read.nextFloat();
		System.out.println("Insira o valor de y2: ");
		y2= read.nextFloat();
		
		d= (float) Math.sqrt(Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2)));
		System.out.println("A ditância entre P(" + x1);
	}
}
