/* Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.*/

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
		
		System.out.println("(1) Femenino  (2) Masculino (3) Não-Binare");
		System.out.println("Selecione o número correspondente a sua indentidade de gênero: ");
		genero= input.nextInt();
		
		System.out.println("(1) Calma  (2) Nervosa (3) Agressiva");
		System.out.println("Selecione o número com o qual se identifica: ");
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
		
		System.out.printf("\nNúmero de pessoas calmas: ", acmHumor);
		System.out.printf("\nNúmero de mulheres nervosas: ", acmFNervosa);
		System.out.printf("\nNúmero de homens agressivos: ", acmMAgressivo);
		System.out.printf("\nNúmero de não binários calmos: ", acmNbinarieCalme);
		System.out.printf("\nNúmero de pessoas nervosas com mais de 40 anos: ", acmNervose40);
		System.out.printf("\nNúmero de pessoas calmas com menos de 18 anos: ", acmCalme18);	
	}
}
