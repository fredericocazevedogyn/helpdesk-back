package br.com.frederico.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "cliente_id")
	private List<Chamado> chamados = new ArrayList<>();

	
}
