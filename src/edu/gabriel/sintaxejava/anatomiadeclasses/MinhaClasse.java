package edu.gabriel.sintaxejava.anatomiadeclasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Gabriel";
        String segundoNome = "Ferreira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado : " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
