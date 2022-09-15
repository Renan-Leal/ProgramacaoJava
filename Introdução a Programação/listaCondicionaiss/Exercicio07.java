package listaCondicionaiss;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Recebendo informações do usuário:
		System.out.print("Digite (1 para Álcool) ou (2 para Gasolina): ");
		int tipo = input.nextInt();

		System.out.print("Digite a quantidade de litros: ");
		double litros = input.nextDouble();
		
		
		double valorAlcool = 0;
		double valorGasolina = 0;
		double valorFinal = 0;

		//ALCOOL
		if (tipo == 1) {
			if (litros <= 20) {
				valorAlcool = (6.20 * litros);
				valorFinal = valorAlcool * 0.97;
				

			} else {
				valorAlcool = (6.20 * litros);
				valorFinal = valorAlcool * 0.95; 
				
			}

		}
		//GASOLINA
		if (tipo == 2) {
			if (litros <= 20) {
				valorGasolina = (6.90 * litros);
				valorFinal = valorGasolina * 0.96;
				
			} else {
				valorGasolina = (6.90 * litros);
				valorFinal = valorGasolina * 0.94;
				
			}
		}
		System.out.print(litros + " Irá custar " + valorFinal); 

	}

}
