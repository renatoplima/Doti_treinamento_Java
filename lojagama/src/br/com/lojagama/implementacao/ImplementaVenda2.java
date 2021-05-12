package br.com.lojagama.implementacao;

import javax.swing.JOptionPane;

import br.com.lojagama.beans.Cliente;
import br.com.lojagama.beans.Endereco;
import br.com.lojagama.beans.Pagamento;
import br.com.lojagama.beans.Produto;
import br.com.lojagama.beans.Venda;

public class ImplementaVenda2 {
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Integer.parseInt(JOptionPane.showInputDialog("Nota Fiscal")),
				JOptionPane.showInputDialog("Data"),
				new Cliente(
						JOptionPane.showInputDialog("Nome do Cliente"),
						JOptionPane.showInputDialog("Email do Cliente"),
						JOptionPane.showInputDialog("Telefone do Cliente"),
						new Endereco(
								JOptionPane.showInputDialog("Logradouro do Cliente"),
								JOptionPane.showInputDialog("Bairro do Cliente"),
								JOptionPane.showInputDialog("Cidade do Cliente"),
								JOptionPane.showInputDialog("Estado do Cliente"),
								JOptionPane.showInputDialog("CEP do Cliente"),
								JOptionPane.showInputDialog("Numero da Casa do Cliente"),
								JOptionPane.showInputDialog("Complemento")
								)
						),
				new Produto(
						Integer.parseInt(JOptionPane.showInputDialog("ID do Produto")),
						JOptionPane.showInputDialog("Descrição do Produto"),
						Double.parseDouble(JOptionPane.showInputDialog("Valor Compra")),
						Double.parseDouble(JOptionPane.showInputDialog("Valor Venda")),
						Integer.parseInt(JOptionPane.showInputDialog("Quantidade"))
						),
				new Pagamento(
						Double.parseDouble(JOptionPane.showInputDialog("Valor Total")),
						JOptionPane.showInputDialog("Forma de Pagamento"),
						JOptionPane.showInputDialog("Data do Pagamento")
						),
				Double.parseDouble(JOptionPane.showInputDialog("Total"))
				);
		System.out.println("Cliente    : " + venda.getCliente().getNome());
		System.out.println("Produto    : " + venda.getProduto().getDescricao());
		System.out.println("Quantidade : " + venda.getProduto().getQtde());
		System.out.println("V.Compra   : " + venda.getProduto().getValorCompra());
		System.out.println("V.Venda    : " + venda.getProduto().getValorVenda());
		
	}


}
