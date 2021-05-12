package br.com.lojagama.implementacao;

import br.com.lojagama.beans.Cliente;
import br.com.lojagama.beans.Endereco;
import br.com.lojagama.beans.Pagamento;
import br.com.lojagama.beans.Produto;
import br.com.lojagama.beans.Venda;

public class ImplementaVenda {
	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				1,
				"12/05/2021",
				new Cliente(
						"Renato",
						"renato@renato.com.br",
						"12345-6789",
						new Endereco(
								"Rua Pinheiral",
								"Vila Canero",
								"São Paulo",
								"SP",
								"03191-150",
								"22",
								""
								)
						),
				new Produto(
						1,
						"Mouse",
						10.00,
						15.00,
						3
						),
				new Pagamento(
						45.0,
						"Crédito",
					    "12/05/2021"
						),
				150.0
				);
		//System.out.println("Cliente    : " + venda.getCliente().getNome());
		System.out.println("Cliente    : " + venda.getResumo());
		System.out.println("Sobre o Estoque: " + venda.getProduto().verificarEstoque());
		System.out.println("Venda: " + venda.getProduto().getValorVenda());
		System.out.println("Compra: " + venda.getProduto().getValorCompra());
		venda.getProduto().atualizarValores(10);
		System.out.println("Após atualização: ");
		System.out.println("Venda: " + venda.getProduto().getValorVenda());
		System.out.println("Compra: " + venda.getProduto().getValorCompra());
		System.out.println("Total Venda: " + venda.getProduto().totalVenda());
	}

}
