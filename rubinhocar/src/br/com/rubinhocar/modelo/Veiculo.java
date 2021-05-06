package br.com.rubinhocar.modelo;

public class Veiculo {

	private float valor;
	private String modelo;
	private String montadora;
	
	public float retornarValor() {
		return valor;
	}	
	public String retornarModelo() {
		return modelo;
	}
	public String retornarMontadora() {
		return montadora;
	}
	public String retornarTudo() {
		return "Modelo: " + modelo + "\nMontadora: " + montadora + "\nValor: " + valor;
	}
	public double retornarDesconto() {
		return (valor * 0.90);
	}
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>){
	
	public void preencherValor(float param) {
		valor = param;
	}
	public void preencherModelo(String param) {
		if (param.length() <= 40) {
			modelo = param.toUpperCase();
		}	
	}
	public void preencherMontadora(String param) {
		if (param.length() <= 30) {
			montadora = param.toUpperCase();
		}
	}
	public void preencherTudo(float pValor, String pModelo, String pMontadora) {
		valor = pValor;
		if (pModelo.length() <= 40) {
			modelo = pModelo.toUpperCase();
		}
		if (pMontadora.length() <= 30) {
			montadora = pMontadora.toUpperCase();
		}		
	}
}