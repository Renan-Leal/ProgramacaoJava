package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Desafio01 {
	static int menu() {
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		System.out.println("\nSistema de ajuda a sintaxe do JAVA");
		System.out.println("1- Declaração de variáveis");
		System.out.println("2- Condicionais");
		System.out.println("3- Repetição");
		System.out.println("4- Array");
		System.out.println("5- Matrizes");
		System.out.println("6- Funções");
		System.out.println("7- Procedimentos");
		System.out.println("8- Sair");
		System.out.print("\nDeseja a opção: ");
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
				System.out.println("A declaração de varíaveis é extremamente importante para a estruturação de um programa.\n"
						+ "Variáveis são espaços alocados na memória RAM com o objetivo de armazenar tipos específicos de valores.\n"
						+ "Tipos específicos. Inteiros: byte, short, int e long.\n"
						+ "Ponto flutuante: float e double.\n"
						+ "Booleano: true e false.\n"
						+ "Char.\n"
						+ "String.\n"
						+ "Para declarar uma varíavel, é necessário seguir o seguinte algoritmo:\n"
						+ "Tipo da varíavel, seguido do nome. Sinal de igual para definir atribuição e, por fim, valor a ser recebido mais ';' para encerrar a linha de código.\n"
						+ "Exemplo: int numero_inteiro = 95;");
				break;
			case 2:
				System.out.println("Condicionais são necessárias para criação de um programa mais inteligente e dinâmico.\n"
						+ "As condições iniciam com uma verificação booleana(true ou false). Se verdadeiro, o programa irá executar o bloco de código posicionado abaixo da verificação.\n"
						+ "Caso falso, o programa irá ignorar o bloco de código.\n"
						+ "IF = SE | ELSE = SENÃO.\n"
						+ "As condições são como caminhos a serem seguidos pelo programa. Caso o caminho 1 for verdade, ele o seguirá, caso contrário, ele irá ignora-lo.\n"
						+ "Seguindo essa lógica. As estruturas condicionais podem apresentar diversos caminhos.\n"
						+ "Podemos encontrar 2 tipos de estruturas condicionais. A estrutura simples e composta.\n"
						+ "Estrutura condicional simples: Contém somente 1 if.(Somente um caminho)\n"
						+ "Estrutura condicional composta: Pode conter 1 ou mais if e else.(2 ou mais caminhos)\n"
						+ "\nExemplo condicional simples:\n"
						+ "if(condição 1) {\n"
						+ "executa o bloco\n"
						+ "\nExemplo condicional composta:\n"
						+ "if(condição 1) {\n"
						+ "executa o bloco\n"
						+ "} else {\n"
						+ "executa outro comando.");
				break;
			case 3:
				System.out.println("A estrutura de repetição tem o objetivo de repetir determinado bloco de código até que o operador lógico seja verdadeiro ou falso.\n"
						+ "Ao todo, existem 3 tipos de estruturas de repetição.\n"
						+ "É indicado que cada uma seja utilizada para atender uma situação específica.\n"
						+ "for: Utilizado para repetições finitas. Quando sabemos a quantidade de repetições.\n"
						+ "while: Utilizado quando não se sabe a quantidade de vezes que o bloco de cógido será repetido.\n Repetirá até que a operação lógica seja verdadeira. Operador lógico posicionado no incio.\n"
						+ "do while: Utilizado quando não se sabe a quantidade de vezes que o bloco de cógido será repetido.\n Repetirá até que a operação lógica seja verdadeira. Operador lógico posicionado no final.\n"
						+ "Garante que o bloco de código seja executado pelo menos uma vez.\n"
						+ "\nexemplo for: for(int i = 0; i < 10; i++) {\n"
						+ "\nexemplo while: while(condição) {\n"
						+ "executa o bloco;\n"
						+ "\nexemplo do while: do {\n"
						+ "executa bloco\n"
						+ "} while(condição);");
				break;
			case 4:
				System.out.println("O tipo de variável Array é um espaço na RAM com diversas repartições utilizadas para armazenar valores do mesmo tipo.\n"
						+ "Para ser declarado, o Array deve conter o tipo de valores a serem recebidos e o número máximo de elementos.\n"
						+ "O Arrey pode ser acessado através de índices, permitindo assim a sua manipulação.\n"
						+ "O primeiro elemento do Arrey inicia em zero e assim sucessivamente.\n"
						+ "Exemplo: int[] array = new int[10];");
				break;
			case 5:
				System.out.println("Matriz, assim como o Array, é uma alocação na RAM para armazenar determinado tipo de valor, entretanto, a organização e posição dos valores\n"
						+ "é alterado podendo ser analisados como se estivessem dentro de uma tabela com linhas e colunas.\n"
						+ "Uma matriz deve ser declarada da seguinte forma: tipo da matriz, seguido do nome e a quantidade de linhas e colunas que a mesma irá dispor.\n"
						+ "exemplo: int[][] matriz = new int[3][3];");
				break;
			case 6:
				System.out.println("Funções são um ou mais blocos de códigos que servem para solucionar um desafio em específico.\n"
						+ "Para seu funcionamento, pode ou não conter parâmetros que serão utilizados dentro do código.\n"
						+ "A função deve retornar um valor como resposta.\n"
						+ "Para ser declarada, deve conter o tipo do valor que irá ser retornado, seu nome, os tipos dos parâmetros e parâmetros que deverá receber.\n"
						+ "Exemplo:\n"
						+ "\nstatic int funcao (int parametro1, double parametro2) {\n"
						+ "return valor_retornado;\n"
						+ "}");
				break;
			case 7:
				System.out.println("Procedimentos são um ou mais blocos de código que servem para resolver um desafio em específico.\n"
						+ "Muito parecido com a função, entretanto, não retornar valor algum.\n"
						+ "Exemplo:\n"
						+ "\nstatic void procedimento (parametro1) {\n"
						+ "}");
				break;
			default:
				System.out.println("Valor inválido, digite a opção novamente!!");
				break;
			
			case 8:
				System.out.println("SAINDO...");
				break;

			}
		}

	}

}
