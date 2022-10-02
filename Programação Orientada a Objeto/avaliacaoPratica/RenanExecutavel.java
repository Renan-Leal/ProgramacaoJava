package revisaoProva;

public class RenanExecutavel {

	public static void main(String[] args) {

		// Declara��o dos endere�os e laborat�rios:
		RenanEndereco endLegrand = new RenanEndereco("RUA DOS REM�DIOS", 100, "CENTRO", "PALHO�A", "SANTA CATARINA");
		RenanLaboratorio laboratorioLegrand = new RenanLaboratorio("Legrand", "12.345.678/0001-11", endLegrand);

		RenanEndereco endMedley = new RenanEndereco("RUA DA MEDICACAO", 200, "ESTREITO", "FLORIAN�POLIS",
				" SANTA CATARINA");
		RenanLaboratorio laboratorioMedley = new RenanLaboratorio("Medley", "12.345.678/0001-22", endMedley);

		// Rem�dios produzidos pela Legrand:
		RenanRemedio rosuvas = new RenanRemedio("Rosuvas", 55, laboratorioLegrand);
		RenanRemedio glifage = new RenanRemedio("Glifage", 35, laboratorioLegrand);
		RenanRemedio aradoisH = new RenanRemedio("Aradois H", 50, laboratorioLegrand);
		RenanRemedio trandilax = new RenanRemedio("Trandilax", 10, laboratorioLegrand);

		// Rem�dios produzidos pela Medley:
		RenanRemedio rosuvastatina = new RenanRemedio("Rosuvas", 50, laboratorioMedley);
		RenanRemedio lexotan = new RenanRemedio("Glifage", 40, laboratorioMedley);
		RenanRemedio losartana = new RenanRemedio("Aradois H", 45, laboratorioMedley);
		RenanRemedio torsilax = new RenanRemedio("Trandilax", 15, laboratorioMedley);

		// Rem�dios
		RenanRemedio[] remedios = { rosuvas, rosuvas, rosuvas, rosuvas, glifage, glifage, glifage, aradoisH, aradoisH,
				trandilax, rosuvastatina, lexotan, lexotan, losartana, losartana, losartana, torsilax, torsilax,
				torsilax, torsilax };

		// Farm�cia:
		RenanEndereco endFarmacia = new RenanEndereco("RUA JARDIM SILVA", 360, "Centro", "Florianopolis",
				"Santa Catarina");

		RenanEstoque estoqueFarmacia = new RenanEstoque("Luciano", remedios);
		RenanFarmacia farmacia = new RenanFarmacia("FARM�CIA DO SENAC", "12.345.678/0001-33", endFarmacia,
				estoqueFarmacia);

		// Nome do funcion�rio respons�vel pelo estoque:
		System.out.println("Funcion�rio respons�vel pelo estoque: " + farmacia.identificarResponsavel());

		// C�lculo do total (EM REAIS) do estoque de rem�dios.
		System.out.println("\nLucro em reais do estoque de rem�dios: " + farmacia.calcularTotalReais());

		// Dado o nome de um laborat�rio, exibir c�lculo em reais de rem�dios desse
		// laborat�rio.
		System.out.println("\nLucro em reais do estoque de rem�dios de Legrand: "
				+ farmacia.calcularTotalReaisLaboratorio("Legrand"));
		System.out.println(
				"Lucro em reais do estoque de rem�dios de Medley: " + farmacia.calcularTotalReaisLaboratorio("Medley"));
		System.out.println(
				"Lucro em reais do estoque de rem�dios de Chaves: " + farmacia.calcularTotalReaisLaboratorio("Chaves"));

		// Dado o nome de um laborat�rio, exibir informa��es desse laborat�rio.
		farmacia.exibirInformacoesLaboratorio("Legrand");
		farmacia.exibirInformacoesLaboratorio("Medley");

	}
}