package entradaSaidaa;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Segunda nota: ");
		double nota2 = input.nextDouble();
		
		System.out.print("Terceira nota: ");
		double nota3 = input.nextDouble();
		
		double media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
		media = media / 10;
		
		System.out.print("\n Peso primeira nota: " + "2");
		System.out.print("\n Peso segunda nota: " + "3");
		System.out.print("\n Peso terceira nota: " + "5");
		
		System.out.print("\n Média final do aluno: " + media);
		
		

	}

}
