package edu.gabriel.poo;

public class Carro {
	
	public void ligar() {
		System.out.println("Carro ligado!");
		rodarMotor();
	}

	private void rodarMotor() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("Falta: "+ i);
		}
	}
}
