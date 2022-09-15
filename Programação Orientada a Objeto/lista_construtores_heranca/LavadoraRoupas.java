package lista_construtores_heranca;

public class LavadoraRoupas extends EletroDomestico {
	private double capacidadeKg;


	public LavadoraRoupas(String modelo, String fabricante, double kwDia, double capacidadeKg) {
		super(modelo, fabricante, kwDia);
		this.capacidadeKg = capacidadeKg;
	}

	public LavadoraRoupas() {
		super();
	}

	public double getCapacidadeKg() {
		return capacidadeKg;
	}

	public void setCapacidadeKg(double capacidadeKg) {
		this.capacidadeKg = capacidadeKg;
	}

}