package lista_construtores_heranca;

public class Fogao extends EletroDomestico {
	private int qtdeBocas;

	public Fogao(String modelo, String fabricante, double kwDia, int qtdeBocas) {
		super(modelo, fabricante, kwDia);
		this.qtdeBocas = qtdeBocas;
	}

	public Fogao() {
		super();
	}

	public int getQtdeBocas() {
		return qtdeBocas;
	}

	public void setQtdeBocas(int qtdeBocas) {
		this.qtdeBocas = qtdeBocas;
	}

	

}
