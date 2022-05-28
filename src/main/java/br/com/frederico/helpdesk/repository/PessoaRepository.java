package br.com.frederico.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.frederico.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
