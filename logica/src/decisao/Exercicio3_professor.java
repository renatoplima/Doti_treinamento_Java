package decisao;

import javax.swing.JOptionPane;

public class Exercicio3_professor {
	
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("1? Valor"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("2? Valor"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("3? Valor"));
		if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
			System.out.println("existe valores iguais, por favor digite valores diferentes");
		}else {
			if (valor1 > valor2 && valor1 > valor3) {
				System.out.println(valor1);
				if (valor2 > valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);
				}
			}else if (valor2 > valor1 && valor2 > valor3) {
				System.out.println(valor2);
				if (valor1 > valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);
				}
			}else {
				System.out.println(valor3);
				if (valor1 > valor2) {
					System.out.println(valor1);
					System.out.println(valor2);
				}else {
					System.out.println(valor2);
					System.out.println(valor1);
				}
			}
		}	
		
	}

}
