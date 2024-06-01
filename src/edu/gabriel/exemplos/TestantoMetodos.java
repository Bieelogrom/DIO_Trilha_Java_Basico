package edu.gabriel.exemplos;

public class TestantoMetodos {
	private int valor;

	public TestantoMetodos(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int adicionarUm(int val) {
		return this.valor += val;
	}
}
