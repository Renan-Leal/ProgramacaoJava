package listaRepeticaop;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int N1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int N2 = input.nextInt();
		
		while (N2 == 0) {
			System.out.print("Valor inv�lido, Digite novamente: ");
			N2 = input.nextInt();
		}
		System.out.print("A divis�o do primeiro n�mero e segundo �: " + (N1/N2));
		
		
		
		

	}

}
