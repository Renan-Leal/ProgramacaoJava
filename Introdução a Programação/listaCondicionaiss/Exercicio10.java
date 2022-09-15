package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
		String nome = input.nextLine();
		
		System.out.print("Quantidade adquirida: ");
		int qtdeAdquirida = input.nextInt();
		
		System.out.print("Preço unitário: ");
		double precoUnitario = input.nextDouble();
		
		double total = qtdeAdquirida * precoUnitario;
		double desconto = 0;
		double pagamentoFinal = 0;
		double totalDesconto = 0;
		
		
		
		
		if (qtdeAdquirida <= 5) {
			desconto = 0.98;
			totalDesconto = total * 0.02;
			pagamentoFinal = total * desconto;
			
			
		}
		if (qtdeAdquirida > 5 && qtdeAdquirida <= 10) {
			desconto = 0.97;
			totalDesconto = total * 0.03;
			pagamentoFinal = total * desconto;
			
		}
		if (qtdeAdquirida > 10) {
			desconto = 0.95;
			totalDesconto = total * 0.05;
			pagamentoFinal = total * desconto;
			
		}
		System.out.print("PRODUTO: " + nome);
		System.out.print("\n VALOR TOTAL: " + total);
		System.out.print("\nTOTAL DO DESCONTO: " + totalDesconto);
		System.out.print("\nVALOR FINAL: " + pagamentoFinal);
		
		

	}

}
