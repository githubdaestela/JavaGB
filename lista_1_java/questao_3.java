/*Lista 1 Programa��o Sequencial: 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package lista_1_java;

import java.util.*;

public class questao_3 
{
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		
		float tempo, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de dura��o do evento da f�brica em segundos: ");
		tempo= ler.nextInt();
		
		horas=tempo/3600;
		minutos=(tempo%3600)/60;
		segundos= (tempo%3600)%60;
		
		System.out.println("O evento da f�brica durou "+ horas + " horas " + minutos + " minutos " + segundos + " segundos.");
		
	}
}
