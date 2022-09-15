package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio02 {
	static void imprimirPontuacao(int pontuacao) {
		String conceito = " ";
		if (pontuacao <= 60) {
			conceito = "INSATISFATÓRIO";
		} else {
			if (pontuacao >= 61 && pontuacao <= 75) {
				conceito = "SATISFATÓRIO";
			} else {
				if (pontuacao >= 76 && pontuacao <= 90) {
					conceito = "BOM";
				} else {
					if (pontuacao > 90) {
						conceito = "ÓTIMO";
					}
				}
			}
		}
		System.out.print("CONCEITO DO ALUNO: " + conceito);

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("DIGITE A PONTUAÇÃO DO ALUNO: ");
		int pontuacao = input.nextInt();
		
		imprimirPontuacao(pontuacao);
	}

}
