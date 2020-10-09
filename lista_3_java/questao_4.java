/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas;
o n�mero de mulheres nervosas;
o n�mero de homens agressivos;
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.*/

package lista_3_java;

import java.util.*;

public class questao_4 
{
	public static void main (String args[])
	{
		Scanner input= new Scanner (System.in);
		int x=1, age, genero, humor;
		int acmHumor=0, acmFNervosa=0, acmMAgressivo=0, acmNbinarieCalme=0, acmNervose40=0, acmCalme18=0; 
		
		while (x < 150)
		{
		System.out.println("Escreva a sua idade: ");
		age= input.nextInt();
		
		System.out.println("(1) Femenino  (2) Masculino (3) N�o-Binare");
		System.out.println("Selecione o n�mero correspondente a sua indentidade de g�nero: ");
		genero= input.nextInt();
		
		System.out.println("(1) Calma  (2) Nervosa (3) Agressiva");
		System.out.println("Selecione o n�mero com o qual se identifica: ");
		humor= input.nextInt();
		
		if(humor == 1) 
		{ acmHumor++; }
		if(genero == 1 && humor == 2) 
		{ acmFNervosa++; }
		if(genero == 2 && humor == 3) 
		{ acmMAgressivo++; }
		if(genero == 3 && humor == 1) 
		{ acmNbinarieCalme++; }
		if(humor == 2 && age > 40) 
		{ acmNervose40++; }
		if(humor == 1 && age < 18) 
		{ acmCalme18++; }
		x++;
		}
		
		System.out.printf("\nN�mero de pessoas calmas: ", acmHumor);
		System.out.printf("\nN�mero de mulheres nervosas: ", acmFNervosa);
		System.out.printf("\nN�mero de homens agressivos: ", acmMAgressivo);
		System.out.printf("\nN�mero de n�o bin�rios calmos: ", acmNbinarieCalme);
		System.out.printf("\nN�mero de pessoas nervosas com mais de 40 anos: ", acmNervose40);
		System.out.printf("\nN�mero de pessoas calmas com menos de 18 anos: ", acmCalme18);	
	}
}
