package listaFuncaoProcedimentoss;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {
	static int[] ordenarParesImpares(int[] numeros) {
		int[] arreyOrdenado = new int[numeros.length];
		int contador = 0;

		Arrays.sort(numeros);

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				arreyOrdenado[contador] = numeros[i];
				contador++;

			}
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				arreyOrdenado[contador] = numeros[i];
				contador++;

			}
		}
		return arreyOrdenado;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i +1) + "° número: ");
			numeros[i] = input.nextInt();

		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");

		}
		System.out.println("\n---------------------");
		
		numeros = ordenarParesImpares(numeros);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");

		}

	}

}
