package entradaSaidaa;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Esse � um programa para calcular o aumento salaral do funcion�rio! ");
		
		System.out.print("\n Digite o seu sal�rio: ");
		int salario = input.nextInt();
		
		System.out.print("\n Digite a porcentagem do aumento salarial: ");
		double percentual = input.nextDouble();
		
		percentual = percentual / 100;
		
		double aumentoSalarial = percentual * salario;
		double salarioFinal = percentual * salario + salario;
		
		System.out.print("\n Aumento salarial:  " + aumentoSalarial);
		System.out.print("\n Sal�rio final: " + salarioFinal );
	}

}
