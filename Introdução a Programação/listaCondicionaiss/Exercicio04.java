package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\n Digite a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = input.nextDouble();
		System.out.print("\n Digite o salário por hora: ");
		double salarioHora = input.nextDouble();
		
		if(horasTrabalhadas <= 160) {
			double salarioTotal = horasTrabalhadas * salarioHora;
			System.out.print("\n O salario fica em: R$ " + salarioTotal);
		}else {
			double horaExtra = salarioHora * 1.5 * (horasTrabalhadas - 160);
			double salarioTotal = 160 * salarioHora + horaExtra;
			System.out.print("\n O salario fica em: R$ " + salarioTotal);
		}
		
		
	}

}
