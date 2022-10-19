package revisaoPratica;

import java.util.Arrays;
import java.util.Iterator;

public class Turma {
	private int serie;
	private Aluno[] alunos;
	private Professor professor;

	public Turma(int serie, Aluno[] alunos, Professor professor) {
		super();
		this.serie = serie;
		this.alunos = alunos;
		this.professor = professor;
	}

	public Turma() {
		super();
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int contabilizarAlunos() {
		return this.getAlunos().length;

	}

	public String consultarNomeRegente() {
		return this.getProfessor().getNome();
	}

	public Endereco verificarEnderecoRegente() {
		return this.getProfessor().getEndereco();

	}

	public int consultarIdadeRegente() {
		return this.getProfessor().getIdade();
	}

	public String[] listarNomesAlunas() {
		String[] nomes = new String[this.getAlunos().length];
		for (int i = 0; i < alunos.length; i++) {
			nomes[i] = alunos[i].getNome();

		}
		return nomes;

	}

	public void listaAlunosPorCidade(String cidade) {
		for (int i = 0; i < this.getAlunos().length; i++) {
			if(this.getAlunos()[i].getEndereco().getCidade().equalsIgnoreCase(cidade)) {
				System.out.println(this.getAlunos()[i].getNome());
				
			}
			
		}
		
	}
	

	
	

}
