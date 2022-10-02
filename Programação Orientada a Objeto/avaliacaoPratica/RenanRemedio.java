package revisaoProva;

public class RenanRemedio {
	private String nome;
	private double preco;
	private RenanLaboratorio laboratorio;

	public RenanRemedio(String nome, double preco, RenanLaboratorio laboratorio) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.laboratorio = laboratorio;
	}

	public RenanRemedio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public RenanLaboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(RenanLaboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() 
		+ "\nPreço: " + this.getPreco() 
		+ "\nLaboratório: " + this.getLaboratorio();
	}

}
