package listaStrings;

import java.util.Scanner;

public class Exercicio03 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 0;
		
		System.out.print("Digite o texto: ");
		String texto = input.nextLine();
		
		texto = texto.replace(".", "");
		String[] palavras = texto.split(" ");
		
		
		System.out.println("Texto digitado: " + texto);
		System.out.print("O seu texto contém " + palavras.length + " palavras.");

	}

}
