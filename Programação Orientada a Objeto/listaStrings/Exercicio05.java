package listaStrings;

import java.util.Scanner;

public class Exercicio05 {
	static int[] contarVogais(String frase) {
		char[] nova_frase = frase.toCharArray();
		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		int[] vogaisContadas = new int[vogais.length];

		for (int i = 0; i < nova_frase.length; i++) {
			char vogal = nova_frase[i];
			if (vogais[0] == vogal) {
				vogaisContadas[0]++;
			}
			if (vogais[1] == vogal) {
				vogaisContadas[1]++;

			}
			if (vogais[2] == vogal) {
				vogaisContadas[2]++;
			}
			if (vogais[3] == vogal) {
				vogaisContadas[3]++;
			}
			if (vogais[4] == vogal) {
				vogaisContadas[4]++;

			}

		}
		return vogaisContadas;

	}

	static void exibirQuantidadeVogais(int[] vogaisContadas) {
		System.out.print("\nA vogal A aparece " + vogaisContadas[0] + " vez na frase.");
		System.out.print("\nA vogal E aparece " + vogaisContadas[1] + " vez na frase.");
		System.out.print("\nA vogal I  aparece " + vogaisContadas[2] + " vez na frase.");
		System.out.print("\nA vogal O  aparece " + vogaisContadas[3] + " vez na frase.");
		System.out.print("\nA vogal U  aparece " + vogaisContadas[4] + " vez na frase.");
		

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = input.nextLine().toLowerCase();

		System.out.println("Frase digitada:");
		System.out.println(frase);
		
		int[] vogaisContadas = contarVogais(frase);
		exibirQuantidadeVogais(vogaisContadas);
		

	}
}