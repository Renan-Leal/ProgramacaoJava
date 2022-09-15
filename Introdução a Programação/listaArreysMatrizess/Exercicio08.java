package listaArreysMatrizess;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int matrizA[][] = new int[3][3];
		int matrizB[][] = new int[3][3];
		int matrizResultado[][] = new int[3][3];

		// PREENCHENDO MATRIZ A
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("informe o valor da posição da matriz A:["+ i +"]["+ j +"]: ");
				matrizA[i][j] = input.nextInt();

			}

		}
		System.out.println();
		// PREENCHENDO MATRIZ B
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.print("Informe o valor da posição da matriz B["+ i +"]["+ j +"]: ");
				matrizB[i][j] = input.nextInt();

			}
		}
		System.out.println("\nMATRIZ A: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("\nMATRIZ B: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nMATRIZ RESULTADO: ");
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i ].length; j++) {
				matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(matrizResultado[i][j] + " ");

			}
			System.out.println();
		}
	}
}