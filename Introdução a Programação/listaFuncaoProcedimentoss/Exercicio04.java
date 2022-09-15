package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio04 {
	static int contabilizarPares(int[][] matriz) {
		int contadorPares = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if ((matriz[i][j] % 2) == 0) {
					contadorPares += 1;
				}
			}
		}
		return contadorPares;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matrizA[][] = new int[3][4];
		int qtdepares = 0;

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("Digite o " + i + "° número: ");
				matrizA[i][j] = input.nextInt();

			}

		}
		qtdepares = contabilizarPares(matrizA);
		System.out.println("QUANTIDADE DE NÚMEROS PARES: " + qtdepares);
	}

}
