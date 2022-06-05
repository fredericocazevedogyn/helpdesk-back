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
		Tecnico tec1 = new Tecnico(null, "VALDIR CESAR", "438.915.376-54", "VALDIR@MAIL.COM", encoder.encode("123"));
		Tecnico tec2 = new Tecnico(null, "VALDIR CESAR", "866.122.171-46", "VALDIR1@MAIL.COM", encoder.encode("123"));
		Tecnico tec3 = new Tecnico(null, "VALDIR CESAR", "165.981.572-00", "VALDIR2@MAIL.COM", encoder.encode("123"));
		Tecnico tec4 = new Tecnico(null, "VALDIR CESAR", "441.462.132-15", "VALDIR3@MAIL.COM", encoder.encode("123"));
		Tecnico tec5 = new Tecnico(null, "VALDIR CESAR", "147.717.555-58", "VALDIR4@MAIL.COM", encoder.encode("123"));
		Tecnico tec6 = new Tecnico(null, "VALDIR CESAR", "831.252.137-20", "VALDIR6@MAIL.COM", encoder.encode("123"));
		Tecnico tec7 = new Tecnico(null, "VALDIR CESAR", "645.578.644-06", "VALDIR7@MAIL.COM", encoder.encode("123"));
		Tecnico tec8 = new Tecnico(null, "VALDIR CESAR", "218.433.335-20", "VALDIR8@MAIL.COM", encoder.encode("123"));
		Tecnico tec9 = new Tecnico(null, "VALDIR CESAR", "436.141.476-90", "VALDIR9@MAIL.COM", encoder.encode("123"));
		Tecnico tec10 = new Tecnico(null, "VALDIR CESAR", "235.638.608-40", "VALDIR10@MAIL.COM", encoder.encode("123"));
		
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "LINUS TORVALDS", "112.324.730-73", "TORVALDS@MAIL.COM", encoder.encode("123"));
		Cliente cli2 = new Cliente(null, "LINUS TORVALDS", "134.226.617-00", "TORVALDS1@MAIL.COM", encoder.encode("123"));
		Cliente cli3 = new Cliente(null, "LINUS TORVALDS", "302.355.781-00", "TORVALDS2@MAIL.COM", encoder.encode("123"));
		Cliente cli4 = new Cliente(null, "LINUS TORVALDS", "424.192.537-52", "TORVALDS3@MAIL.COM", encoder.encode("123"));
		Cliente cli5 = new Cliente(null, "LINUS TORVALDS", "310.141.386-98", "TORVALDS4@MAIL.COM", encoder.encode("123"));
		
		
		Chamado c1 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1,tec2,tec3,tec4,tec5,tec6,tec7,tec8,tec9,tec10));
		clienteRepository.saveAll(Arrays.asList(cli1,cli2,cli3,cli4,cli5));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
}
