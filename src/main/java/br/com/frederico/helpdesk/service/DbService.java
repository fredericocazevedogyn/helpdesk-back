package br.com.frederico.helpdesk.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.frederico.helpdesk.domain.Chamado;
import br.com.frederico.helpdesk.domain.Cliente;
import br.com.frederico.helpdesk.domain.Tecnico;
import br.com.frederico.helpdesk.domain.enuns.Perfil;
import br.com.frederico.helpdesk.domain.enuns.Prioridade;
import br.com.frederico.helpdesk.domain.enuns.Status;
import br.com.frederico.helpdesk.repository.ChamadoRepository;
import br.com.frederico.helpdesk.repository.ClienteRepository;
import br.com.frederico.helpdesk.repository.TecnicoRepository;

@Service
public class DbService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDb() {
		Tecnico tec1 = new Tecnico(null, "VALDIR CESAR", "13838243803", "VALDIR@MAIL.COM", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "LINUS TORVALDS", "80527954780", "TORVALDS@MAIL.COM", encoder.encode("123"));
		
		Chamado c1 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
}
