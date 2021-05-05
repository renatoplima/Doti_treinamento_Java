package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {
	
	public static void main(String[] args) {
		
		do {
		float salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("Salário"));
		float valor_extras = Float.parseFloat(JOptionPane.showInputDialog("Valor Extras"));
		float fgts = (salario_bruto + valor_extras) * (float)0.08;
		System.out.println("Salário Bruto: " + (salario_bruto + valor_extras));
		System.out.println("FGTS: " + fgts);
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Executar Novamente", JOptionPane.YES_NO_OPTION)==0);
		
	}

}
