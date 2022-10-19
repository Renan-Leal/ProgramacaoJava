package revisaoPratica;

public class Aluno extends Pessoa {

	public Aluno(String nome, int idade, Endereco endereco) {
		super(nome, idade, endereco);
	}
	
	public Aluno() {
		super();
	}
	
	public String consultarCidade() {
		return this.getEndereco().getCidade();
		
	}

	

}
