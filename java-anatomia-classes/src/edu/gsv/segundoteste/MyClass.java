package edu.gsv.segundoteste;
public class MyClass {

    public static void main(String[] args) {

        String primeiroNome = "Gustavo";
        String segundoNome = "Santos";

        //String nomeCompleto = "Gustavo Santos";
        String nomeCompleto = primeiroNome + " a " + segundoNome;

        System.out.println("Seu nome ée: " + nomeCompleto);

        nome(nomeCompleto);

        //nome(primeiroNome + " " + segundoNome);
        //nome("Gustavo Santos");

    }
        public static void nome(String nomeCompleto){
            System.out.println("Seu nome é: " + nomeCompleto);
        }

}
