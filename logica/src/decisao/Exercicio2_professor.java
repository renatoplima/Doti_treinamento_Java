package decisao;

import javax.swing.JOptionPane;

public class Exercicio2_professor {

	public static void main(String[] args) {

		short valor1 = Short.parseShort(JOptionPane.showInputDialog("1º Valor"));
		short valor2 = Short.parseShort(JOptionPane.showInputDialog("2º Valor"));
		String operacao = JOptionPane.showInputDialog("Operação Aritmética");
		int resultado = 0;
		if (operacao.equals("+")) {
			resultado = valor1 + valor2;
		}else if (operacao.equals("-")) {
			resultado = valor1 - valor2;
		}else if (operacao.equals("*")) {
			resultado = valor1 * valor2;
		}else if (operacao.equals("/")) {
			resultado = valor1 / valor2;
		}else {
			System.out.println("Operador Aritimético utilizado esta incorreto");
		}
		System.out.println("Resultado: " + resultado);
	}

}
