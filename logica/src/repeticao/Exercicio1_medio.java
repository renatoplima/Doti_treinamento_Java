package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1_medio {
	
	public static void main(String[] args) {
		
		String nome = "";
		int idade = 0;
		char sexo = ' ';
		char experiencia = ' ';
		
		do {
		nome = JOptionPane.showInputDialog("Digite seu Nome").toUpperCase();
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
		sexo = JOptionPane.showInputDialog("Digite seu Sexo:\n M - Masculino\nF - Feminino").charAt(0);
		experiencia = JOptionPane.showInputDialog("Tem experi�ncia?\n S - Sim\nN - N�o").charAt(0);
		
		}while (idade == 0);
//		if (contM>contS && contM>contP) {
//			System.out.println("M�dio: " + contM);
//		}else if (contS>contP) {
//			System.out.println("Superior: " + contS);
//		}else {
//			System.out.println("P�s: " + contP);
		
	}

}
