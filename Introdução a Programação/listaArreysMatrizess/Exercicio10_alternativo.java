package listaArreysMatrizess;

import java.util.Scanner;

public class Exercicio10_alternativo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int lista[] = new int[10];

		for (int i = 0; i < lista.length; i++) {
			System.out.print("Digite o " + i + "° valor: ");
			lista[i] = input.nextInt();
		}
		for(int indice = 0; indice < lista.length; indice++) {
			for (int i = 0; i < (lista.length - 1); i++) {
				if (lista[i] > lista[i+1]) {
					int aux = lista[i];
					lista[i] = lista[i+1];
					lista[i+1] = aux;
					
				}
			}
			
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println();
		for (int i = (lista.length - 1); i >= 0; i--) {
			System.out.print(lista[i] + " ");
			
		}

	}

}
