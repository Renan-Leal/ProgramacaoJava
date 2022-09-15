package lista_construtores_heranca;

public class Cozinha {

	public static void main(String[] args) {
		Fogao fogao = new Fogao("Fogão 5 bocas","Esmaltec", 4, 5);
		Geladeira geladeira = new Geladeira ("Geladeira Side Inox Inverse 540L","Bastemp", 540, 1.5);
		LavaLouca lavaLouca = new LavaLouca("Lava Louça Mega Hyper","Varanda Ask", 100, 30);
		MicroOndas microOndas = new MicroOndas("Microondas 27l MB37R","Electrolux", 27, 1.4);
		
		double consumoDiario = fogao.calcularConsumoKwDia(10) + geladeira.calcularConsumoKwDia(10) + 
				lavaLouca.calcularConsumoKwDia(10) + microOndas.calcularConsumoKwDia(10);
		
		double consumoMensal = fogao.calcularConsumoKwMes() + geladeira.calcularConsumoKwMes() + 
				lavaLouca.calcularConsumoKwMes() + microOndas.calcularConsumoKwMes();
		
		System.out.println("Consumo de energia diário: " + consumoDiario
				+ "\nConsumo de energia Mensal: " + consumoMensal);
	}
	

}

