package  listaCondicionaiss;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Horário de inicio do jogo: ");
		int inicio = input.nextInt();

		System.out.print("Horário do término do jogo: ");
		int termino = input.nextInt();

		if (inicio > termino) {
			int resultado = 24 - (inicio - termino);
			System.out.print("Duração do jogo: " + resultado);

		}
		if (inicio <= termino) {
			int resultado = termino - inicio + 1;
			System.out.print("Duração do jogo: " + resultado);

		}
	}

}
