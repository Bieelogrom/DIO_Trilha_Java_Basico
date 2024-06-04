package edu.gabriel.poo;

public class CampoDeBatalha {
	public static void main(String[] args) {
		Protagonista prota = new Protagonista(10, 8, 6, "Gabriel");
		Antagonista anta = new Antagonista(10, 7, 7, "Jailson");
		
		
		prota.Atacar();
		anta.Atacar();
		
		
	}
}
