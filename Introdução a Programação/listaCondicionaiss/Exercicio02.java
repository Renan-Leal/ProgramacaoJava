package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Recebendo primeira NOTA:
		System.out.print("Digite a primeira nota do aluno: ");
		double N1 = input.nextDouble();

		// Recebendo segunda NOTA:
		System.out.print("Digite a segunda nota do aluno: ");
		double N2 = input.nextDouble();

		// Verificando e mostrando a m�dia do ALUNO:
		double media = (N1 + N2) / 2;
		System.out.println("M�dia do aluno: " + media);

		// Verificando se o aluno est� APROVADO, EM REC ou REPROVADO:
		if (media >= 4 && media <= 6) {
			System.out.print("ALUNO EM RECUPERA��O");
		} else {
			if (media >= 7) {
				System.out.print("ALUNO APROVADO");
			} else {
				System.out.print("ALUNO REPROVADO");

			}

		}

	}

}
