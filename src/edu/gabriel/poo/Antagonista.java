package edu.gabriel.poo;

public class Antagonista extends Personagem {

	public Antagonista(int vida, int dano, int defesa, String nome) {
		super(vida, dano, defesa, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar() {
		// TODO Auto-generated method stub
		System.out.println("Ataque maldoso!");
	}
	
}
