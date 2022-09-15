package listaFuncaoProcedimentoss;

import java.util.Scanner;

public class Exercicio08 {
	static boolean ehtriangulo(double[] lados) {
		if ((lados[0] < (lados[1] + lados[2])) && (lados[1] < (lados[0] + lados[2])) && (lados[2] < (lados[0] + lados[1]))) {
			return true;

		} else {
			return false;

		}

	}

	static void tipoTriangulo (double[] lados) {
		if ((lados[0] == lados[1]) && (lados[0] == lados[2])){
			System.out.print("TRIÂNGULO É EQUILATERO. 3 LADOS IGUAIS.");
			
		} else {
			if ((lados[0] == lados[1]) || (lados[0] == lados[2])) {
				System.out.print("TRIÂNGULO ISOCELES. 2 LADOS DIFERENTES.");
				
			}else {
				System.out.print("TRIÂNGULO ESCALENO. 3 LADOS DIFERENTES.");
			
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] lados = new double[3];

		for (int i = 0; i < lados.length; i++) {
			System.out.print("Digite o comprimento do " + i + "° lado: ");
			lados[i] = input.nextDouble();

		}
		if (ehtriangulo(lados)) {
			tipoTriangulo(lados);

		} else {
			System.out.print("NÃO É UM TRIÂNGULO");
		}

	}

}
