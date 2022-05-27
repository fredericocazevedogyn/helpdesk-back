package br.com.frederico.helpdesk.domain;

import java.time.LocalDate;

import br.com.frederico.helpdesk.domain.enuns.Prioridade;
import br.com.frederico.helpdesk.domain.enuns.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chamado {

	private Integer id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;
	private Prioridade prioridade;
	private Status status;
	private String titulo;
	private String observação;
	
	private Tecnico tecnico;
	private Cliente cliente;
	
}
