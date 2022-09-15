package listaStrings;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite sua data de nascimento no seguinte formato(dd/mm/yy): ");
		String data_nascimento = input.nextLine();

		String mesConvertido = converter_data(data_nascimento);
		
		System.out.println(mesConvertido);
	}

	static String converter_data(String data_nascimento) {
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		
		String verificador = data_nascimento.substring(3, 5);
		String trocarMes = data_nascimento.substring(3, 5).replace("01", meses[0]);
		trocarMes = trocarMes.replace("02",  meses[1]);
		trocarMes = trocarMes.replace("03",  meses[2]);
		trocarMes = trocarMes.replace("04",  meses[3]);
		trocarMes = trocarMes.replace("05",  meses[4]);
		trocarMes = trocarMes.replace("06",  meses[5]);
		trocarMes = trocarMes.replace("07",  meses[6]);
		trocarMes = trocarMes.replace("08",  meses[7]);
		trocarMes = trocarMes.replace("09",  meses[8]);
		trocarMes = trocarMes.replace("10",  meses[9]);
		trocarMes = trocarMes.replace("11", meses[10]);
		trocarMes = trocarMes.replace("12", meses[11]);
		
		String mesConvertido = new String();
		return mesConvertido = "Você nasceu em " + data_nascimento.substring(0, 2) + " de " + trocarMes + " de "
				+ data_nascimento.substring(6);
	}

}
