package edu.gabriel.Manzano;

import java.util.Scanner;

public class Manzano5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação: ");
		double valorPrestacao = sc.nextDouble();
		
		System.out.println("Digite o valor da taxa: ");
		double valorTaxa = sc.nextDouble();
		
		System.out.println("Digite o tempo (a.m): ");
		double tempo = sc.nextDouble();
		
		double prestacao = valorPrestacao + (valorPrestacao * valorTaxa/100) * tempo;
		
		System.out.println("Valor da prestação em atraso : "+ prestacao);
	}
}
