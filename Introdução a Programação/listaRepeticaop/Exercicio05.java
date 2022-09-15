package listaRepeticaop;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contadorNegativo = 0;

		for (int contador = 1; contador <= 10; ++contador) {
			System.out.print("\nDigite o " + contador + "° número: ");
			int numero = input.nextInt();
			if (numero < 0) {
				contadorNegativo += 1;
			}

		}
		System.out.print("\nEntre os 10 números digitados, " + contadorNegativo + " são negativos." );

	}
}