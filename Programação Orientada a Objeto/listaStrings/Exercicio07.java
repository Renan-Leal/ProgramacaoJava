package listaStrings;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();

		for (int i = 0; i < palavra.length() - 1; i++) {
			System.out.println(palavra.substring(0,i+1));

		}
		for (int i = palavra.length() - 1; i >= 0; i--) {
			System.out.println(palavra.substring(0, i + 1));

		}

	}

}
