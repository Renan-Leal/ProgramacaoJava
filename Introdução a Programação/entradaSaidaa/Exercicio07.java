package entradaSaidaa;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número de votos brancos: ");
		int Vbrancos = input.nextInt();
		
		System.out.print("Digite o número de votos nulos: ");
		int Vnulos = input.nextInt();
		
		System.out.print("Digite o número de votos válidos: ");
		int Vvalidos = input.nextInt();
		
		int votosTotal = Vbrancos + Vnulos + Vvalidos;
		double percentualBrancos = Vbrancos * 100 / votosTotal;
		double percentualNulos = Vnulos * 100 / votosTotal;
		double percentualValidos = Vvalidos * 100 /  votosTotal;
		
		
		System.out.print("\n Número total de votos: " + votosTotal);
		System.out.print("\n Percentual de votos brancos em relação ao total de votos: " + percentualBrancos + "%");
		System.out.print("\n Percentual de votos nulos em relação ao total de votos:  " + percentualNulos + "%");
		System.out.print("\n Percentual de votos válidos em relação ao total de votos: " + percentualValidos + "%");
	}

}
