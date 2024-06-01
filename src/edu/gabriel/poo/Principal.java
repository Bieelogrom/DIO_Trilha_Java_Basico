package edu.gabriel.poo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		Pessoa p = new Pessoa("Jailson", "123456789", "Jardim Vit�ria II");
		

		
		while(continuar) {
			
			System.out.println("1. Troca de CPF"
					+ "\n2. Troca de nome"
					+ "\n3. Atualizar endere�o"
					+ "\n4. Verificar informa��es"
					+ "\n5. Encerrar");
	
			int opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1: 
				System.out.println("Digite seu novo CPF: ");
				p.setCpf(sc.next());
				break;
			case 2: 
				System.out.println("Digite seu novo nome: ");
				p.setNome(sc.next());
				break;
			case 3: 
				System.out.println("Digite o endere�o: ");
				p.setEndereco(sc.next());
				break;
			case 4: 
				System.out.println("Seu nome: "+ p.getNome()+""
						+ "\nSeu cpf: "+ p.getCpf());
				break;
			case 5: 
				System.out.println("Encerrando...");
				continuar = false;
				break;
			 default:
				 System.out.println("Op��o inv�lida!");
				 
				 
			}
		}

		
		sc.close();
	}

}
