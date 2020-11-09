/*Lista Collection: 3) Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/ 

package lista_8_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class questao3Estoque 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int option;

		Collection<String> estoque = new ArrayList<>();

		System.out.println("Produtos no estoque: " + estoque);

		do {
			System.out.println("\n-------------    Menu    ----------------\n");
			System.out.println("1 - Adicionar produto ao estoque\n");
			System.out.println("2 - Remover produto do estoque\n");
			System.out.println("3 - Atualizar um produto do estoque\n");
			System.out.println("4 - Listar produtos em estoque\n");
			System.out.println("0 - Para finalizar o programa\n");
			System.out.println("-------------------------------------------\n");
			System.out.println("Digite o número da opção para executá-la:\n");
			System.out.println("-------------------------------------------\n");
			option = read.nextInt();

			switch (option) 
			{
			case 1:
				System.out.println("Digite o nome do produto para adicionar");
				String tempProduct = read.next();
				estoque.add(tempProduct);
				System.out.println("\nProduto adicionado!");
				break;

			case 2:
				System.out.println("Digite o nome do produto para remover do estoque");
				String tempProduct2 = read.next();
				estoque.remove(tempProduct2);
				System.out.println("\nProduto removido!");
				break;

			case 3:
				System.out.println("Digite o nome do produto para atualizar\n");
				String tempProduct3 = read.next();

				if (estoque.contains(tempProduct3)) 
				{
					System.out.println("Digite o novo nome do produto:\n");
					String novoNome = read.next();

					estoque.remove(tempProduct3);
					estoque.add(novoNome);

					System.out.println("\nProduto atualizado!");
				} 
			else {
					System.out.println(tempProduct3 + " está fora de estoque.\n");
				}
				break;

			case 4:
				System.out.println("Produtos no estoque:\n");
				for (String Produto : estoque) 
				{
					System.out.println(Produto + "\n");
				}
				break;
				
			default:
				System.out.println("Ops! Opção inválida. Tente novamente.");
			}
			
		} 
		while (option != 0);
		System.out.println("Fim do programa!");
	}
}
