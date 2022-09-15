package listaRepeticaop;


import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double valorTotal = 0;
		int qtdeProdutos = 0;
		int R = 0;

		do {
			System.out.print("Digite o valor da mercadoria: ");
			double mercadoria = input.nextDouble();
			valorTotal += mercadoria;

			System.out.print("Deseja continuar? (1 - SIM // 2 - NAO)");
			R = input.nextInt();
			qtdeProdutos += 1;
		} while (R == 1);

		System.out.print("\nVALOR TOTAL EM ESTOQUE: R$" + formatador.format(valorTotal));
		System.out.print("\nMEDIA DOS VALORES DOS PRODUTOS: R$" + formatador.format((valorTotal / qtdeProdutos)));
	}

}
