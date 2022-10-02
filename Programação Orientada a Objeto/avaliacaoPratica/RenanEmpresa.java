package revisaoProva;

public class RenanEmpresa {
	private String nome;
	private String cnpj;
	private RenanEndereco endereco;

	public RenanEmpresa(String nome, String cnpj, RenanEndereco endereco) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public RenanEmpresa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public RenanEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(RenanEndereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() 
				+ "\nCNPJ: " + this.getCnpj() 
				+ "\nEndereço: " + this.getEndereco();
	}

}
