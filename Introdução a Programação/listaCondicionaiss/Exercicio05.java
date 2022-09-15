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
		
		System.out.print("Quantidade M�nima: ");
		int capacidadeMin = input.nextInt();
		
		System.out.print("Quantidade M�xima: ");
		int capacidadeMax = input.nextInt();

		// Declarando as vari�veis necess�rias para valida��o do estoque:
		int capacidadeMedia = (capacidadeMin + capacidadeMax) / 2;

		// Estrutura para valida��o do estoque:
		if (qtdeProduto >= capacidadeMedia) {
			System.out.println("N�o � necess�rio efetuar a compra de  " + produto + ".");
		} else {
			System.out.println("Efetuar a compra de " + produto + ".");
		}

		// Vizualiza��o final do c�digo:
		System.out.println("CAPACIDADE M�NIMA DE ESTOQUE: " + capacidadeMin);
		System.out.println("CAPACIDADE M�DIA DE ESTOQUE: " + capacidadeMedia);
		System.out.println("CAPACIDADE M�XIMA DE ESTOQUE: " + capacidadeMax);

	}

}
