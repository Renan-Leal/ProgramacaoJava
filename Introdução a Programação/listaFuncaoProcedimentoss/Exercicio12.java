package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio12 {
	static void menu() {
		System.out.println("DIGITE A OPERAÇÃO QUE VOCÊ DESEJA: ");
		System.out.println("1 - ADIÇÃO");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - DIVISÃO");
		System.out.println("4 - MULTIPLICAÇÃO");
		System.out.println("5 - SAIR");
	}

	static int somar(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}

	static int subtrair(int n1, int n2) {
		int resultado = n1 - n2;
		return resultado;
	}

	static double dividir(int n1, int n2) {
		double resultado = n1 / n2;
		return resultado;
	}

	static int multiplicar(int n1, int n2) {
		int resultado = n1 * n2;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int opcao = 0;
		double resultado = 0;

		menu();
		
		do {
			System.out.print("\nDigite o primeiro número: ");
			n1 = input.nextInt();
			System.out.print("Digite o segundo número: ");
			n2 = input.nextInt();
			System.out.print("\nQual operação você deseja efetuar: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				resultado = somar(n1, n2);
				System.out.print("RESULTADO DA SOMA: " + resultado);
				break;

			case 2:
				resultado = subtrair(n1, n2);
				System.out.println("RESULTADO DA SUBTRAÇÃO: " + resultado);
				break;

			case 3:
				resultado = dividir(n1, n2);
				System.out.println("RESULTADO DA DIVISÃO: " + resultado);
				break;

			case 4:
				resultado = multiplicar(n1, n2);
				System.out.println("RESULTADO DA MULTIPLICAÇÃO: " + resultado);
				break;

			case 5:
				System.out.println("SAINDO. . .");
				break;

			default:
				System.out.println("\nOpção inválida, digite novamente!");
			}

		} while (opcao != 5);

	}
}
