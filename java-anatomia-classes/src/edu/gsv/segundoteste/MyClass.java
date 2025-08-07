package edu.gsv.segundoteste;
public class MyClass {

    public static void main(String[] args) {

        String primeiroNome = "Gustavo";
        String segundoNome = "Santos";

        // Forma tradicional com concatenação
        String nomeCompleto = primeiroNome + " " + segundoNome;
        nome(nomeCompleto);

        // Forma moderna e legível com String.format
        nome(String.format("%s %s", primeiroNome, segundoNome));

        // Forma fluente (Java 15+)
        nome("%s %s".formatted(primeiroNome, segundoNome));

    }

        public static void nome(String nomeCompleto){
            System.out.println("Seu nome é: " + nomeCompleto);
        }
}
