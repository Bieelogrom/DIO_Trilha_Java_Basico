package edu.gabriel.Manzano;

import java.util.Scanner;

public class Manzano1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        int temperaturaCelcius = sc.nextInt();

        int temperaturaFahrenheit = (9 * temperaturaCelcius + 160) / 5;
        
        System.out.println("Temperatura em Celcius: "+ temperaturaCelcius+"\n Temperatura em Fahrenheit: "+ temperaturaFahrenheit);

        sc.close();
    }
}
