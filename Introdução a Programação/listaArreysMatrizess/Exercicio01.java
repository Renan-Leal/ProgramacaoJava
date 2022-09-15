package listaArreysMatrizess;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] nomes = new String[10];

		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite um nome: ");
			nomes[i] = input.nextLine();
		}
		for (int i = 0; i < nomes.length; i++) {
			System.out.print (i + "° nome: " + nomes[i] + "|");
		}
		System.out.print("\n");
		System.out.print("\n");
		for (int i = nomes.length -1; i >= 0; i--) {   
			System.out.print (i + "° nome: " + nomes[i] + "|");
		}
		
	}

}
