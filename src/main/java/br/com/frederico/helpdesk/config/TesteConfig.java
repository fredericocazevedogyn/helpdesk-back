package br.com.frederico.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.frederico.helpdesk.service.DbService;

@Configuration
@Profile("teste")
public class TesteConfig {

	@Autowired
	private DbService dbService;
	
	@Bean
	public void instanciaDb() {
		this.dbService.instanciaDb();
	}
	
}
