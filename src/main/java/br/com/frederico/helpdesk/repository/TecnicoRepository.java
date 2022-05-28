package br.com.frederico.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.frederico.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
