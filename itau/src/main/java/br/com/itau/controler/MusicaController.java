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

import br.com.itau.dao.MusicaDAO;
import br.com.itau.modelo.Musica;

@RestController // para indicar ao Spring Boot que esta classe irá responder métodos do HTTP
@CrossOrigin("*") // para liberar o acesso fora do servidor à estes recursos
public class MusicaController {
	
	@Autowired
	private MusicaDAO dao;
	
	@GetMapping("/lancamento/{artista_id}")
	public ResponseEntity<Integer> getTotalLancamento(@PathVariable int artista_id){
		return ResponseEntity.ok(dao.findByTotalLancamento(artista_id));
	}
	
	@GetMapping("/catalogo/{artista_id}")
	public ResponseEntity<Integer> getTotalCatalogo(@PathVariable int artista_id){
		return ResponseEntity.ok(dao.findByTotalCatalogo(artista_id));
	}
	
	@GetMapping("/musicas")
	public ResponseEntity<List<Musica>> getMusicas(){
		List<Musica> lista = (List<Musica>)dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> add(@RequestBody Musica objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(404).build();
		}

	}
	
}
