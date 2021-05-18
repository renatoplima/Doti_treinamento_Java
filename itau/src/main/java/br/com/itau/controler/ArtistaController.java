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

import br.com.itau.dao.ArtistaDAO;
import br.com.itau.modelo.Artista;

@RestController // para indicar ao Spring Boot que esta classe irá responder métodos do HTTP
@CrossOrigin("*") // para liberar o acesso fora do servidor à estes recursos
public class ArtistaController {
	
	@Autowired // delega para Spring Boot o gerenciamento deste atributo
	private ArtistaDAO dao; 

	@PostMapping("/apagaartista")
	public ResponseEntity<Boolean> delete(@RequestBody Artista objeto){
		try {
			dao.deleteById(objeto.getId());
			return ResponseEntity.ok(true);	
		}catch(Exception e) {
			return ResponseEntity.status(403).build();
		}
	}
	
	@GetMapping("/nomeartistico/{nome}")
	public ResponseEntity<List<Artista>> getNomeArtistico(@PathVariable String nome){
		List<Artista> lista = (List<Artista>)dao.findByNomeArtisticoLike("%" + nome + "%");
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/artista/{id}")
	public ResponseEntity<Artista> getArtista(@PathVariable int id){
		Artista resposta = dao.findById(id).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/artistas/{nacionalidade}")
	public ResponseEntity<List<Artista>> getNacGet(@PathVariable String nacionalidade) {
		List<Artista> lista = (List<Artista>) dao.findByNacionalidade(nacionalidade);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>)dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> add(@RequestBody Artista objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(404).build();
		}

	}

		

}
