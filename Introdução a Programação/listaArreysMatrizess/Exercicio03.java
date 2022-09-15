package listaArreysMatrizess;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] valores = new int[10];
		int contandoValor = 0;

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + i + "° número: ");
			valores[i] = input.nextInt();

		}
		System.out.print("Digite mais um número: ");
		int valor = input.nextInt();
		for (int i = 0; i < valores.length; i++) {
			if (valor == valores[i]) {
				contandoValor += 1;
			}

		}
		System.out.print("Entre os 10 números digitados, o número " + valor + " apareceu " + contandoValor + " vezes.");

	}

}
