package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {
	
	public static void main(String[] args) {
		/*
		 * Capturem: o nome de um produto, o Valor de compra, e a quantidade.
		 * Sobre o valor de compra considerem um lucro de 20% para obter o valor de venda
		 * Calcule o Total considerando o valor de venda e quantidade.
		 * Sobre o total acima calcule 22% de impostos
		 * No final exiba:
		 * O nome do produto
		 * O Valor de venda
		 * O Total sem impostos 
		 */
		String nome = JOptionPane.showInputDialog("Nome do Produto");
		double valor_compra = Double.parseDouble(JOptionPane.showInputDialog("Valor da Compra"));
		double qtde = Double.parseDouble(JOptionPane.showInputDialog("Quantidade"));
		double valor_venda = valor_compra * 0.20 + valor_compra;
		double valor_imposto = ((valor_venda * qtde)* 0.22);
		double total_com_imposto = valor_imposto + (valor_venda * qtde) ;
		double total_sem_imposto = valor_venda * qtde;
		System.out.println("Nome             : "+ nome);
		System.out.println("Valor Compra     : "+ valor_compra);
		System.out.println("Valor Venda      : "+ valor_venda);
		System.out.println("Total s/ Imposto : "+ total_sem_imposto);
		System.out.println("Valor imposto    : "+ valor_imposto);
		System.out.println("Total c/ Imposto : "+ total_com_imposto);
		
	}

}
