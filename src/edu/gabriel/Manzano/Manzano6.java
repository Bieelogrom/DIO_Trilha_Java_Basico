package edu.gabriel.Manzano;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manzano6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro valor: ");
			int a = sc.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			int b = sc.nextInt();
			
			System.out.println("A: "+ a+"\nB: "+ b);
			
			int c = a;
			a = b;
			b = c;
			
			System.out.println("A: "+ a+"\nB: "+ b);
		}catch(InputMismatchException e) {
			System.out.println("Os valores precisam ser numéricos!");
		}
		
		sc.close();
	}
}
