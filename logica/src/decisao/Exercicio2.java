package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		short valor1 = Short.parseShort(JOptionPane.showInputDialog("1º Valor"));
		short valor2 = Short.parseShort(JOptionPane.showInputDialog("2º Valor"));
		String operacao = JOptionPane.showInputDialog("Operação Aritmética");
		if (operacao.equals("+")) {
			double resultado = valor1 + valor2;
			System.out.println("Resultado: "+ resultado);
		}else if (operacao.equals("-")) {
			double resultado = valor1 - valor2;
			System.out.println("Resultado: "+ resultado);
		}else if (operacao.equals("*")) {
			double resultado = valor1 * valor2;
			System.out.println("Resultado: "+ resultado);
		}else if (operacao.equals("/")) {
			double resultado = valor1 / valor2;
			System.out.println("Resultado: "+ resultado);
		}else {
			System.out.println("Operador Aritimético utilizado esta incorreto");
		}
		
	}

}
