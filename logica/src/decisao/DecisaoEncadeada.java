package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String diciplina = JOptionPane.showInputDialog("Disciplina").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));

		if (faltas <= 20) {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1? nota"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2? nota"));
			double media = (nota1 + nota2) / 2;

			// && => and
			// || => or

			if(media >=6 && media < 10) {
				System.out.println("Voc? foi aprovado na Disciplina em "+ diciplina);			
			}
			else if (media >= 4 && media < 6){
				System.out.println("Voc? esta de exame em "+ diciplina);	
			}
			else {
				System.out.println("Voc? foi Reprovado em "+ diciplina);
			}

			System.out.println("Sua Media foi: "+ media);
		}
		else {
			System.out.println("Voc? foi Reprovado em "+ diciplina + " Por FALTAS");
		}
		/*
		 * Capturem: "nome da diciplina", "primeira nota" e "segunda nota".
		 * - calcular a m?dia e exibir a m?dia.
		 */
	}

}