package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Recebendo nome do produto:
		System.out.print("Nome do produto: ");
		String produto = input.nextLine();

		// Recebendo a quantidade de unidades:
		System.out.print("Quantidade de produtos: ");
		int qtdeProduto = input.nextInt();
		
		System.out.print("Quantidade Mínima: ");
		int capacidadeMin = input.nextInt();
		
		System.out.print("Quantidade Máxima: ");
		int capacidadeMax = input.nextInt();

		// Declarando as variáveis necessárias para validação do estoque:
		int capacidadeMedia = (capacidadeMin + capacidadeMax) / 2;

		// Estrutura para validação do estoque:
		if (qtdeProduto >= capacidadeMedia) {
			System.out.println("Não é necessário efetuar a compra de  " + produto + ".");
		} else {
			System.out.println("Efetuar a compra de " + produto + ".");
		}

		// Vizualização final do código:
		System.out.println("CAPACIDADE MÍNIMA DE ESTOQUE: " + capacidadeMin);
		System.out.println("CAPACIDADE MÉDIA DE ESTOQUE: " + capacidadeMedia);
		System.out.println("CAPACIDADE MÁXIMA DE ESTOQUE: " + capacidadeMax);

	}

}
