package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	
	public static void main(String[] args) {
		
		String diciplina = JOptionPane.showInputDialog("Disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1� nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2� nota"));
		double media = (nota1 + nota2) / 2;
		
		// && => and
		// || => or
		
		if(media >=6 && media < 10) {
			// Somente vai ser executado se a condi��o for verdadeira
			System.out.println("Voc� foi aprovado na Disciplina em "+ diciplina);			
		}
		if (media >= 4 && media < 6){
			System.out.println("Voc� tem chance no exame de "+ diciplina);	
		}
		if (media < 4) {
			System.out.println("Voc� foi Reprovado em "+ diciplina);
		}
		
		System.out.println("Sua Media foi: "+ media);
		
		/*
		 * Capturem:
		 * - nome da diciplina
		 * - primeira nota
		 * - segunda nota
		 * - calcular a m�dia
		 * - exibir a m�dia
		 * 
		 */
		
	}

}
