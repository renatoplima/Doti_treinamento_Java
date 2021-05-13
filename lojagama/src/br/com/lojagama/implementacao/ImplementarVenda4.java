package br.com.lojagama.implementacao;

import br.com.lojagama.beans.Cliente;
import br.com.lojagama.beans.Endereco;
import br.com.lojagama.beans.Pagamento;
import br.com.lojagama.beans.Produto;
import br.com.lojagama.beans.Venda;
import br.com.lojagama.util.Magic;


public class ImplementarVenda4 {
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Magic.i("Nota Fiscal"),
				Magic.s("Data"),
				new Cliente(
						Magic.s("Nome do Cliente"),
						Magic.s("Email do Cliente"),
						Magic.s("Telefone do Cliente"),
						new Endereco(
								Magic.s("Logradouro do Cliente"),
								Magic.s("Bairro do Cliente"),
								Magic.s("Cidade do Cliente"),
								Magic.s("Estado do Cliente"),
								Magic.s("CEP do Cliente"),
								Magic.s("Numero da Casa do Cliente"),
								Magic.s("Complemento")
								)
						),
				new Produto(
						Magic.i("ID do Produto"),
						Magic.s("Descrição do Produto"),
						Magic.d("Valor Compra"),
						Magic.d("Valor Venda"),
						Magic.i("Quantidade")
						),
				new Pagamento(
						Magic.d("Valor Total"),
						Magic.s("Forma de Pagamento"),
						Magic.s("Data do Pagamento")
						),
				Magic.d("Total")
				);
		System.out.println("Cliente    : " + venda.getCliente().getNome());
		System.out.println("Produto    : " + venda.getProduto().getDescricao());
		System.out.println("Quantidade : " + venda.getProduto().getQtde());
		System.out.println("V.Compra   : " + venda.getProduto().getValorCompra());
		System.out.println("V.Venda    : " + venda.getProduto().getValorVenda());
		
	}

}