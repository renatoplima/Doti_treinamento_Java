package br.com.bankofoz.util;

import javax.swing.JOptionPane;

public class Magic {

	public static int i(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static double d(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	
}
