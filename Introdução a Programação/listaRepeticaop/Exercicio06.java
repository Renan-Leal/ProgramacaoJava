package listaRepeticaop;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int verificadorPar = 0;
		int contadorPar = 0;

		for (int contador = 1; contador <= 10; ++contador) {
			System.out.print("\nDigite o " + contador + "° número: ");
			int numero = input.nextInt();

			verificadorPar = numero % 2;

			if (verificadorPar == 0) {
				contadorPar += 1;
			}

		}
		System.out.print("\nEntre os 10 números digitados, " + contadorPar + " são pares.");
	}

}
