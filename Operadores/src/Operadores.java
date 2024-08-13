public class Operadores {
    public static void main(String[] args) throws Exception {

        String concatenacao = "";
        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);

        concatenacaoo(concatenacao);

        }

        public static void concatenacaoo(String concat){
             System.out.println("Resultados das concatenações: " + concat);
     }

}
