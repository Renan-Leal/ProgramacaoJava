package entradaSaidaa;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int N1 = input.nextInt();
	
		int sucessor = N1 + 1;
		int antecessor = N1 - 1;
	
		System.out.println("O número sucessor a " + N1 + " é igual a " + sucessor);
		System.out.print("O número antecessor a " + N1 + " é igual a " + antecessor);

	}

}
