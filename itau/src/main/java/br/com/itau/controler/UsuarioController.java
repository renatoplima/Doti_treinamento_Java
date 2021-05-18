package br.com.itau.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.dao.UsuarioDAO;
import br.com.itau.modelo.Usuario;

@RestController // para indicar ao Spring Boot que esta classe irá responder métodos do HTTP
@CrossOrigin("*") // para liberar o acesso fora do servidor à estes recursos
public class UsuarioController {
	
	@Autowired // delega para Spring Boot o gerenciamento deste atributo
	private UsuarioDAO dao; 

	
	@PostMapping("/login2") // Processamento no banco de dados, pois a query já esta validando se o usuário e senha estão corretos.
	public ResponseEntity<Usuario> logan2(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		resposta.setSenha("****");
		return ResponseEntity.ok(resposta);
	}
	
	@PostMapping("/login") // Processamento esta no BackEnd pois solicito para o banco a lista de todos os usuário e na aplicação que realizo o filtro.
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		for (Usuario usuario : lista) {
			if (usuario.getEmail().equals(objeto.getEmail()) && usuario.getSenha().equals(objeto.getSenha())) {
				return ResponseEntity.ok(usuario);
			}
		}
		return ResponseEntity.status(404).build();
	}
	
	@GetMapping("/userget/{cod}")
	public ResponseEntity<Usuario> getUserGet(@PathVariable int cod) {
		Usuario resposta = dao.findById(cod).orElse(new Usuario());
		resposta.setSenha("****");
		if (resposta.getId()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@PostMapping("/userpost")
	public ResponseEntity<Usuario> getUserPost(@RequestBody Usuario objeto) {
		Usuario resposta = dao.findById(objeto.getId()).orElse(new Usuario());
		resposta.setSenha("****");
		if (resposta.getId()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}

	@PostMapping("/novousuario")
	public ResponseEntity<Usuario> add(@RequestBody Usuario objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(404).build();
		}

	}
		
	@GetMapping("/users")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>)dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	

}
