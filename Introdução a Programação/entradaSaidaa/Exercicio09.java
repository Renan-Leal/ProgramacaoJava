package entradaSaidaa;

import java.util.Scanner;


public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n Digite o modelo do carro: ");
		String modelo = input.nextLine();

		
		System.out.print("Digite o custo de f�brica do carro: ");
		double preco = input.nextDouble();
		
				
		double taxa = 0.28;
		double imposto = 0.45;
		
		double precoFinal = (preco * imposto) + (preco * taxa) + preco;
		
		System.out.print("\n Modelo do carro: " + modelo);
		System.out.print("\n Taxa aplicada ao valor de f�brica: " + taxa);
		System.out.print("\n Imposto aplicado ao valor de f�brica: " + imposto);
		System.out.print("\n Pre�o final: " + precoFinal);

	}

}
