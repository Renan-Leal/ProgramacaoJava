package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio07 {
	static boolean verificarPrimo(int numero) {
		if(numero == 1) {
			return false;
		}
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
				}
			}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("DIGITE UM NÚMERO: ");
		int numero = input.nextInt();

		if (verificarPrimo(numero)) {
			System.out.print("O NÚMERO INFORMADO É PRIMO");
		} else {
			System.out.print("O NÚMERO INFORMADO NÃO É PRIMO");
		}

	}

}
