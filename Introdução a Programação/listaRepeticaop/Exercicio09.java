package listaRepeticaop;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de n�meros a serem lidos: ");
		int qtdeNumeros = input.nextInt();
		int maiorNumero = 1;
		int menorNumero = 1;
		int contando = 0;
		
		for (int contador = 1; contador <= qtdeNumeros; ++contador) {
			
			if (maiorNumero < contador) {
				maiorNumero = contador;
			}else {
				menorNumero = maiorNumero;
			
			}
			
			
		}
		
		System.out.print("\nMAIOR N�MERO LIDO: " + maiorNumero);
		System.out.print("\nMENOR N�MERO LIDO: " + menorNumero);
	}

}
