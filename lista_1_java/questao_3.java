/*Lista 1 Programação Sequencial: 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package lista_1_java;

import java.util.*;

public class questao_3 
{
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		
		float tempo, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de duração do evento da fábrica em segundos: ");
		tempo= ler.nextInt();
		
		horas=tempo/3600;
		minutos=(tempo%3600)/60;
		segundos= (tempo%3600)%60;
		
		System.out.println("O evento da fábrica durou "+ horas + " horas " + minutos + " minutos " + segundos + " segundos.");
		
	}
}
