package listaRepeticaop;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int resposta = 0;
		do {
			
			System.out.print("Digite um número de 1 a 10: ");
			int numero = input.nextInt();
			
			for (int contador = 1; contador <= 10; ++contador) {
				int R = numero * contador;
				System.out.println(numero + " x " + contador + " = " + R);

			}
			System.out.print("Quer continuar? (1 para SIM // 2 para NAO): ");
			resposta = input.nextInt();
		
		} while (resposta == 1);
		  System.out.print("SAINDO. . .");

	}
}
