package listaRepeticaop;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R = 0;
		
		for (int contador = 1; contador <= 10; ++contador) {
			System.out.print("\nDigite o " + contador + "� n�mero: ");
			int numero = input.nextInt();
			R += numero;
		}
		System.out.print("A m�dia dos 10 n�meros informados � igual a " + (R/10));

	}

}
