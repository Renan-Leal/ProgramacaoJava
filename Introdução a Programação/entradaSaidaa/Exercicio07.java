package entradaSaidaa;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de votos brancos: ");
		int Vbrancos = input.nextInt();
		
		System.out.print("Digite o n�mero de votos nulos: ");
		int Vnulos = input.nextInt();
		
		System.out.print("Digite o n�mero de votos v�lidos: ");
		int Vvalidos = input.nextInt();
		
		int votosTotal = Vbrancos + Vnulos + Vvalidos;
		double percentualBrancos = Vbrancos * 100 / votosTotal;
		double percentualNulos = Vnulos * 100 / votosTotal;
		double percentualValidos = Vvalidos * 100 /  votosTotal;
		
		
		System.out.print("\n N�mero total de votos: " + votosTotal);
		System.out.print("\n Percentual de votos brancos em rela��o ao total de votos: " + percentualBrancos + "%");
		System.out.print("\n Percentual de votos nulos em rela��o ao total de votos:  " + percentualNulos + "%");
		System.out.print("\n Percentual de votos v�lidos em rela��o ao total de votos: " + percentualValidos + "%");
	}

}
