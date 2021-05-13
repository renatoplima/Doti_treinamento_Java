package br.com.bankofoz.beans;

public class Cliente {
	
	private String nome = new String();
	private String email = new String();
	private String fone = new String();
	private Endereco endereco;
	private int id;
	
	public String getUsuario() {
		return email.substring(0, email.indexOf("@"));
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + ", endereco=" + endereco + ", id=" + id
				+ "]";
	}
	public Cliente(String nome, String email, String fone, Endereco endereco, int id) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
		this.id = id;
	}
	public Cliente() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

	

}
