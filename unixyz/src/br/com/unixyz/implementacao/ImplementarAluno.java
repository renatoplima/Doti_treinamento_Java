package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementarAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setBasico("Renato", 12345);
		aluno.setCpf("12345678911");
		aluno.setEmail("renato@renato.com.br");
		aluno.setFone("01234-5679");
		
		//System.out.println(aluno.toString());
		//System.out.println("Usu�rio : " + aluno.getUsuario());
		
		Endereco endereco = new Endereco();
		endereco.setBairro("ITAQUERA");
		endereco.setCep("12345-123");
		endereco.setCidade("S�o Paulo");
		endereco.setComplemento("Viela 5");
		endereco.setEstado("SP");
		endereco.setLogradouro("Av. Itaquera");
		endereco.setNumero("22");
		
		aluno.setEndereco(endereco);
		
		System.out.println(aluno.toString());
		
	}

}
