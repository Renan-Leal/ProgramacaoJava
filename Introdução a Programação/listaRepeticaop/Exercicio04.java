package listaRepeticaop;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R = 0;
		
		for (int contador = 1; contador <= 10; ++contador) {
			System.out.print("\nDigite o " + contador + "° número: ");
			int numero = input.nextInt();
			R += numero;
		}
		System.out.print("A média dos 10 números informados é igual a " + (R/10));

	}

}
