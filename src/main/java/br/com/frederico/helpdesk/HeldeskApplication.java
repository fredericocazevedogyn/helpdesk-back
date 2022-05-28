package br.com.frederico.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.frederico.helpdesk.domain.Chamado;
import br.com.frederico.helpdesk.domain.Cliente;
import br.com.frederico.helpdesk.domain.Tecnico;
import br.com.frederico.helpdesk.domain.enuns.Perfil;
import br.com.frederico.helpdesk.domain.enuns.Prioridade;
import br.com.frederico.helpdesk.domain.enuns.Status;
import br.com.frederico.helpdesk.repository.ChamadoRepository;
import br.com.frederico.helpdesk.repository.ClienteRepository;
import br.com.frederico.helpdesk.repository.TecnicoRepository;

@SpringBootApplication
public class HeldeskApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HeldeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "VALDIR CESAR", "13838243803", "VALDIR@MAIL.COM", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "LINUS TORVALDS", "80527954780", "TORVALDS@MAIL.COM", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
