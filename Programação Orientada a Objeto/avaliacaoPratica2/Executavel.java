package revisaoPratica;

public class Executavel {

	public static void main(String[] args) {

		// Alunos da turma A
		Endereco enderecoJuliana = new Endereco("RUA DAS JUJUBAS", 100, "CAMPECHE", "FLORIAN�POLIS", "SANTA CATARINA");
		Aluno juliana = new Aluno("Juliana Silva", 15, enderecoJuliana);

		Endereco enderecoDaniele = new Endereco("RUA DAS GOMAS", 200, "PEDRA BRANCA", "PALHO�A", "SANTA CATARINA");
		Aluno daniele = new Aluno("Daniele Veiga", 14, enderecoDaniele);

		Endereco enderecoBruna = new Endereco("RUA DOS CARAMELOS", 300, "KOBRASOL", "S�O JOS�", "SANTA CATARINA");
		Aluno bruna = new Aluno("Bruna Andrade", 13, enderecoBruna);

		Endereco enderecoHelena = new Endereco("RUA DOS PIRULITOS", 400, "ESTREITO", "FLORIAN�POLIS", "SANTA CATARINA");
		Aluno helena = new Aluno("Helena de Andrade", 16, enderecoHelena);

		Endereco enderecoMary = new Endereco("RUA DOS CHICLETES", 500, "ARIRI�", "PALHO�A", "SANTA CATARINA");
		Aluno mary = new Aluno("Mary Souza", 15, enderecoMary);

		Aluno[] alunosTurmaA = { juliana, daniele, bruna, helena, mary };

		// Alunos da turma B
		Endereco enderecoPaula = new Endereco("RUA DOS BOMBONS", 600, "FORQUILHINHAS", "S�O JOS�", "SANTA CATARINA");
		Aluno paula = new Aluno("Paula Vieira", 14, enderecoPaula);

		Endereco enderecoRenata = new Endereco("RUA DAS BALAS", 700, "CAPOEIRAS", "FLORIAN�POLIS", "SANTA CATARINA");
		Aluno renata = new Aluno("Renata Augusta", 15, enderecoRenata);

		Endereco enderecoLuiza = new Endereco("RUA DAS TRUFAS", 800, "CENTRO", "BIGUA�U", "SANTA CATARINA");
		Aluno luiza = new Aluno("Luiza Pires", 15, enderecoLuiza);

		Endereco enderecoBeatriz = new Endereco("RUA DOS DOCES", 900, "CAMPINAS", "S�O JOS�", "SANTA CATARINA");
		Aluno beatriz = new Aluno("Beatriz Santos", 14, enderecoHelena);

		Endereco enderecoSuellen = new Endereco("RUA DOS CONFETES", 1000, "CAPOEIRAS", "FLORIAN�POLIS",
				"SANTA CATARINA");
		Aluno suellen = new Aluno("Suellen Lima", 17, enderecoMary);

		Aluno[] alunosTurmaB = { paula, renata, luiza, beatriz, suellen };

		// Professores
		// Regente turma A
		Endereco enderecoZeca = new Endereco("RUA DAS ENCICLOP�DIAS", 500, "CENTRO", "FLORIAN�POLIS", "SANTA CATARINA");
		Professor regenteZeca = new Professor("Zeca", 45, enderecoZeca, "Matem�tica");
		// Regente turma B
		Endereco enderecoPires = new Endereco("RUA DOS DICION�RIOS", 750, "CENTRO", "FLORIAN�POLIS", "SANTA CATARINA");
		Professor regentePires = new Professor("Pires", 40, enderecoPires, "Portugu�s");

		// Turmas
		Turma turmaA = new Turma(7, alunosTurmaA, regenteZeca);
		Turma turmaB = new Turma(8, alunosTurmaB, regentePires);
		Turma turmas[] = { turmaA, turmaB };

		// Escola
		Endereco enderecoEscola = new Endereco("RUA DOS ESTUDOS", 1000, "CENTRO", "FLORIAN�POLIS", "SANTA CATARINA");
		Escola escola = new Escola("Escola B�sica das Meninas de Florian�polis", "3232-3232", enderecoEscola, turmas);

		// C�digo teste
		System.out.println("\nQuantidade de Alunos: " + escola.contabilizarAlunos());
		System.out.println("\nEndere�o Professor: " + escola.localizarEnderecoRegente("zeca"));
		escola.listarNomesAlunas(7);
		escola.listarNomesAlunas(8
				);
		escola.exibirRegenteMaisNovo();
		escola.listaAlunasPorCidade("FLORIAN�POLIS");
	
	}
}
