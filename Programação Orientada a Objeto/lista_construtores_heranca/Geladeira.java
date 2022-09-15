package lista_construtores_heranca;

public class Geladeira extends EletroDomestico {
	private double capacidadeLitros;


	public Geladeira(String modelo, String fabricante, double kwDia, double capacidadeLitros) {
		super(modelo, fabricante, kwDia);
		this.capacidadeLitros = capacidadeLitros;
	}

	public Geladeira() {
		super();
	}

	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}

}
