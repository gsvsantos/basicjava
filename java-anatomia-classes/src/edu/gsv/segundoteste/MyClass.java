package edu.gsv.segundoteste;
public class MyClass {

    public static void main(String[] args) {
        String primeiroNome = "Gustavo";
        String segundoNome = "Santos";

        System.out.print("Resultado do 1° Método: " + primeiroNome + " " + segundoNome);

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

        }

        public static String nomeCompleto (String primeiroNome, String segundoNome) {
            return "\nResultado do 2° método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
