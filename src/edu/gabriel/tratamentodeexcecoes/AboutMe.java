package edu.gabriel.tratamentodeexcecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        

        try{
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
    
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();
    
            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();
    
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
    
            System.out.println("Me chamo "+ nome + sobrenome);
            System.out.println("Tenho "+ idade);
            System.out.println("Minha altura é "+ altura);  

            sc.close();
        }catch(InputMismatchException e){
            System.out.println("Os campos precisam ser preenchidos corretamente!");
        }   

    
    }
}
