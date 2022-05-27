package br.com.frederico.helpdesk.domain.enuns;


public enum Prioridade {
	
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMANTO"), ENCERRADO(0, "ENCERRADO");
	
	private Integer codigo;
	private String descricao;
	
	private Prioridade(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static Prioridade toEnum (Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (Prioridade x : Prioridade.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status Inválido");
		
	}
	
}
