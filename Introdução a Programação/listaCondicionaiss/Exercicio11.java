package listaCondicionaiss;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		System.out.print("Digite a primeira nota: ");
		double N1 = input.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double N2 = input.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double N3 = input.nextDouble();

		double media = (N1 + N2 + N3) / 3;
		double mediaAproveitamento = (N1 + (N2 * 2) + (N3 * 3) + media) / 7;
		System.out.print("MÉDIA DO APROVEITAMENTO DO ALUNO: " + formatador.format(mediaAproveitamento));

		if (mediaAproveitamento >= 9) {
			char aproveitamentoAluno = 'A';
			System.out.println("\nMÉDIA DE APROVEITAMENTO DO ALUNO: CONCEITO " + aproveitamentoAluno);

		} else {
			if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
				char aproveitamentoAluno = 'B';
				System.out.print("\nMÉDIA DE APROVEITAMENTO DO ALUNO: CONCEITO " + aproveitamentoAluno);

			} else {
				if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
					char aproveitamentoAluno = 'C';
					System.out.print("\nMÉDIA DE APROVEITAMENTO DO ALUNO: CONCEITO " + aproveitamentoAluno);
				} else {
					char aproveitamentoAluno = 'D';
					System.out.print("\nMÉDIA DE APROVEITAMENTO DO ALUNO: CONCEITO " + aproveitamentoAluno);

				}

			}

		}
	}
}
