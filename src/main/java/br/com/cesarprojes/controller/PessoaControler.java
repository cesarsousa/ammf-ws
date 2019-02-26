package br.com.cesarprojes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesarprojes.entity.Pessoa;
import br.com.cesarprojes.repository.PessoaRepository;


@Controller
@RequestMapping(path="/pessoa")
public class PessoaControler {
	
	@Autowired
	private PessoaRepository repository;
	
	@GetMapping(value = "listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Pessoa>> findPessoas() {
		List<Pessoa> pessoas = (List<Pessoa>) repository.findAll();
		return ResponseEntity.ok(pessoas);
	}
	
	

}
