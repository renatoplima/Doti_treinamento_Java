package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {
	
	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList();
		
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "JR", 4000));
		lista.add(new Cargo("Gerente de Projetos", "JR", 4500));
		lista.add(new Cargo("DBA", "SR", 15000));
		lista.add(new Cargo("Analista", "Spec", 22550));
		
		System.out.println("Completa: " + lista);
		
		
		double total = 0;
		//int count = 0; // n�o precisa user um contador pois podemos usar o size 
		double totalDbas = 0;
		int jrs = 0;
		// double maior = 0; // errei :S
		Cargo resposta = new Cargo();
		for (Cargo objeto : lista) {
			System.out.println("Cargo   : "+ objeto.getNome());
			System.out.println("Nivel   : "+ objeto.getNivel());
			System.out.println("Salario : "+ objeto.getSalario());
			System.out.println("===========================");
			total+=objeto.getSalario();
			// count++; // n�o precisa user um contador pois podemos usar o size 
			if (objeto.getNome().equals("DBA")) {
				totalDbas+=objeto.getSalario();
			}
			if (objeto.getNivel().equals("JR")) {
				jrs++;
			}
			if (objeto.getSalario() > resposta.getSalario()) {
				resposta = objeto;
			}
		}
		
		System.out.println("Total de Sal�rios: R$" + total);
		// System.out.println("M�dia de Sal�rios: R$" + total / count); // n�o precisa user um contador pois podemos usar o size
		System.out.println("M�dia de Sal�rios: R$ " + (total / lista.size()));
		System.out.println("Total de DBA's   : R$ " + totalDbas);
		System.out.println("Total de JR's    : " + jrs + " JR's");
		System.out.println("Maior Sal�rio    :  " + resposta); // Completo
		System.out.println("Maior Sal�rio    :  cargo : " + resposta.getNome() + " > nivel : " + resposta.getNivel() ); // Apenas cargo e n�vel
		
		/*
		 * Requisi��o:
		 * - exibir o total de salario
		 * - m�dia dos sal�rios
		 * - o total dos DBA's
		 * - a quantidade de cargos nivel junior
		 * - nome do cargo e o nivel que possui o maior salario
		 * 
		 */
		

	}

}
