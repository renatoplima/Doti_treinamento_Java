package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Agencia;
import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Endereco;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magic;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				Magic.s("Nome"),
				Magic.s("Email").toLowerCase(),
				Magic.s("Fone"),
				new Endereco(
						Magic.s("Logradouro"),
						Magic.s("Bairro"),
						Magic.s("Cidade"),
						Magic.s("Estado"),
						Magic.s("CEP"),
						Magic.s("Numero"),
						Magic.s("Complemento")
				),
				Magic.i("ID")
		);
		Agencia agencia = new Agencia(
				"HomeOffice",
				1,
				"123465789"
				);
		
		Conta conta = new Conta(
				123,
				0,
				cliente,
				agencia
				);
		int tipoConta = Magic.i("<1> para Conta Corrente.\n<2> para Poupança");
		while (tipoConta < 1 || tipoConta > 2) {
			tipoConta = Magic.i("<1> para Conta Corrente.\n<2> para Poupança");
		}
		if (tipoConta == 'C') {
			conta = new Corrente(
					123,
					0,
					cliente,
					agencia,
					1000,
					10
					);
		}else {
			conta = new Poupanca(
					123,
					0,
					cliente,
					agencia,
					11,
					"13/05/2021"
					);
		}
		
		char opcao = Magic.s("Digite:\n1 para depósito.\n2 para sacar.\n3 para saldo.\n0 para sair.").charAt(0);
		if (opcao == '0') {
			System.out.println("Obrigado por acessar nosso Banco");
		}else if (opcao == '1') {
			double deposito =  Magic.d("Valor do depósito.");
			System.out.println("Seu saldo anterior é de: " + conta.getSaldo());
			conta.setSaldo(conta.getSaldo() + deposito);
			System.out.println("Valor do depósito: " + deposito);
			System.out.println("Seu saldo é de: " + conta.getSaldo());
		}else if (opcao == '2') {
			double saque =  Magic.d("Valor do saque.");
			System.out.println("Seu saldo anterior é de: " + conta.getSaldo());
			conta.setSaldo(conta.getSaldo() - saque);
			System.out.println("Valor do saque: " + saque);
			System.out.println("Seu saldo é de: " + conta.getSaldo());
		}else if (opcao == '3') {
			System.out.println("Seu saldo é de: " + conta.getSaldo());
		}
		
	}

}
