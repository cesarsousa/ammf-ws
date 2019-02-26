package br.com.cesarprojes.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cesarprojes.entity.Livro;

public interface LivroRepository extends CrudRepository<Livro, Integer>{

}
