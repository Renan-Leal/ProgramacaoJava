package entradaSaidaa;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int N1 = input.nextInt();
	
		int sucessor = N1 + 1;
		int antecessor = N1 - 1;
	
		System.out.println("O n�mero sucessor a " + N1 + " � igual a " + sucessor);
		System.out.print("O n�mero antecessor a " + N1 + " � igual a " + antecessor);

	}

}
