package br.com.cesarprojes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesarprojes.entity.Texto;
import br.com.cesarprojes.repository.TextoRepository;

@Controller
@RequestMapping(path="/texto")
public class TextoController {
	
	@Autowired
	private TextoRepository repository;
	
	@GetMapping(value = "listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Texto>> findTextos() {
		List<Texto> textos = (List<Texto>) repository.findAll();
		
		List<Texto> textosFiltrados = new ArrayList<>();
		if(textos.size() > 2) {
			textosFiltrados.add(textos.get(0));
			textosFiltrados.add(textos.get(1));
		}
		
		return ResponseEntity.ok(textosFiltrados);
	}

}
