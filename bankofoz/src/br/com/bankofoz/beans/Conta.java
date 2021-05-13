package br.com.bankofoz.beans;

/*
 * Polimorfismo: Quando um elemento age de multiplas formas.
 * Pode ocorrer com:
 * Objeto => em uma herança, onde você cria pelo pai e instancia pelo filho. 
 */

public class Conta {
	
	private int numero;
	private double saldo;
	private Cliente cliente;
	private Agencia agencia;
	
	public void depositar(double valor) {
		if (valor > 0 ) {
			saldo+=valor;
		}
	}
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo-=valor;
		}
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia=" + agencia + "]";
	}
	public Conta(int numero, double saldo, Cliente cliente, Agencia agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
	}
	public Conta() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	

}
