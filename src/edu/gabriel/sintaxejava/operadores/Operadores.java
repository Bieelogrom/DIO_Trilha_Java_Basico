package edu.gabriel.sintaxejava.operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5;


        numero = -numero;
        System.out.println(-numero);


        numero--;
        System.out.println(numero);

        boolean fezAtividade = false;
        String bad = "Bambu Africano Dobrado";
        
        String resposta = (fezAtividade) ? "Camisa 10" : bad;

        System.out.println(resposta);

        int codPrimario = 44;
        int codPrimarioT = 99;
        
        if(codPrimario > 22 || codPrimarioT <= 55){
            System.out.println(codPrimario + codPrimarioT);
        }
    }
}   
