package listaArreysMatrizess;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] valores = new int[10];
		int MaiorNumero = 0;
		int MenorNumero = 0;
		int PosicaoMaior = 0;
		int PosicaoMenor = 0;

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + i + "� n�mero: ");
			valores[i] = input.nextInt();
			do {
				if (valores[i] < 0) {
					System.out.print("Digite novamente: ");
					valores[i] = input.nextInt();
				}

			} while (valores[i] < 0);
			if (MaiorNumero < valores[i]) {
				MaiorNumero = valores[i];
				PosicaoMaior = i;
			}
			if (MenorNumero > valores[i] || i == 0) {
				MenorNumero = valores[i];
				PosicaoMenor = i;

			}
		}
		System.out.println("\nMAIOR N�MERO DIGITADO: " + MaiorNumero);
		System.out.println("POSI��O DO MAIOR N�MERO: " + PosicaoMaior + "�");

		System.out.println("MENOR N�MERO DIGITADO: " + MenorNumero);
		System.out.println("POSI��O DO MENOR N�MERO: " + PosicaoMenor + "�");

	}

}
