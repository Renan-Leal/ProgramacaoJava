package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Recebendo informa��es do usu�rio:
		System.out.print("Quantidade de ma��s compradas: ");
		
		//Caso a quantidade de ma��s compradas for menor ou igual a 12:
		double qtde = input.nextDouble();
		if (qtde <= 12) {
			double custo = 1.30;
			double precoFinal = custo * qtde;
			System.out.print("Valor final do produto: R$" + precoFinal);
		
		//Caso a quantidade de ma��s compradas for menor que 12:
		} else {
			double custo = 1;
			double precoFinal = custo * qtde;
			System.out.print("Valor final do produto: " + precoFinal);

		}
	}

}
