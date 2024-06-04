package edu.gabriel.poo;

public class RedeSocial {
	public String EnviarMensagens() {
		SalvarHistorico();
		return "Enviando fake-news...";
	}
	
	private String SalvarHistorico() {
		return "Salvando histórico de mensagens";
	}
}
