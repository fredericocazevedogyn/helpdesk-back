package br.com.frederico.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.frederico.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
