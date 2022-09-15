package lista_construtores_heranca;

public class EletroDomestico {
	private String modelo;
	private String fabricante;
	private double kwDia;

	public EletroDomestico(String modelo, String fabricante, double kwDia) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.kwDia = kwDia;
	}

	public EletroDomestico() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getKwDia() {
		return kwDia;
	}

	public void setKwDia(double kwDia) {
		this.kwDia = kwDia;
	}

	public double calcularConsumoKwDia(int qtdeDias) {
		return this.getKwDia() * qtdeDias;
		
	}

	public double calcularConsumoKwMes() {
		return this.getKwDia() * 30;
	
	}
}