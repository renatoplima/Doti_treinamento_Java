package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2_facil {

	public static void main(String[] args) {

		int medio = 0;
		int superior = 0;
		int pos = 0 ;
		String escolaridade = "";
		
		do {
			escolaridade = JOptionPane.showInputDialog("Digite sua escolaridade (Medio, Superior ou Pos):").toLowerCase();
			if (escolaridade.equals("medio") ) {
				medio+=1;
			}else if (escolaridade.equals("superior")){
				superior+=1;
			}else if (escolaridade.equals("pos")){
				pos+=1;
			}
		}while(escolaridade.equals("pos") || escolaridade.equals("superior") || escolaridade.equals("medio"));
		
		if (medio > superior && medio > pos) {
			JOptionPane.showMessageDialog(null, "N�vel mais votado foi o M�dio com " + medio + " votos.");
		}else if (superior > medio && superior > pos) {
			JOptionPane.showMessageDialog(null, "N�vel mais votado foi o Superior com " + superior + " votos.");
		}else if (pos > medio && pos > superior) {
			JOptionPane.showMessageDialog(null, "N�vel mais votado foi o P�s com " + pos + " votos.");
		}else if (medio == superior && medio == pos) {
			JOptionPane.showMessageDialog(null, "Valores iguais para os 3 n�veis, total de " + medio + " votos para cada");
		}else if (medio == superior && medio != pos) {
			JOptionPane.showMessageDialog(null, "Valores iguais para os n�veis M�dio e Superior, total de " + medio + " votos para cada");
		}else if (medio != superior && medio == pos)	{
			JOptionPane.showMessageDialog(null, "Valores iguais para os n�veis M�dio e P�s, total de " + medio + " votos para cada");
		}else {
			JOptionPane.showMessageDialog(null, "Valores iguais para os n�veis Superior e P�s, total de " + pos + " votos para cada");
		}

	}

}
