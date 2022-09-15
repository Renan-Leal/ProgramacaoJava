package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio06 {
	static void verificarMenorValor(int[][] matriz) {
		int menorValor = matriz[0][0];
		int linha = 0;
		int coluna = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (menorValor > matriz[i][j]) {
					menorValor = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("MENOR VALOR: " + menorValor);
		System.out.print("LINHA: " + linha + " | " + "COLUNA: " + coluna);	
}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matrizA[][] = new int[3][3];

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
		verificarMenorValor(matrizA);

	}

}
