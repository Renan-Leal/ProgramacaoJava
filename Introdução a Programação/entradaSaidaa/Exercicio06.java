package entradaSaidaa;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua idade dias, anos e m�ses: ");
		
		System.out.print("Anos: ");
		int anos = input.nextInt();
		
		System.out.print("Meses: ");
		int meses = input.nextInt();
		
		System.out.print("Digite quantos dias fazem desde que voc� completou seu �ltimo anivers�rio: ");
		int dias = input.nextInt();
		
		int totalAnos = anos * 365;
		int totalMeses = meses * 30;
		int r = totalAnos + totalMeses + dias;
		
		
		System.out.print("A idade expressa em dias � igual a: " + r);
		

	}

}
