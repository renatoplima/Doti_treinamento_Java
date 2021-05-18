package br.com.itau.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.itau.modelo.Usuario;

/*
 * DAO => é um pattern que sugestiona onde devem ficar os comando SQL DML.
 * Dentro das classes DAO's:
 * - Deve montar o CRUD(Create - Read - Update - Delete)
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
		
	/*
	 * CrudRepository será a classe pai do UsuarioDAP e esta informando ao Spring Boot
	 * que esta classe armazenará o CRUD para usuario. o Integer é para especificar que
	 * tipo de dado da chave primária é Integer.
	 */
	
	/*
	 * Métodos herdados do CrudRepository:
	 * - save(objeto): grava/altera uma linha no banco de dados.
	 * - findById(int): pesquisa um usuário pelo código.
	 * - findAll(): retorna todos os usuários.
	 * - deleteById(int): apaga um usuário pelo código.
	 * - deleteAll(): apaga tudo.
	 * - count(): retorna qtos usuários existem. 
	 */

	public Usuario findByEmailAndSenha(String email, String senha);
	
}
