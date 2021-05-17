package br.com.urnaeletronica.beans;

public class VotoReduzido {
	
	private int titulo;
	private String candidato;
	
	
	@Override
	public String toString() {
		return "VotoReduzido [titulo=" + titulo + ", candidato=" + candidato + "]";
	}
	public VotoReduzido(int titulo, String candidato) {
		super();
		this.titulo = titulo;
		this.candidato = candidato;
	}
	public VotoReduzido() {
		super();
	}
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	
	

}
