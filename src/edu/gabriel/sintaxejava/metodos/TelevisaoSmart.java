package edu.gabriel.sintaxejava.metodos;

public class TelevisaoSmart {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void desligarTelevisao(){
        ligada = false;
    }

    public void ligarTelevisao(){
        ligada = true;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para "+ volume);
    }

    public void proximoCanal (){
        canal++;
        System.out.println("Mudando para canal "+ canal);
    }

    public void anteriorCanal (){
        canal--;
        System.out.println("Mudando para canal "+ canal);
    }

    public void mudarCanal (int canalDesejado){
        canal = canalDesejado;
    }
}   
