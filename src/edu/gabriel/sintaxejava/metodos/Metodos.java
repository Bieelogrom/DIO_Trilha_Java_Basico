package edu.gabriel.sintaxejava.metodos;

public class Metodos {
   
    public static void main(String[] args) {
        TelevisaoSmart TV = new TelevisaoSmart();
        TV.ligarTelevisao();
        TV.aumentarVolume();
        TV.anteriorCanal();
    

        if (TV.ligada) {
            System.out.println("Canal de TV: " + TV.canal);
            System.out.println("Volume da TV: " + TV.volume);
        }else{
            System.out.println("Televisão desligada!");
        }
        
    }

}
