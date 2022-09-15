package listaStrings;

import java.util.Scanner;


public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		String[] nomeNovo = nome.split(" ");
		
		conversorNomeBibliografico(nomeNovo);
		

	}

	private static void conversorNomeBibliografico(String[] nomeNovo) {
		System.out.print(nomeNovo[nomeNovo.length-1].substring(0, 1).toUpperCase() + nomeNovo[nomeNovo.length-1].substring(1) + ".");
		
		for (int i = 0; i < nomeNovo.length - 1; i++) {
			System.out.print(" " + nomeNovo[i].substring(0, 1).toUpperCase() + nomeNovo[i].substring(1) + "" );
			
		}
		System.out.print(".");
		
	}

}
