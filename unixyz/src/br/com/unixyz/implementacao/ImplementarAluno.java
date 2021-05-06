package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setBasico("Renato", 12345);
		aluno.setCpf("12345678911");
		aluno.setEmail("renato@renato.com.br");
		aluno.setFone("01234-5679");
		
		System.out.println(aluno.toString());
		System.out.println("Usuário : " + aluno.getUsuario());

	}

}
