package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio10 {
	static int verificarMenor(int[] arrey) {
		int menorNumero = arrey[0];
		for (int i = 0; i < arrey.length; i++) {
			if (menorNumero > arrey[i]) {
				menorNumero = arrey[i];
			}

		}
		return menorNumero;
	}

	static int verificarMaior(int[] arrey) {
		int maiorNumero = arrey[0];
		for (int i = 0; i < arrey.length; i++) {
			if (maiorNumero < arrey[i]) {
				maiorNumero = arrey[i];
			}

		}
		return maiorNumero;

	}

	static double calculoMedia(int[] arrey) {
		double media = 0;
		int acumulador = 0;
		for (int i = 0; i < arrey.length; i++) {
			acumulador += arrey[i];
		}
		media = acumulador / arrey.length;

		return media;
	}
	
	static void exibirResultados(int menorNumero, int maiorNumero, double media) {
		System.out.println("MENOR NÚMERO DO ARREY: " + menorNumero);
		System.out.println("MAIOR NÚMERO DO ARREY: " + maiorNumero);
		System.out.println("MÉDIA DA SOMA DOS NÚMEROS DO ARREY: " + media);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a quantidade de números a serem lidos: ");
		int qtdeNumeros = input.nextInt();
		int[] numeros = new int[qtdeNumeros];

		for (int i = 0; i < qtdeNumeros; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			numeros[i] = input.nextInt();

		}
		int menorNumero = verificarMenor(numeros);
		int maiorNumero = verificarMaior(numeros);
		double media = calculoMedia(numeros);
		
		exibirResultados(menorNumero, maiorNumero, media);
	}
	

}
