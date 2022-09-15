package listaArreysMatrizess;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] meses = new double[12];
		double MaiorTemperatura = 0;
		double MenorTemperatura = 0;
		double sum = 0;

		for (int i = 0; i < meses.length; i++) {
			System.out.print("Digite a " + i + "� temperatura m�dia: ");
			meses[i] = input.nextDouble();

			if (MaiorTemperatura <= meses[i]) {
				MaiorTemperatura = meses[i];
			}
			if (MenorTemperatura >= meses[i]) {
				MenorTemperatura = meses[i];
			}
			sum += meses[i];

		}
		int QtdeMesesAbaixoMedia = 0;
		for (int i = 0; i < meses.length; i++) {
			if (meses[i] < (sum / meses.length)) {
				QtdeMesesAbaixoMedia += 1;
			}
		}
		System.out.println("\nMENOR TEMPERATURA M�DIA: " + MenorTemperatura);
		System.out.println("MAIOR TEMPERATURA M�DIA: " + MaiorTemperatura);
		System.out.println("M�DIA DA TEMPERATURA DO ANO: " + sum / meses.length);
		System.out.println("QUANTIDADE DE MESES EM QUE A TEMPERATURA FOI INFERIOR A M�DIA ANUAL: " + QtdeMesesAbaixoMedia);
	}

}
