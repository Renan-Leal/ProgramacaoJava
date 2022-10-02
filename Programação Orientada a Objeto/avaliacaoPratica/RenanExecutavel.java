package revisaoProva;

public class RenanExecutavel {

	public static void main(String[] args) {

		// Declaração dos endereços e laboratórios:
		RenanEndereco endLegrand = new RenanEndereco("RUA DOS REMÉDIOS", 100, "CENTRO", "PALHOÇA", "SANTA CATARINA");
		RenanLaboratorio laboratorioLegrand = new RenanLaboratorio("Legrand", "12.345.678/0001-11", endLegrand);

		RenanEndereco endMedley = new RenanEndereco("RUA DA MEDICACAO", 200, "ESTREITO", "FLORIANÓPOLIS",
				" SANTA CATARINA");
		RenanLaboratorio laboratorioMedley = new RenanLaboratorio("Medley", "12.345.678/0001-22", endMedley);

		// Remédios produzidos pela Legrand:
		RenanRemedio rosuvas = new RenanRemedio("Rosuvas", 55, laboratorioLegrand);
		RenanRemedio glifage = new RenanRemedio("Glifage", 35, laboratorioLegrand);
		RenanRemedio aradoisH = new RenanRemedio("Aradois H", 50, laboratorioLegrand);
		RenanRemedio trandilax = new RenanRemedio("Trandilax", 10, laboratorioLegrand);

		// Remédios produzidos pela Medley:
		RenanRemedio rosuvastatina = new RenanRemedio("Rosuvas", 50, laboratorioMedley);
		RenanRemedio lexotan = new RenanRemedio("Glifage", 40, laboratorioMedley);
		RenanRemedio losartana = new RenanRemedio("Aradois H", 45, laboratorioMedley);
		RenanRemedio torsilax = new RenanRemedio("Trandilax", 15, laboratorioMedley);

		// Remédios
		RenanRemedio[] remedios = { rosuvas, rosuvas, rosuvas, rosuvas, glifage, glifage, glifage, aradoisH, aradoisH,
				trandilax, rosuvastatina, lexotan, lexotan, losartana, losartana, losartana, torsilax, torsilax,
				torsilax, torsilax };

		// Farmácia:
		RenanEndereco endFarmacia = new RenanEndereco("RUA JARDIM SILVA", 360, "Centro", "Florianopolis",
				"Santa Catarina");

		RenanEstoque estoqueFarmacia = new RenanEstoque("Luciano", remedios);
		RenanFarmacia farmacia = new RenanFarmacia("FARMÁCIA DO SENAC", "12.345.678/0001-33", endFarmacia,
				estoqueFarmacia);

		// Nome do funcionário responsável pelo estoque:
		System.out.println("Funcionário responsável pelo estoque: " + farmacia.identificarResponsavel());

		// Cálculo do total (EM REAIS) do estoque de remédios.
		System.out.println("\nLucro em reais do estoque de remédios: " + farmacia.calcularTotalReais());

		// Dado o nome de um laboratório, exibir cálculo em reais de remédios desse
		// laboratório.
		System.out.println("\nLucro em reais do estoque de remédios de Legrand: "
				+ farmacia.calcularTotalReaisLaboratorio("Legrand"));
		System.out.println(
				"Lucro em reais do estoque de remédios de Medley: " + farmacia.calcularTotalReaisLaboratorio("Medley"));
		System.out.println(
				"Lucro em reais do estoque de remédios de Chaves: " + farmacia.calcularTotalReaisLaboratorio("Chaves"));

		// Dado o nome de um laboratório, exibir informações desse laboratório.
		farmacia.exibirInformacoesLaboratorio("Legrand");
		farmacia.exibirInformacoesLaboratorio("Medley");

	}
}