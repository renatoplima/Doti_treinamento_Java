package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3_dificil {

	public static void main(String[] args) {

		int count = 0;
		int maior = 0;
		int total = 0;
		String nome_jovem = "";
		int idade_jovem = 0;
		String nome_experiente = "";
		int idade_experiente = 0;

		do {
			String nome = JOptionPane.showInputDialog("Digite seu Nome").toUpperCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
			count+=1; // ou count++;
			total = total + idade; // ou total+=idade;

			if (idade >= 18) {
				maior+=1;
			}
			if (idade > idade_experiente) {
				idade_experiente = idade;
				nome_experiente = nome;
			}
			if (idade < idade_jovem || count == 1) {
				idade_jovem = idade;
				nome_jovem = nome;
			}	

		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "digitar Novamente", JOptionPane.YES_NO_OPTION)==0);
		int media = (total / count);
		System.out.println("Pesquisa teve " + maior + " pessoas maiores de idade");
		System.out.println("A média de idades foi: " + media);
		System.out.println("A pessoa mais experiente é: " + nome_experiente + " com " + idade_experiente + " anos.");
		System.out.println("A pessoa mais joven é: " + nome_jovem + " com " + idade_jovem + " anos.");
	}

}
