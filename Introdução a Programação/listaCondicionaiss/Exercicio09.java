package listaCondicionaiss;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.0");
		
		System.out.print("\nCATÁLOGO DE PREÇOS: MORANGO ATÉ 5KG >> R$2,50 POR KG. ACIMA DE 5KG >> R$2,20");
		System.out.print("\nCATÁLOGO DE PREÇOS: MORANGO ATÉ 5KG >> R$1,80 POR KG. ACIMA DE 5KG >> R$1,50");
		
		System.out.print("\nDigite a quantidade de KG em morangos: ");
		double morangos = input.nextDouble();
		
		System.out.print("Digite a quantidade de KG em maçãs: ");
		double macans = input.nextDouble();
		
		
		double kgFrutas = morangos + macans;
		double totalMorangos = 0;
		double totalMacans = 0; 
		
		
		if (morangos <= 5) {
			 totalMorangos = 2.50 * morangos;
		} else {
			 totalMorangos = 2.20 * morangos;
		}
		if (macans <= 5) {
			 totalMacans = 1.80 * macans;
			 
		} else {
			 totalMacans = 1.50 * macans;
		}
		
		double valorTotal = totalMorangos + totalMacans;
		double valorTotalTeste = totalMorangos + totalMacans;
		
		if(kgFrutas > 8 || valorTotal > 25) {
			valorTotal = valorTotal - (0.10 * valorTotal);
			valorTotalTeste = valorTotalTeste * 0.90;
			
		}
		
		System.out.print("\n" + totalMorangos);
		System.out.print("\n" + totalMacans);
		
		System.out.print("\n O valor total a ser pago: " + formatador.format(valorTotal)); 
		
		System.out.print("\n O valor total a ser pago(segundo método): " + formatador.format(valorTotalTeste));
		
			
		
		
		
		
		
		
		
		
		

	}

}
