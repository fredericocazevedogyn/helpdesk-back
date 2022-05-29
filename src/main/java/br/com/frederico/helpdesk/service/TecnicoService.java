package br.com.frederico.helpdesk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.frederico.helpdesk.domain.Tecnico;
import br.com.frederico.helpdesk.repository.TecnicoRepository;
import br.com.frederico.helpdesk.service.eception.ObjectNotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = tecnicoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: ID - " + id));
	}

	public List<Tecnico> findAll() {
		return tecnicoRepository.findAll();
	}
	
}
