package br.com.bankofoz.beans;

public class Agencia {
	
	private String nome = new String();
	private int numero;
	private String fone = new String();
	
	
	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", numero=" + numero + ", fone=" + fone + "]";
	}
	public Agencia(String nome, int numero, String fone) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.fone = fone;
	}
	public Agencia() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	

}
