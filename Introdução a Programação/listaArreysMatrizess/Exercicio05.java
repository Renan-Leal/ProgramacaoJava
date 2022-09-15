package listaArreysMatrizess;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double[] notas = new double[10];
		double sum = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + i + "° nota: ");
			notas[i] = input.nextDouble();
			sum += notas[i];
		}
		double media = sum / notas.length;
		int QtdeAcimaMedia = 0;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				QtdeAcimaMedia += 1;
			}
		}
		System.out.println("MÉDIA DA CLASSE: " + formatador.format(media));
		System.out.println("QUANTIDADE DE ALUNOS ACIMA DA MÉDIA: " + QtdeAcimaMedia);

	}

}
