/*Lista 1 Programação Sequencial: 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
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
		System.out.println("A média final du alune é " + media);
	}
}
