/*Lista 1 Programação Sequencial: 7. Um sistema de equações lineares do tipo:ax+by = c   E   dx+ey=f pode 
ser resolvido segundo mostrado abaixo : x=(ce-bf)/ (ae-cd)   E  y(=af-cd)/(ae-bd). Escreva um sistema que
lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.*/

package lista_1_java;

import java.util.*;

public class questao_7 
{
	public static void main (String args[])
	{
		Scanner leia= new Scanner (System.in);
		float a, b, c, d, e, f, x, y; 
		
		System.out.println("Das equações ax+by=c e dx+ey=f");
		System.out.println("Insira o valor de a: ");
		a= leia.nextFloat();
		System.out.println("Insira o valor de b: ");
		b= leia.nextFloat();
		System.out.println("Insira o valor de c: ");
		c= leia.nextFloat();
		System.out.println("Insira o valor de d: ");
		d= leia.nextFloat();
		System.out.println("Insira o valor de e: ");
		e= leia.nextFloat();
		System.out.println("Insira o valor de f: ");
		f= leia.nextFloat();

		x= (c*e)-(b*f)/(a*e)-(c*d);
		y= (a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println("O valor de x é " + x + " e o valor de y é " + y);
	}
}
