package revisaoProva;

public class RenanFarmacia extends RenanEmpresa {
	private RenanEstoque estoque;

	public RenanFarmacia(String nome, String cnpj, RenanEndereco endereco, RenanEstoque estoque) {
		super(nome, cnpj, endereco);
		this.estoque = estoque;
	}

	public RenanFarmacia() {
		super();
	}

	public RenanEstoque getEstoque() {
		return estoque;
	}

	public void setEstoque(RenanEstoque estoque) {
		this.estoque = estoque;
	}

	public String identificarResponsavel() {
		return this.getEstoque().getResponsavel();
	}

	public double calcularTotalReais() {
		double totalReais = 0;
		for (int i = 0; i < this.getEstoque().getRemedios().length; i++) {
			totalReais += this.getEstoque().getRemedios()[i].getPreco();
		}

		return totalReais;

	}

	public double calcularTotalReaisLaboratorio(String laboratorio) {
		double totalReais = 0;
		for (int i = 0; i < this.getEstoque().getRemedios().length; i++) {
			if (laboratorio.equals(this.getEstoque().getRemedios()[i].getLaboratorio().getNome())) {
				totalReais += this.getEstoque().getRemedios()[i].getPreco();

			}

		}
		return totalReais;
	}

	public void exibirInformacoesLaboratorio(String laboratorio) {
		for (int i = 0; i < this.getEstoque().getRemedios().length; i++) {
			if (laboratorio.equals(this.getEstoque().getRemedios()[i].getLaboratorio().getNome())) {
				System.out.print("\n" + this.getEstoque().getRemedios()[i].getLaboratorio().toString());
				break;

			}

		}
	}
}
