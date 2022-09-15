package listaStrings;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = input.nextLine();
		
		char[] palavraNova = palavra.toCharArray();
		
		for (int i = palavraNova.length - 1; i >= 0; i--) {
			System.out.print(palavraNova[i] + " ");
			
			
		}

	}

}
