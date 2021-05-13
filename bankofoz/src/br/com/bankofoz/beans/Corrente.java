package br.com.bankofoz.beans;

public class Corrente extends Conta{

	private double limite;
	private double taxa;
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - taxa);
	}
	
	public void sacar(double valor) {
//		if (valor <= super.getSaldo()) {
//			super.setSaldo(super.getSaldo() - valor);
//		}else if (valor > super.getSaldo() && valor <= (super.getSaldo() + limite)) {
//			double diff = valor - super.getSaldo();
//			super.setSaldo(0);
//			limite-=diff;		
//		}else
//			System.out.println("Saldo insuficiente");
		
		if (getSaldo() >= valor) {
			super.setSaldo(super.getSaldo() - valor);
		}
	}
	public double getSaldo() {
//		double total=limite + super.getSaldo();
//		String result="Saldo  = " + super.getSaldo() + "\n" + "Limite =" + limite + "\n" + "Total = " + total;
//		return result;
		return limite + super.getSaldo();
	}
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}
	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	
	
}
