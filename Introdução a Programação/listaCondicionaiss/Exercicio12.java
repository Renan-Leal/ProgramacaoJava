package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();

		System.out.print("Digite o ano do seu nascimento: ");
		int anoNascimento = input.nextInt();

		System.out.print("Digite o ano em que ingressou na empresa: ");
		int anoIngresso = input.nextInt();

		int idade = 2022 - anoNascimento;
		int tempoServico = 2022 - anoIngresso;

		System.out.print("\nNOME DO FUNCION�RIO: " + nome);
		System.out.print("\nIDADE DO FUNCION�RIO: " + idade);
		System.out.print("\nTEMPO DE SERVI�O AT� O ANO ATUAL: " + tempoServico);

		if (idade < 65 || tempoServico < 30 || idade < 65 && tempoServico < 25) {
			System.out.print("\nN�O REQUERER APOSENTADORIA.");
		} else {
			System.out.print("\nREQUERER APOSENTADORIA.");
		}
	}

}
