package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		
		if(idade >= 18 && idade <= 70) {
			// Somente vai ser executado se a condi??o for verdadeira
			System.out.println(nome + ", Voc? deve votar obrigatoriamente");			
		}
		if (idade > 0 && idade < 16){
			System.out.println(nome + ", Voc? n?o pode votar ainda");	
		}
		if ((idade >= 16 && idade <= 17) || idade >= 70 ) {
			System.out.println(nome + ", seu voto ? facultativo");
		}
			
		/*
		 * Pedir: nome e idade
		 * De acordo com as regras para vota??o no brasil oriente o usu?rio se ele pode votar,
		 * se ele n?o pode votar ou se o voto dele ? facultativo.
		 * 
		 */
	}
	
}
