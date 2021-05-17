package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
	
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		lista.add("DEV");
		lista.add("Analista");
		lista.add("Gerente");
		lista.add("DBA");
		lista.add("DBa");
		System.out.println("Completa: " + lista);
		
		/*
		 * Não podemos utilizar o for convencional com o Set 
		 */
		
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}
		
		
	}

}
