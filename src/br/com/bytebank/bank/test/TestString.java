package br.com.bytebank.bank.test;


public class TestString {
    public static void main(String[] args) {
        String nome = "Alura";//objetc literal

        String nomeAlterado = nome.replace("a", "k");

      String sub = nome.substring(1);

        System.out.println(nome);
        System.out.println(nomeAlterado);
        System.out.println(sub);
        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }


    }
}
