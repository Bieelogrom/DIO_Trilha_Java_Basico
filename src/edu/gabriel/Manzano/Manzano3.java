package edu.gabriel.Manzano;

import java.util.Scanner;

public class Manzano3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio da lata: ");
        Double raio = sc.nextDouble();

        System.out.println("Digite a altura da lata");
        Double altura = sc.nextDouble();

        double volume = 3.14 * (raio * raio) * altura;

        System.out.println("Volume da lata: "+ volume);

        sc.close();
    }
}
