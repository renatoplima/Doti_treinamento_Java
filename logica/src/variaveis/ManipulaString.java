package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "RenatoPLima@RenatoPLima.Com.Br";
		System.out.println("Original        : "+ email);
		System.out.println("Minusculo       : "+ email.toLowerCase());
		System.out.println("Maiusculo       : "+ email.toUpperCase());
		System.out.println("Qtde Caracteres : "+ email.length());
		System.out.println("Tem Arroba      ? " + email.contains("@"));
		System.out.println("Posi��o do @    : " + email.indexOf("@"));
		System.out.println("Do 3� at� o 5�  : " + email.substring(2,5));
		System.out.println("Do 3� at� o fim : " + email.substring(2));
		System.out.println("Primeira Metade : " + email.substring(0, email.length()/2));
		System.out.println("Segunda Metade  : " + email.substring(email.length()/2));
		System.out.println("Usu�rio         : " + email.substring(0, email.indexOf("@")));
		System.out.println("Usu�rio format  : " + email.substring(0, email.indexOf("@")).toLowerCase());
		System.out.println("Servidor        : " + email.substring(email.indexOf("@") + 1));
		System.out.println("Servidor format : " + email.substring(email.indexOf("@") + 1).toLowerCase());
		System.out.println("1� Caracter     : " + email.charAt(0));
		System.out.println("� igual         ? " + email.equals("RenatoPLima@RenatoPLima.Com.Br"));
	
		
		
		/*
		 * churros => variavel
		 * churros() => fun��o
		 * Abc.churros() => m�todo
		 * Churros => classe
		 * 
		 */
		
	}	
	
}