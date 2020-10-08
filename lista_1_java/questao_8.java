/*Lista 1 Programação Sequencial: 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package lista_1_java;

import java.util.*;

public class questao_8 
{
	public static void main (String args[])
	{
		Scanner read= new Scanner (System.in);
		
		float custoConsumidor, custoFabrica, porcDistribuidor, porcImposto;
		
		System.out.println("Escreva o custo de fábrica do carro R$ ");
		custoFabrica= read.nextFloat();
		
		porcDistribuidor= (custoFabrica*28)/100;
		porcImposto= (custoFabrica*45)/100;
		custoConsumidor= custoFabrica + porcDistribuidor + porcImposto;
		
		System.out.println("O custo do carro para o consumirdor é R$ " + custoConsumidor);
		
	}
}
