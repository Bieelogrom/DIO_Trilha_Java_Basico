package edu.gabriel.poo;

public abstract class Personagem {
	private int vida, dano, defesa;
	private String nome;
	
	public Personagem(int vida, int dano, int defesa, String nome) {
		super();
		this.vida = vida;
		this.dano = dano;
		this.defesa = defesa;
		this.nome = nome;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void Atacar();
	
	
}
