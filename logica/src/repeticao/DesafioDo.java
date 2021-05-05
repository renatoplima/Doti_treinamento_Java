package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	
	public static void main(String[] args) {
		
		do {
		JOptionPane.showMessageDialog(null, "Jogador1");
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		JOptionPane.showMessageDialog(null, "Jogador2");
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero Digitado"));
		int contador = 1;
		while (numero1 != numero2) {
			if (numero2 < numero1) {
				JOptionPane.showMessageDialog(null, "chute um n�mero MAIOR");
			}else {
				JOptionPane.showMessageDialog(null, "chute um n�mero MENOR");
			}
			
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero Digitado"));
			contador = contador + 1;  // ou contador++; ou contador+=1;
		}
		JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou o numero em " + contador + " tentativas");
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Vamos jogar Novamente", JOptionPane.YES_NO_OPTION)==0);
		
		/*
		 * O Jogador1 ir� digitar um n�mero e caber� ao Jogador2 descobrir qual foi o n�mero digitado pelo Jogador1.
		 * 
		 * Primeira Miss�o:
		 * - Fazer com que a aplica��o pergunte o n�mero para o Jogador2 enquanto ele n�o acertar o n�mero, e quando acertar 
		 * exibir a mensagem de parab�ns.
		 * 
		 * Segunda Miss�o:
		 * - Ap�s o Jogador2 chutar o n�mero voc� deve exibir para ele uma dica, informado se o n�mero digitado pelo Jogador1 
		 * � maior ou menos que o n�mero que ele digitou.
		 * 
		 * Terceira Miss�o:
		 * - Quando o jogador2 aecrtar, junto com a mensagem de parab�ns dever� exibir quantas tentativas ele utilizou at� acertar
		 * o n�mero.
		 * 
		 */
	}

}
