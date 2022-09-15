package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Captando nome dos times.
		System.out.print("Digite o nome do primeiro time: ");
		String time1 = input.nextLine();
		System.out.print("Digite o nome do segundo time: ");
		String time2 = input.nextLine();

		// Captando quantidade de gols
		System.out.print("Digite a quantidade de gols marcados pelo " + time1 + ": ");
		int qtdeTime1 = input.nextInt();
		System.out.print("Digite a quantidade de gols marcados  pelo " + time2 + ": ");
		int qtdeTime2 = input.nextInt();

		// Estrutura para verificar vencedor/empate + diferença de gols
		// CASO TIME 1 VENCER:
		if (qtdeTime1 > qtdeTime2) {
			System.out.println(time1 + " é o vencedor com a diferença de " + (qtdeTime1 - qtdeTime2) + " gols");

		} else {
			// CASO TIME 2 VENCER:
			if (qtdeTime1 < qtdeTime2) {
				System.out.println(time2 + " é o vencedor com a diferença de " + (qtdeTime2 - qtdeTime1) + " gols");

				// CASO OS TIMES EMPATAREM:
			} else {
				System.out.println("EMPATE");
			}

		}
	}
}
