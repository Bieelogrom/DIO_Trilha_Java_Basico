package edu.gabriel.poo;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public Pessoa(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf.length() != 11) {
			throw new IllegalArgumentException("CPF inválido! "
					+ "\nQuantidade de digitos permitidos: 9"
					+ "+\nQuantidade de digitos inseridos: "+ cpf.length());
		}else{
			this.cpf = cpf;
			System.out.println("CPF alterado com sucesso!");
		}
	
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
