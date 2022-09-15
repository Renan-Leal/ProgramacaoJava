package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio03 {
	static void calcularNotas(double[] notas, int opcao) {
		double resultado = 0;
		String tipoR = " ";

		if (opcao == 1) {
			resultado = ((notas[0] + notas[1] + notas[2])) / 3;
			tipoR = "M�DIA ARITM�TICA";
		}
		if (opcao == 2) {
			resultado = ((notas[0] * 5) + (notas[1] * 3) + (notas[2] * 2)) / 10;
			tipoR = "M�DIA PONDERADA";
		}
		System.out.print(tipoR + ": "+ resultado);
	
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] notas = new double[3];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("DIGITE A NOTA DO ALUNO: ");
			notas[i] = input.nextDouble();
		}
		System.out.print("Digite a op��o: 1 - (M�DIA ARITM�TICA) || 2 - (M�DIA PONDERADA): ");
		int opcao = input.nextInt();
		calcularNotas(notas, opcao);

	}

}
