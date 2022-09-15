package entradaSaidaa;

import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de ração consumida pelo frajola em gramas: ");
		double frajola = input.nextDouble();
		
		System.out.print("Quantidade de ração consumida pelo caramelo em gramas : ");
		double caramelo = input.nextDouble();
		
		System.out.print("Digite o peso do saco de racão: ");
		double pesoSaco = input.nextDouble();
		
		double consumoGatos = frajola + caramelo;
		double pesoSacoGramas = pesoSaco * 1000;
		
		double restoSaco = (5 * consumoGatos) - pesoSaco;
		
		System.out.print("\n A quantidade de ração restante no saco é " + restoSaco + " Gramas");
		System.out.print("\n A quantidade de ração restante no saco é " + (restoSaco / 1000) + " Quilos");
		
		
		
		
	

	}

}
