package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {
	
	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Digite seu email").toLowerCase();
		//if (email.contains("@")==false) {
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Digite seu email com @").toLowerCase();
		}
		System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
		
		String nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		// exibam o nome somente se o nome tiver mais que 3 caracteres e menos que 15 caracteres
		
		while (nome.length() <= 3 || nome.length() >= 15){
			nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		}
		System.out.println("Nome: " + nome);
	}

}
