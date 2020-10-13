package jogo_da_velha;

import java.util.Scanner;

public class JvMain 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		JV jogo = new JV();
		String posicao;
		int valida = 0, jogadas = 0;
		
		while(true) 
		{
			System.out.print(":::::Jogo da Velha:::::\n");
			jogo.Mostrar();
			
			do 
			{
				System.out.print("Jogador X, informe uma posição: ");
				posicao = ler.next();
				
				while(!jogo.Valido(posicao)) 
				{
					System.out.println("Jogada inválida, tente novamente!");
					System.out.print("Jogador X, informe uma posição: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
			} while(valida == 0);		
			
			jogadas++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhou(jogadas).equals("null")) 
			{
				break;
			}
			
			do 
			{
				System.out.print("Jogador O, informe uma posição: ");
				posicao = ler.next();
				while(!jogo.Valido(posicao)) 
				{
					System.out.println("Jogada inválida, tente novamente!");
					System.out.print("Jogador O, informe uma posição: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
				
			} while(valida == 0);
			
			jogadas++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Ganhou(jogadas).equals("null")) 
			{
				break;
			}
		}
		
		if (jogo.Ganhou(jogadas) == "Empate") 
		{
			System.out.println("Empate!!!");
		} 
		else 
		{
		System.out.println("O "+jogo.Ganhou(jogadas)+" venceu!");
		}
	}
}
