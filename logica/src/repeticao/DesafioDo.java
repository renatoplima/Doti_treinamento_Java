package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
	
	public static void main(String[] args) {
		
		do {
		JOptionPane.showMessageDialog(null, "Jogador1");
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		JOptionPane.showMessageDialog(null, "Jogador2");
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o número Digitado"));
		int contador = 1;
		while (numero1 != numero2) {
			if (numero2 < numero1) {
				JOptionPane.showMessageDialog(null, "chute um número MAIOR");
			}else {
				JOptionPane.showMessageDialog(null, "chute um número MENOR");
			}
			
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o número Digitado"));
			contador = contador + 1;  // ou contador++; ou contador+=1;
		}
		JOptionPane.showMessageDialog(null, "Parabéns, você acertou o numero em " + contador + " tentativas");
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Vamos jogar Novamente", JOptionPane.YES_NO_OPTION)==0);
		
		/*
		 * O Jogador1 irá digitar um número e caberá ao Jogador2 descobrir qual foi o número digitado pelo Jogador1.
		 * 
		 * Primeira Missão:
		 * - Fazer com que a aplicação pergunte o número para o Jogador2 enquanto ele não acertar o número, e quando acertar 
		 * exibir a mensagem de parabéns.
		 * 
		 * Segunda Missão:
		 * - Após o Jogador2 chutar o número você deve exibir para ele uma dica, informado se o número digitado pelo Jogador1 
		 * é maior ou menos que o número que ele digitou.
		 * 
		 * Terceira Missão:
		 * - Quando o jogador2 aecrtar, junto com a mensagem de parabéns deverá exibir quantas tentativas ele utilizou até acertar
		 * o número.
		 * 
		 */
	}

}
