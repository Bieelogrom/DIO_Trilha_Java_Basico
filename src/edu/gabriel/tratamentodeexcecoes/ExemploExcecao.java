package edu.gabriel.tratamentodeexcecoes;

import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a");
        // valor = NumberFormat.getInstance().parse("a");


        System.out.println(valor);
    }
}
