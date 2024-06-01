package edu.gabriel.Manzano;

import java.util.Scanner;

public class Manzano2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit: ");
        float temperaturaFahrenheit = sc.nextFloat();

        float temperaturaCelcius = ((temperaturaFahrenheit-32) * 5)/9;
        
        System.out.println("Temperatura em fahrenheit: "+ temperaturaFahrenheit +"\nTemperatura em celsius: "+ temperaturaCelcius);

        sc.close();
    }
}
