package edu.gabriel.poo;

public enum EstadosBrasileiros {
	SAO_PAULO ("SP", "São Paulo"),
	RIO_DE_JANEIRO ("RJ", "Rio de Janeiro")
	;
	
	private EstadosBrasileiros(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	private String nome;
	private String sigla; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla.toUpperCase();
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
}
