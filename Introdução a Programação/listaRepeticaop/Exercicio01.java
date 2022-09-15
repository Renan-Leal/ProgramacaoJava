package listaRepeticaop;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int N1 = input.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int N2 = input.nextInt();
		
		while (N2 == 0) {
			System.out.print("Valor inválido, Digite novamente: ");
			N2 = input.nextInt();
		}
		System.out.print("A divisão do primeiro número e segundo é: " + (N1/N2));
		
		
		
		

	}

}
