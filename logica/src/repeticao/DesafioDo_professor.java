package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo_professor {
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
		int chute=0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe:"));
			contador = contador + 1;
			// contador++;
			// contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chute um número menor");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chute um número maior");
			}
		}while(numero!=chute);
		
		JOptionPane.showMessageDialog(null, "Parabéns você acertou com " + contador + " tentativa(s)");
	}

}
