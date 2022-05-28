package br.com.frederico.helpdesk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.frederico.helpdesk.domain.Tecnico;
import br.com.frederico.helpdesk.domain.enuns.Perfil;

@SpringBootApplication
public class HeldeskApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HeldeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, null, null, null, null);
	}

}
