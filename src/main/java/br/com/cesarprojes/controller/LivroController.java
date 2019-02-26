package br.com.cesarprojes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesarprojes.entity.Livro;
import br.com.cesarprojes.repository.LivroRepository;

@Controller
@RequestMapping(path="/livro")
public class LivroController {
	
	@Autowired
	private LivroRepository repository;	
	
	@GetMapping(value = "listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Livro>> findLivros() {
		List<Livro> livros = (List<Livro>) repository.findAll();
		return ResponseEntity.ok(livros);
	}

}
