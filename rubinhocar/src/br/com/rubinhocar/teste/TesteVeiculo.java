package br.com.rubinhocar.teste;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {

		/*
		 * Exemplo errado - criando o objeto
		 * Veiculo objeto2;
		 */
		
		// 1� Instancias um objeto
		Veiculo objeto = new Veiculo();
		
		// 2� Preencher os dados
		//objeto.preencherModelo(JOptionPane.showInputDialog("Modelo"));
		
		// 3� Exibir os dados
		//System.out.println(objeto.retornarModelo());
		
		objeto.preencherTudo(Float.parseFloat(JOptionPane.showInputDialog("Valor")), JOptionPane.showInputDialog("Modelo"), JOptionPane.showInputDialog("Montadora"));
		System.out.println(objeto.retornarTudo());
	}

}
