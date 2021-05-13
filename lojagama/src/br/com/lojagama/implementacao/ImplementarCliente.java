package br.com.lojagama.implementacao;

import br.com.lojagama.beans.Cliente;
import br.com.lojagama.beans.Endereco;
import br.com.lojagama.beans.PessoaFisica;
import br.com.lojagama.beans.PessoaJuridica;
import br.com.lojagama.util.Magic;

public class ImplementarCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		String nome = Magic.s("Nome:");
		String email = Magic.s("Email").toLowerCase();
		String fone = Magic.s("Fone");
		Endereco endereco = new Endereco(
				Magic.s("Rua"),
				Magic.s("Bairro"),
				Magic.s("Cidade"),
				Magic.s("Estado"),
				Magic.s("CEP"),
				Magic.s("Numero"),
				Magic.s("Complemento")
				);
				
		char resposta = Magic.s("Digite J para PJ ou F para PF").charAt(0);
		
		if (resposta == 'J') {
			
			cliente = new PessoaJuridica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CNPJ"),
					Magic.s("CNAE"),
					Magic.s("Contato")
					);
			
		}else if (resposta == 'F') {
			
			cliente = new PessoaFisica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CPF"),
					Magic.s("RG")
					);
		}else {
			System.out.println("Opção Inválida");
		}
		
		System.out.println("Nome     : " + nome);
		System.out.println("Endereço : " + endereco);
		System.out.println("email    : " + email);
		if (cliente instanceof PessoaFisica) {
			System.out.println("CPF      : " + ((PessoaFisica)cliente).getCpf());
			System.out.println("RG       : " + ((PessoaFisica)cliente).getRg());
		}else if (cliente instanceof PessoaJuridica) {
			System.out.println("CNPJ     : " + ((PessoaJuridica)cliente).getCnpj());
			System.out.println("CNAE     : " + ((PessoaJuridica)cliente).getCnae());
			System.out.println("Contato  : " + ((PessoaJuridica)cliente).getContato());
		}
				
		
	}

}
