package entradaSaidaa;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Salário do vendedor: ");
		double salarioFixo = input.nextDouble();
		
		System.out.print("Quantidade de carros vendidos: ");
		double qtdeCarrosVendidos = input.nextDouble();
		
		System.out.print("Vendas no total: ");
		double vendasTotal = input.nextDouble();
		
		double novoSalario = salarioFixo + (qtdeCarrosVendidos * 0.05) + (vendasTotal * 0.05);
		
		System.out.print("\n Sálario final: " + novoSalario);
		
		

	}

}
