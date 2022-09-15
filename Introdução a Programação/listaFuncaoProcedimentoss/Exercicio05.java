package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio05 {
	static int calcularDiagonal(int[][] matriz) {
		int soma = 0;
		soma = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];

		return soma;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		int soma = 0;

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("Digite o valor do número na posição [" + i + "][" + j + "]: ");
				matrizA[i][j] = input.nextInt();
			}

		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		soma = calcularDiagonal(matrizA);
		System.out.print("SOMA DOS VALORES DADIAGONAL PRINCIPAL: " + soma);

	}

}
