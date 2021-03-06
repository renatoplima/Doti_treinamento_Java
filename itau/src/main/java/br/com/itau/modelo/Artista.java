package br.com.itau.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity // fala pro Spring Boot que essa classe possui uma tabela correspondente no DB
@Table(name="TB_ARTISTA") // identifica qual é a tabela que estará associada com a classe Usuario
public class Artista {
	
	@Id // Avisa o Spring Boot que esta coluna é a chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Identity => representa o auto incremento do DB
	@Column(name="id")
	private int id;
	
	@Column(name="nomeArtistico")
	private String nomeArtistico;
	
	@Column(name="nacionalidade")
	private String nacionalidade;
	
	@Column(name="estilo")
	private String estilo;
	
	@OneToMany(mappedBy="artista", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("artista")
	private List<Musica> musicas;
	
	
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade
				+ ", estilo=" + estilo + ", musicas=" + musicas + "]";
	}
	public Artista(int id, String nomeArtistico, String nacionalidade, String estilo, List<Musica> musicas) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.estilo = estilo;
		this.musicas = musicas;
	}
	public Artista() {
		super();
	}
	public List<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}
