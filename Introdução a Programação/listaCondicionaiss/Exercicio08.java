package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Recebendo informações do usuário.
		System.out.print("Digite o Login: ");
		int login = input.nextInt();

		System.out.print("Digite a senha: ");
		int senha = input.nextInt();

		// Caso LOGIN for diferente:
		if (login != 12345) {
			System.out.print("USUÁRIO INVÁLIDO");

		// Caso LOGIN for correto e a senha diferente:
		} else {
			if (senha != 54321) {
				System.out.print("SENHA INCORRETA");
			
			// Caso ambos estiverem corretos:	
			} else {
				System.out.print("ACESSO PERMITIDO");
			}

			

		}

	}

}
