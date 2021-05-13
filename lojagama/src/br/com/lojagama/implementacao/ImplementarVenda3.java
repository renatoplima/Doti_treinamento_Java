package br.com.lojagama.implementacao;

import javax.swing.JOptionPane;

import br.com.lojagama.beans.Cliente;
import br.com.lojagama.beans.Endereco;
import br.com.lojagama.beans.Pagamento;
import br.com.lojagama.beans.Produto;
import br.com.lojagama.beans.Venda;

public class ImplementarVenda3 {
	
	public static int i(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static double d(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				i("Nota Fiscal"),
				s("Data"),
				new Cliente(
						s("Nome do Cliente"),
						s("Email do Cliente"),
						s("Telefone do Cliente"),
						new Endereco(
								s("Logradouro do Cliente"),
								s("Bairro do Cliente"),
								s("Cidade do Cliente"),
								s("Estado do Cliente"),
								s("CEP do Cliente"),
								s("Numero da Casa do Cliente"),
								s("Complemento")
								)
						),
				new Produto(
						i("ID do Produto"),
						s("Descrição do Produto"),
						d("Valor Compra"),
						d("Valor Venda"),
						i("Quantidade")
						),
				new Pagamento(
						d("Valor Total"),
						s("Forma de Pagamento"),
						s("Data do Pagamento")
						),
				d("Total")
				);
		System.out.println("Cliente    : " + venda.getCliente().getNome());
		System.out.println("Produto    : " + venda.getProduto().getDescricao());
		System.out.println("Quantidade : " + venda.getProduto().getQtde());
		System.out.println("V.Compra   : " + venda.getProduto().getValorCompra());
		System.out.println("V.Venda    : " + venda.getProduto().getValorVenda());
		
	}


}
