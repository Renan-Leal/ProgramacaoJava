package listaStrings;

import java.util.Scanner;

public class Exercicio10 {
	static String converter_numeros(String numero) {
		char[] conversor = numero.toCharArray();
		String numeroConvertido = "";

		for (int i = 0; i < conversor.length; i++) {
			if (conversor[i] == '0') {
				numeroConvertido = numeroConvertido.concat("Zero ");

			}
			if (conversor[i] == '1') {
				numeroConvertido = numeroConvertido.concat("Um ");

			}
			if (conversor[i] == '2') {
				numeroConvertido = numeroConvertido.concat("Dois ");

			}
			if (conversor[i] == '3') {
				numeroConvertido = numeroConvertido.concat("Três ");

			}
			if (conversor[i] == '4') {
				numeroConvertido = numeroConvertido.concat("Quatro ");

			}
			if (conversor[i] == '5') {
				numeroConvertido = numeroConvertido.concat("Cinco ");

			}
			if (conversor[i] == '6') {
				numeroConvertido = numeroConvertido.concat("Seis ");

			}
			if (conversor[i] == '7') {
				numeroConvertido = numeroConvertido.concat("Sete ");

			}
			if (conversor[i] == '8') {
				numeroConvertido = numeroConvertido.concat("Oito ");

			}
			if (conversor[i] == '9') {
				numeroConvertido = numeroConvertido.concat("Nove ");

			}
			
		}
		return numeroConvertido;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		String numero = input.nextLine();

		String numeroConvertido = converter_numeros(numero);
		
		System.out.print("Número convertido: " + numeroConvertido);
	}

}
