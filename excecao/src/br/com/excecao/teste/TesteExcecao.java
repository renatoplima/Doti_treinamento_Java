package br.com.excecao.teste;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exce��es Unchecked (DC) = Depois da Compila��o
		// Exce��es checked (AC) = Antes da Compila��o
		
		try {
			
/*			int numero = Integer.parseInt("4");
			System.out.println("Numero: " + numero);
			
			String palavra=null;
			System.out.println("Qtde Letras: " + palavra.length());
*/			
			/*
			 * Particularidades dos vetores:
			 * - Seu tamanho � est�tico.
			 * - Os dados s�o homogeneos.
			 * - Exige uma vari�vel(indice) para controlar as posi��es.
			 * - N�o � poss�vel remover uma posi��o.
			 * - Ordena��o d� trabalho pra fazer.
			 */
			
			String palavras[] = new String[10];
			int indice = 0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			}while(JOptionPane.showConfirmDialog(null, "Continuar", "Vetores", JOptionPane.YES_NO_OPTION)==0);
			
			System.out.println(palavras); //Posi��o de mem�ria
			
			for (int contador = 0; contador < indice ; contador++) {
				System.out.println("Palavras n�" + (contador + 1) + ": " + palavras[contador]);
			}
			
			
/*			int numeros[] = new int[3];
			numeros[0] = 150;
			numeros[1] = 23;
			numeros[2] = 10;
*/		
		}catch(Exception e) {
			System.err.println(MinhaExcecao.tratar(e)); 
		}finally {
			System.out.println("Volte Sempre");
			//Encerrar Banco de Dados
			//Fechar arquivos
		}

	}

}
