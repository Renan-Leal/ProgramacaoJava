package lista_construtores_heranca;

public class FornoEletrico extends EletroDomestico {
	private double capacidadeLitros;

	public FornoEletrico(String modelo, String fabricante, double kwDia, double capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public FornoEletrico() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}
	
	@Override
	public double calcularConsumoKwDia(int qtdeDias) {
		return (this.getKwDia() * 1.25) * qtdeDias;
		
	}
	
	@Override
	public double calcularConsumoKwMes() {
		return (this.getKwDia() * 1.5) * 30;
	
	}
}
