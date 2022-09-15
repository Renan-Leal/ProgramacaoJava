package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Desafio01 {
	static int menu() {
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		System.out.println("\nSistema de ajuda a sintaxe do JAVA");
		System.out.println("1- Declara��o de vari�veis");
		System.out.println("2- Condicionais");
		System.out.println("3- Repeti��o");
		System.out.println("4- Array");
		System.out.println("5- Matrizes");
		System.out.println("6- Fun��es");
		System.out.println("7- Procedimentos");
		System.out.println("8- Sair");
		System.out.print("\nDeseja a op��o: ");
		opcao = input.nextInt();
		return opcao;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 8) {
			opcao = menu();
			switch (opcao) {

			case 1:
				System.out.println("A declara��o de var�aveis � extremamente importante para a estrutura��o de um programa.\n"
						+ "Vari�veis s�o espa�os alocados na mem�ria RAM com o objetivo de armazenar tipos espec�ficos de valores.\n"
						+ "Tipos espec�ficos. Inteiros: byte, short, int e long.\n"
						+ "Ponto flutuante: float e double.\n"
						+ "Booleano: true e false.\n"
						+ "Char.\n"
						+ "String.\n"
						+ "Para declarar uma var�avel, � necess�rio seguir o seguinte algoritmo:\n"
						+ "Tipo da var�avel, seguido do nome. Sinal de igual para definir atribui��o e, por fim, valor a ser recebido mais ';' para encerrar a linha de c�digo.\n"
						+ "Exemplo: int numero_inteiro = 95;");
				break;
			case 2:
				System.out.println("Condicionais s�o necess�rias para cria��o de um programa mais inteligente e din�mico.\n"
						+ "As condi��es iniciam com uma verifica��o booleana(true ou false). Se verdadeiro, o programa ir� executar o bloco de c�digo posicionado abaixo da verifica��o.\n"
						+ "Caso falso, o programa ir� ignorar o bloco de c�digo.\n"
						+ "IF = SE | ELSE = SEN�O.\n"
						+ "As condi��es s�o como caminhos a serem seguidos pelo programa. Caso o caminho 1 for verdade, ele o seguir�, caso contr�rio, ele ir� ignora-lo.\n"
						+ "Seguindo essa l�gica. As estruturas condicionais podem apresentar diversos caminhos.\n"
						+ "Podemos encontrar 2 tipos de estruturas condicionais. A estrutura simples e composta.\n"
						+ "Estrutura condicional simples: Cont�m somente 1 if.(Somente um caminho)\n"
						+ "Estrutura condicional composta: Pode conter 1 ou mais if e else.(2 ou mais caminhos)\n"
						+ "\nExemplo condicional simples:\n"
						+ "if(condi��o 1) {\n"
						+ "executa o bloco\n"
						+ "\nExemplo condicional composta:\n"
						+ "if(condi��o 1) {\n"
						+ "executa o bloco\n"
						+ "} else {\n"
						+ "executa outro comando.");
				break;
			case 3:
				System.out.println("A estrutura de repeti��o tem o objetivo de repetir determinado bloco de c�digo at� que o operador l�gico seja verdadeiro ou falso.\n"
						+ "Ao todo, existem 3 tipos de estruturas de repeti��o.\n"
						+ "� indicado que cada uma seja utilizada para atender uma situa��o espec�fica.\n"
						+ "for: Utilizado para repeti��es finitas. Quando sabemos a quantidade de repeti��es.\n"
						+ "while: Utilizado quando n�o se sabe a quantidade de vezes que o bloco de c�gido ser� repetido.\n Repetir� at� que a opera��o l�gica seja verdadeira. Operador l�gico posicionado no incio.\n"
						+ "do while: Utilizado quando n�o se sabe a quantidade de vezes que o bloco de c�gido ser� repetido.\n Repetir� at� que a opera��o l�gica seja verdadeira. Operador l�gico posicionado no final.\n"
						+ "Garante que o bloco de c�digo seja executado pelo menos uma vez.\n"
						+ "\nexemplo for: for(int i = 0; i < 10; i++) {\n"
						+ "\nexemplo while: while(condi��o) {\n"
						+ "executa o bloco;\n"
						+ "\nexemplo do while: do {\n"
						+ "executa bloco\n"
						+ "} while(condi��o);");
				break;
			case 4:
				System.out.println("O tipo de vari�vel Array � um espa�o na RAM com diversas reparti��es utilizadas para armazenar valores do mesmo tipo.\n"
						+ "Para ser declarado, o Array deve conter o tipo de valores a serem recebidos e o n�mero m�ximo de elementos.\n"
						+ "O Arrey pode ser acessado atrav�s de �ndices, permitindo assim a sua manipula��o.\n"
						+ "O primeiro elemento do Arrey inicia em zero e assim sucessivamente.\n"
						+ "Exemplo: int[] array = new int[10];");
				break;
			case 5:
				System.out.println("Matriz, assim como o Array, � uma aloca��o na RAM para armazenar determinado tipo de valor, entretanto, a organiza��o e posi��o dos valores\n"
						+ "� alterado podendo ser analisados como se estivessem dentro de uma tabela com linhas e colunas.\n"
						+ "Uma matriz deve ser declarada da seguinte forma: tipo da matriz, seguido do nome e a quantidade de linhas e colunas que a mesma ir� dispor.\n"
						+ "exemplo: int[][] matriz = new int[3][3];");
				break;
			case 6:
				System.out.println("Fun��es s�o um ou mais blocos de c�digos que servem para solucionar um desafio em espec�fico.\n"
						+ "Para seu funcionamento, pode ou n�o conter par�metros que ser�o utilizados dentro do c�digo.\n"
						+ "A fun��o deve retornar um valor como resposta.\n"
						+ "Para ser declarada, deve conter o tipo do valor que ir� ser retornado, seu nome, os tipos dos par�metros e par�metros que dever� receber.\n"
						+ "Exemplo:\n"
						+ "\nstatic int funcao (int parametro1, double parametro2) {\n"
						+ "return valor_retornado;\n"
						+ "}");
				break;
			case 7:
				System.out.println("Procedimentos s�o um ou mais blocos de c�digo que servem para resolver um desafio em espec�fico.\n"
						+ "Muito parecido com a fun��o, entretanto, n�o retornar valor algum.\n"
						+ "Exemplo:\n"
						+ "\nstatic void procedimento (parametro1) {\n"
						+ "}");
				break;
			default:
				System.out.println("Valor inv�lido, digite a op��o novamente!!");
				break;
			
			case 8:
				System.out.println("SAINDO...");
				break;

			}
		}

	}

}
