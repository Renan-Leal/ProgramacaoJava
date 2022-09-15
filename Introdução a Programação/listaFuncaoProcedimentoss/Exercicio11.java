package listaFuncaoProcedimentoss;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
	static int[] ordenarCrescente(int[] numeros) {
		int[] ordenado = numeros;
		Arrays.sort(ordenado);
		return ordenado;
	}

	static int[] ordenarDecrescente(int[] numeros) {
		int[] ordenado = new int[numeros.length];

		for (int indice = 0; indice < numeros.length; indice++) {
			for (int i = 0; i < (numeros.length - 1); i++) {
				if (numeros[i] > numeros[i + 1]) {
					int aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;

				}
			}

		}
		return ordenado;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] numerosCrescentes = new int[numeros.length];
		int[] numerosDecrescentes = new int[numeros.length];
		int opcao = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			numeros[i] = input.nextInt();
		}
		System.out.print("TECLE A OPÇÃO QUE VOCÊ DESEJA (1-CRESCENTE)(2-DECRESCENTE)(3-SAIR): ");
		opcao = input.nextInt();
		if (opcao == 1) {
			numerosCrescentes = ordenarCrescente(numeros);
			for (int i = 0; i < numerosCrescentes.length; i++) {
				System.out.print(numerosCrescentes[i] + " ");
			}

		} else {
			if (opcao == 2) {
				numerosDecrescentes = ordenarDecrescente(numeros);
				for (int i = 0; i < numerosDecrescentes.length; i++) {
					System.out.print(numerosDecrescentes[i] + " ");
				}

			} else {
				System.out.print("SAINDO . . .");
			}
		}

	}

}
