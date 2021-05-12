package br.com.lojagama.beans;

public class Produto {
	
	private int id;
	private String descricao;
	private double valorCompra;
	private double valorVenda;
	private int qtde;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Produto() {
		super();
	}
	public Produto(int id, String descricao, double valorCompra, double valorVenda, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda="
				+ valorVenda + ", qtde=" + qtde + "]";
	}
	
	public String verificarEstoque() {
		if (qtde < 5) {
			return "Estoque Baixo";
		}else if (qtde >= 5 || qtde <= 10) {
			return "Estoque Medio";
		}else {
			return "Estoque Alto";
		}
	}
	
	public double totalVenda() {
		return qtde * valorVenda;
	}
	
	public void atualizarValores(float porc) {
		valorVenda = valorVenda + valorVenda * (porc / 100);
		valorCompra = valorCompra + valorCompra * (porc / 100);
	}

}
