package edu.gabriel.poo.aulainterfaces;

import edu.gabriel.poo.aulainterfaces.copiadora.Copiadora;
import edu.gabriel.poo.aulainterfaces.digitalizadora.Digitalizadora;
import edu.gabriel.poo.aulainterfaces.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {

	@Override
	public void Imprimir() {
		System.out.println("Copiando via equipamento multifuncional");
		
	}

	@Override
	public void Digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional");
		
	}

	@Override
	public void Copiar() {
		System.out.println("Copiando via equipamento multifuncional");
		
	}

}
