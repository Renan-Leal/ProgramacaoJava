package listaStrings;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = input.nextLine();
		
		System.out.print("Palavra a ser procurada: ");
		String palavraProcurada = input.next();
		
		System.out.print("Palavra para ser inserida no lugar da palavra procurada: ");
		String palavraTroca= input.next();
		
		System.out.println("\nTexto Original: ");
		System.out.println(texto);
		
		System.out.println("\nTexto Modificado: \n" + texto.replaceAll(palavraProcurada, palavraTroca));
		System.out.println("\nQuantidade de vezes que a troca ocorreu: " + Exercicio04.contarQuantasVezesPalavraAparece(texto, palavraProcurada));
		
		
		
		

	}

}
