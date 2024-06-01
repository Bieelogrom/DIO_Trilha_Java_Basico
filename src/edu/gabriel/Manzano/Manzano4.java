package edu.gabriel.Manzano;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Manzano4
 */
public class Manzano4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite o tempo gasto: ");
            double tempoGasto = sc.nextDouble();

            System.out.println("Digite a velocidade média: ");
            double velocidadeMedia = sc.nextDouble();

            double distancia = tempoGasto * velocidadeMedia;
            double litrosUsados = distancia/12; 

            System.out.println("Velocidade média: "+ velocidadeMedia+"\nTempo gasto: "+ tempoGasto+"\nDistância percorrida: "+ distancia+"\nQuantidade de litros: "+ litrosUsados);
        }catch(InputMismatchException e){
            System.out.println("Os campos precisam ser preenchidos com valores numéricos!");
        }
    }
}