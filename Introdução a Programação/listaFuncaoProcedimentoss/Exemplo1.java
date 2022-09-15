package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exemplo1 {
	
	//Desconto inss
	static double calcularDescontoInss(double salario) {
		double desconto = 0;
		
		if (salario < 1500) {
			desconto = salario * 0.05;

		} else {
			if (salario > 3000) {
				desconto = salario * 0.15;
			} else {
				desconto = salario * 0.10;

			}

		}
		return desconto;
	}
	//Desconto irff
	static double calcularDescontoIrrf(double salario) {
		double desconto = 0;
		if (salario < 2000) {
			desconto = 0;

		} else {
			if (salario > 5000) {
				desconto = salario * 0.25;
			} else {
				desconto = salario * 0.15;
			}
		}
		
	return desconto;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int opcao = 0;
		
		do {
			System.out.print("Informe o salário bruto: ");
			double salarioBruto = input.nextDouble();
			double descontoInss = calcularDescontoInss(salarioBruto);
			double descontoIrrf = calcularDescontoIrrf(salarioBruto - descontoInss);
			System.out.println("Salário bruto: " + (salarioBruto));
			System.out.println("Salário liquido: " + (salarioBruto - descontoInss - descontoIrrf));
			System.out.println("Deseja calcular mais um salário liquido? (1-SIM || 2-NAO)");
			opcao = input.nextInt();
		} while (opcao != 2);
		System.out.println("SAINDO . . . ");
	}
}
