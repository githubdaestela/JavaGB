/*Lista 1 Programa��o Sequencial: 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/

package lista_1_java;

import java.util.*;

public class questao_5 
{
	public static void main (String args[]) 
	{
		Scanner ler= new Scanner (System.in);
		float n1, n2, n3, media;
		
		System.out.println("Escreva a primeira nota du alune: ");
		n1= ler.nextInt();
		System.out.println("Escreva a segunda nota du alune: ");
		n2= ler.nextInt();
		System.out.println("Escreva a terceira nota du alune: ");
		n3= ler.nextInt();
		
		media= ((n1*2) + (n2*3) + (n3*5))/(2+3+5);
		System.out.println("A m�dia final du alune � " + media);
	}
}
