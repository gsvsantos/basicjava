public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        int idade = 25;
        int anoFeito = 2012;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo, exemplo abaixo
		String cepzero = "021070333"; // 
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, exemplo abaixo
		String cpfzero = "098765432109L"; 
		float pi = 3.14F;
        int salarioMinimo = 1900;
		double salario = 1275.33;
        final String DIA = "02";

        System.err.println("idade: " + idade);
        System.out.println("anoFeito: " + anoFeito);
        System.err.println("ano: " +  ano);
        System.err.println("cep: " +  cep);
        System.out.println("cepzero: " +  cepzero);
        System.err.println("cpf: " +  cpf);
        System.err.println("cpfzero: " +  cpfzero);
        System.out.println("pi: " +  pi);
        System.err.println("salarioMinimo: R$" +  salarioMinimo);
        System.err.println("salario: R$" +  salario);
        System.out.println("dia: " + DIA);
    
    }
}
