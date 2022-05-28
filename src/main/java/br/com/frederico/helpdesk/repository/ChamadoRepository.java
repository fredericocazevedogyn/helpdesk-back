package br.com.frederico.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.frederico.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
