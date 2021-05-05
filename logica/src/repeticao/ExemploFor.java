package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	
	public static void main(String[] args) {
		
		/*
		 * Sintaxe do "For" � formado por 3 par�metros =>
		 * - Vari�vel que vai contar e o valor que ela vai iniciar
		 * - Condi��o (at� quando o lo�o vai ser repetido)
		 * - A forma de contagem (se vai ser de 1 em 1, 2 em 2 ...)
		 */
		
		//for (int cont=0;cont<50;cont+=1) {
		//	System.out.println("Contador: " + cont);
		//}
		
		// Tabuada: =>  numero x contador = resultado
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada * cont));
		}
	}

}
