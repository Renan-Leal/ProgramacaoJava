package listaArreysMatrizess;

import java.util.Scanner;
import java.util.Arrays;	
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		int[] lista = new int[10];

		for (int i = 0; i < lista.length; i++) {
			System.out.print("Digite o " + i + "° valor: ");
			lista[i] = input.nextInt();
		}
		Arrays.sort(lista);
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
			
		}
	
	}
		
}
