package listaStrings;

import java.util.Scanner;


public class Exercicio04 {
	static int contarQuantasVezesPalavraAparece(String texto, String palavraProcurada) {
		int indice = texto.indexOf(palavraProcurada);
		int contador = 0;
		while (indice != -1) {
		    contador++;
		    texto = texto.substring(indice + 1);
		    indice = texto.indexOf(palavraProcurada);
		}
		return contador;
		
	}

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = input.nextLine();
		
		System.out.print("Digite uma palavra para procurar: ");
		String palavraProcurada = input.nextLine();
		
		String frase_impressao = frase;
		
		System.out.println("\nFrase digitada: ");
		System.out.println(frase_impressao);
		System.out.println("A palavra procurada aparece " + contarQuantasVezesPalavraAparece(frase, palavraProcurada) + " vezes.");

	}

}
