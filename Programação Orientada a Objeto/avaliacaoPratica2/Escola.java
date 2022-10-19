package revisaoPratica;

import java.util.Iterator;
import java.util.function.Consumer;

public class Escola {
	private String nome;
	private String telefone;
	private Endereco enderecoEscola;
	private Turma[] turmas;

	public Escola(String nome, String telefone, Endereco enderecoEscola, Turma[] turmas) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.enderecoEscola = enderecoEscola;
		this.turmas = turmas;
	}

	public Escola() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnderecoEscola() {
		return enderecoEscola;
	}

	public void setEnderecoEscola(Endereco enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}

	public Turma[] getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma[] turmas) {
		this.turmas = turmas;
	}

	public int contabilizarAlunos() {
		int qtdeAlunos = 0;
		for (int i = 0; i < this.getTurmas().length; i++) {
			qtdeAlunos += this.getTurmas()[i].contabilizarAlunos();
		}
		return qtdeAlunos;
	}

	public Endereco localizarEnderecoRegente(String nomeRegente) {
		Endereco endereco = new Endereco();
		for (int i = 0; i < this.getTurmas().length; i++) {
			if (this.getTurmas()[i].consultarNomeRegente().equalsIgnoreCase(nomeRegente)) {
				endereco = this.getTurmas()[i].verificarEnderecoRegente();
			}

		}

		return endereco;

	}

	private void exibirAlunas(String[] alunas, int serie) {
		System.out.println("\nNome das Alunas da " + serie + "° " + "série");
		for (int i = 0; i < alunas.length; i++) {
			System.out.print(alunas[i] + ", ");
		}
	}

	public void listarNomesAlunas(int serie) {
		for (int i = 0; i < this.getTurmas().length; i++) {
			if (this.getTurmas()[i].getSerie() == serie) {
				this.exibirAlunas(this.getTurmas()[i].listarNomesAlunas(), serie);

			}

		}

	}

	public void exibirRegenteMaisNovo() {
		int idadeRegente = this.getTurmas()[0].consultarIdadeRegente();
		String nomeRegente = "";
		for (int i = 0; i < this.getTurmas().length; i++) {
			if (this.getTurmas()[i].consultarIdadeRegente() < idadeRegente) {
				idadeRegente = this.getTurmas()[i].consultarIdadeRegente();
				nomeRegente = this.getTurmas()[i].consultarNomeRegente();
			}

		}
		System.out.println(
				"\n\nNome do regente mais novo: " + nomeRegente + "\nIdade do regente mais novo: " + idadeRegente);
	}
	
	public void listaAlunasPorCidade(String cidade) {
		for (int i = 0; i < this.getTurmas().length; i++) {
			this.getTurmas()[i].listaAlunosPorCidade(cidade);
			
		}
	}

}
