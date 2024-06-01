package edu.gabriel.exemplos;

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        
        
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Resultado: " + (valor1 - valor2));
        sc.close();
    }
}
