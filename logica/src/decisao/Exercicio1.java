package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Quantidade de Di?rias"));
		double valor_diaria = 80;
		double total_diarias = valor_diaria * diarias;
		if (diarias > 15) {
			double imposto = diarias * 5.5;
			double total_conta = imposto + total_diarias; 
			System.out.println("H?spede               : "+ nome);
			System.out.println("Valor da Di?ria       : R$"+ valor_diaria);
			System.out.println("Valor di?ria imposto  : R$5,50");
			System.out.println("Total das Di?rias     : R$"+ total_diarias);
			System.out.println("Total Impostos        : R$"+ imposto);
			System.out.println("Total da conta        : R$"+ total_conta);		
		}
		else if (diarias == 15) {
			double imposto = diarias * 6;
			double total_conta = imposto + total_diarias;
			System.out.println("H?spede               : "+ nome);
			System.out.println("Valor da Di?ria       : R$"+ valor_diaria);
			System.out.println("Valor di?ria imposto  : R$6,00");
			System.out.println("Total das Di?rias     : R$"+ total_diarias);
			System.out.println("Total Impostos        : R$"+ imposto);
			System.out.println("Total da conta        : R$"+ total_conta);		
		}
		else {
			double imposto = diarias * 8;
			double total_conta = imposto + total_diarias;
			System.out.println("H?spede               : "+ nome);
			System.out.println("Valor da Di?ria       : R$"+ valor_diaria);
			System.out.println("Valor di?ria imposto  : R$8,00");
			System.out.println("Total das Di?rias     : R$"+ total_diarias);
			System.out.println("Total Impostos        : R$"+ imposto);
			System.out.println("Total da conta        : R$"+ total_conta);	
		}

	}
	
}
