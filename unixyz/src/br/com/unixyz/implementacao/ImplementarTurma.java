package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;

public class ImplementarTurma {
	
	public static void main(String[] args) {
		Turma turma = new Turma(
				1,
				"Turma18c",
				"Diurno",
				new Aluno(
						13,
						"nomeALuno",
						"email",
						"123456",
						"12346579",
						new Endereco(
							"Rua",
							"Bairro",
							"Cidade",
							"Estado",
							"CEP",
							"Numero",
							"Complemento"
								)
						),
				new Professor(
						new Endereco(
								"Rua",
								"Bairro",
								"Cidade",
								"Estado",
								"CEP",
								"Numero",
								"Complemento"
								),
						"nome",
						"titulacao",
						1000
						),
				new Curso(
						"descrição",
						"sigla",
						5000,
						"formacao"
						)
				);
		
		System.out.println("Professor: " + turma.getProfessor().getNome());
		System.out.println("Aluno    : " + turma.getAluno().getNome());
		System.out.println("Cidade   : " + turma.getAluno().getEndereco().getCidade());
		System.out.println("Cruso    : " + turma.getCurso().getDescricao());
		System.out.println("Turma    : " + turma.getNome());
		
	}

}
