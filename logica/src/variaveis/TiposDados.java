package variaveis;

import javax.swing.JOptionPane;

/*
 * Caracter?sticas do Java:
 * - OO
 * - m?dio n?vel
 * - arquitetura hibrida
 */
public class TiposDados {
	// main ? o m?todo start point de uma app Java
	public static void main(String[] args) {
		// <Tipo de dado> <nome/identificador> = <valor>;
		String nome = JOptionPane.showInputDialog("Digite seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso"));
		double imc = peso / (altura * altura);
		System.out.println("Nome...: "+ nome);
		System.out.println("Idade..: "+ idade);
		System.out.println("Altura.: "+ altura);
		System.out.println("Peso...: "+ peso);
		System.out.println("IMC....: "+ imc);
		
		/*
		 * Tipos de Dados:
		 * 	Num?rico: ? o dado que PODE ser utilizado em express?es matem?ticas.
		 * 	
		 * - int     => somente numeros inteiros
		 * - Double  => para n?meros com casas decimais (n?meros reais)
		 * 
		 * 	Alfanum?rico: ? o dado que n?o esta envolvido em opera??es matem?ticas.
		 * 
		 */



	} // fechando o m?todo

} // fechando a classe


/*
 * 
 * ctrl + i = indenta??o
 * ctrl + s = salva apenas classe atual
 * ctrl + shift + s = Salva tudo
 * bot?o direito > Refactor > Rename = alterar nome dos componentes
 * 
 */
