package  listaCondicionaiss;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Hor�rio de inicio do jogo: ");
		int inicio = input.nextInt();

		System.out.print("Hor�rio do t�rmino do jogo: ");
		int termino = input.nextInt();

		if (inicio > termino) {
			int resultado = 24 - (inicio - termino);
			System.out.print("Dura��o do jogo: " + resultado);

		}
		if (inicio <= termino) {
			int resultado = termino - inicio + 1;
			System.out.print("Dura��o do jogo: " + resultado);

		}
	}

}
