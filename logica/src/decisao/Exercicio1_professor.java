package decisao;

import javax.swing.JOptionPane;

public class Exercicio1_professor {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome");
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Quantidade de Di?rias"));
		double valor_diaria = 80;
		float imposto = (float)5.5;
		if (diarias == 15) {
			imposto = 6;
		}
		else if (diarias < 15) {
			imposto = 8;
		}
		System.out.println("Nome : " + nome);
		System.out.println("Total: " + ((valor_diaria + imposto) * diarias));
	}
	
}
