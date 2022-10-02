package revisaoProva;

public class RenanEstoque {
	private String responsavel;
	private RenanRemedio[] remedios;

	public RenanEstoque(String responsavel, RenanRemedio[] remedios) {
		super();
		this.responsavel = responsavel;
		this.remedios = remedios;
	}

	public RenanEstoque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public RenanRemedio[] getRemedios() {
		return remedios;
	}

	public void setRemedios(RenanRemedio[] remedios) {
		this.remedios = remedios;
	}

}
