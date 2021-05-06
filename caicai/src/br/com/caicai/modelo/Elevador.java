package br.com.caicai.modelo;

public class Elevador {
	
	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int andarAtual;
	private int qtdePessoas;

	public String retornarTudo() {
		return "Nome         : " + nome + "\n" + 
			   "Andar Máximo : " + andarMaximo + "\n" + 
			   "Andar Minimo : " + andarMinimo + "\n" +
			   "Capacidade   : " + capacidadePessoas + " Pessoas" + "\n" +
			   "Andar Atual  : " + andarAtual + "\n" + 
			   "Qtde Pessoas : " + qtdePessoas;
	}
	public String subir() {
		if (andarAtual < andarMaximo) {
			andarAtual++;
			return "Subindo";
		}
		return "Não pode Subir";
	}
	public String descer() {
		if (andarAtual > andarMinimo) {
			andarAtual--;
			return "Descendo";
		}
		return "Não pode Descer";
	}
	public void entrar() {
		if (qtdePessoas < capacidadePessoas) {
			qtdePessoas++;
		}
	}
	public void entrar(int pQtde) {
		if ((pQtde + qtdePessoas)<= capacidadePessoas) {
			qtdePessoas+=pQtde;
		}
	}
	public void sair() {
		if (qtdePessoas > 0) {
			qtdePessoas--;
		}
	}
	public void inicializa(String pNome, int pAndarMax, int pAndarMin, int capPessoas) {
		//if (pNome.length() <= 40) {
		//	nome = pNome;
		//}
		//andarAtual = 0;
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = capPessoas;
		
	}

}
