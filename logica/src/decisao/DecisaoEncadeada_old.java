package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada_old {
	
	public static void main(String[] args) {
		
		String diciplina = JOptionPane.showInputDialog("Disciplina").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1? nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2? nota"));
		double media = (nota1 + nota2) / 2;
		
		if (faltas > 20) {
			System.out.println("Voc? foi Reprovado em "+ diciplina + " Por FALTAS");
		}
		else if (faltas <= 20) {
			if(media >=6 && media < 10) {
				System.out.println("Voc? foi aprovado na Disciplina "+ diciplina);			
			}
			else if (media >= 4 && media < 6){
				System.out.println("Voc? esta de exame em "+ diciplina);	
			}
			else {
				System.out.println("Voc? foi Reprovado em "+ diciplina);
			}
		}
		
				
		System.out.println("Sua Media foi: "+ media);
		System.out.println("Suas faltas foram:  "+ faltas);
		
		/*
		 * Solicitem as Faltas
		 * Para que  Aluno esteja aprovado ele precisa ter a qtde e faltas nemnos que 20 e a nota maior ou igual a 6
		 */
	}

}