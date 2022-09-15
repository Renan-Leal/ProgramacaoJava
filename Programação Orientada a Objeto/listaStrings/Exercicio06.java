package listaStrings;

import java.util.Scanner;

public class Exercicio06 {
	static int contarVogais(String palavra) {
		int[] vogais_contadas = Exercicio05.contarVogais(palavra);
		int qtde_vogais = 0;
		
		for (int i = 0; i < vogais_contadas.length; i++) {
			qtde_vogais += vogais_contadas[i];
		}
		
		return qtde_vogais;


	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();
		
		System.out.println("Número de caracteres da palavra: " + palavra.length());
		System.out.println("Palavra digitada: " + palavra.toUpperCase());
		System.out.println("Quantidade de vogais: " + contarVogais(palavra));
		System.out.println("Primeiras letras da palavra digitada pelo usuário: " + palavra.startsWith(input.nextLine()));
		System.out.println("Primeiras letras da palavra digitada pelo usuário: " + palavra.endsWith(input.nextLine()));

	}

}
