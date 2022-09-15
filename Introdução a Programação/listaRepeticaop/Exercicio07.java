package listaRepeticaop;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valorTotalEmEstoque = 0;
		DecimalFormat formatador = new DecimalFormat("0.00");

		System.out.print("DIGITE O NÚMERO TOTAL DE MERCADORIAS NO ESTOQUE: ");
		int qtdeProdutos = input.nextInt();

		for (int contador = 1; contador <= qtdeProdutos; ++contador) {
			
			System.out.print("DIGITE O VALOR DA " + contador + "° MERCADORIA: ");
			double valorMercadoria = input.nextDouble();
			valorTotalEmEstoque += valorMercadoria;
		}

		System.out.print("\nVALOR FINAL EM ESTOQUE: R$" + formatador.format(valorTotalEmEstoque));
		System.out.print("\nMÉDIA DOS PRODUTOS NO ESTOQUE: R$" + formatador.format(valorTotalEmEstoque / qtdeProdutos));
	}

}
