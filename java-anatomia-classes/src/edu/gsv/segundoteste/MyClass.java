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
        //...           tipo nomenclatura do método(parâmetros do método){}
        //...           String letras(String alfabeto){}
        //public static void nome(String nomeCompleto){

        public static void nome(String nomeCompleto){
            System.out.println("Seu nome é: " + nomeCompleto);
        }

}
