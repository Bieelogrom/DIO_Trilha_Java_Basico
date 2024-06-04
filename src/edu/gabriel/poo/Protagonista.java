package edu.gabriel.poo;

public class Protagonista extends Personagem {

	public Protagonista(int vida, int dano, int defesa, String nome) {
		super(vida, dano, defesa, nome);
	}

	@Override
	public void Atacar() {
		// TODO Auto-generated method stub
		System.out.println("Ataque heróico.");
	}
	
}
