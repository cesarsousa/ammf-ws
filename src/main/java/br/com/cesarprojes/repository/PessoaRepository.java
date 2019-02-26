package br.com.cesarprojes.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cesarprojes.entity.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{

}
