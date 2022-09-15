package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio01 {

	static int lerIdade(int idade) {
		Scanner input = new Scanner(System.in);
		System.out.print("IDADE DO NADADOR: ");
		idade = input.nextInt();
		return idade;
	}

	static void imprimirIdade(int idade) {
		Scanner input = new Scanner(System.in);
		String categoria = " ";
		if (idade <= 10) {
			categoria = "MIRIM";
		} else {
			if (idade >= 11 && idade <= 14) {
				categoria = "INFANTIL";
			} else {
				if (idade >= 15 && idade <= 19) {
					categoria = "JUVENIL";
				} else {
					if (idade > 19) {
						categoria = "ADULTO";
					}
				}

			}
		}
		System.out.print("CATEGORIA DO ATLETA: " + categoria);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = 0;
		idade = lerIdade(idade);
		imprimirIdade(idade);

	}

}
