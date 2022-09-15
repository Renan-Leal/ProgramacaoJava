package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio12 {
	static void menu() {
		System.out.println("DIGITE A OPERA��O QUE VOC� DESEJA: ");
		System.out.println("1 - ADI��O");
		System.out.println("2 - SUBTRA��O");
		System.out.println("3 - DIVIS�O");
		System.out.println("4 - MULTIPLICA��O");
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
			System.out.print("\nDigite o primeiro n�mero: ");
			n1 = input.nextInt();
			System.out.print("Digite o segundo n�mero: ");
			n2 = input.nextInt();
			System.out.print("\nQual opera��o voc� deseja efetuar: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				resultado = somar(n1, n2);
				System.out.print("RESULTADO DA SOMA: " + resultado);
				break;

			case 2:
				resultado = subtrair(n1, n2);
				System.out.println("RESULTADO DA SUBTRA��O: " + resultado);
				break;

			case 3:
				resultado = dividir(n1, n2);
				System.out.println("RESULTADO DA DIVIS�O: " + resultado);
				break;

			case 4:
				resultado = multiplicar(n1, n2);
				System.out.println("RESULTADO DA MULTIPLICA��O: " + resultado);
				break;

			case 5:
				System.out.println("SAINDO. . .");
				break;

			default:
				System.out.println("\nOp��o inv�lida, digite novamente!");
			}

		} while (opcao != 5);

	}
}
