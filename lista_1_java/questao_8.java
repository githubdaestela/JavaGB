/*Lista 1 Programa��o Sequencial: 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/

package lista_1_java;

import java.util.*;

public class questao_8 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
		
		float custoConsumidor, custoFabrica, porcDistribuidor, porcImposto;
		
		System.out.println("Escreva o custo de f�brica do carro R$ ");
		custoFabrica= read.nextFloat();
		
		porcDistribuidor= (custoFabrica*28)/100;
		porcImposto= (custoFabrica*45)/100;
		custoConsumidor= custoFabrica + porcDistribuidor + porcImposto;
		
		System.out.println("O custo do carro para o consumirdor � R$ " + custoConsumidor);
		
	}
}
