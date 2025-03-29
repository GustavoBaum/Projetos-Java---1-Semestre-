import java.util.Scanner;

public class Exercicio4
 {
    /*Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.*/

    public Exercicio4() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero de ponto flutuante maior que 0: ");
        double valor = entrada.nextDouble();
        
        //Forma 1
        if (valor % 1 != 0){
                 System.out.println("O numero informado possui casas decimais.");
        } else {
                 System.out.println("O numero informado não possui casas decimais");
        }
        
        //Forma 2
        int numeroInteiro = ((int)valor);
        if (valor == numeroInteiro) {
                 System.out.println("O numero informado não tem casas decimais");
        } else {
                 System.out.println("O numero informado possui casas decimais");
        }   
        
        //Forma 3 
        //converte um numero para String
        String numeroString = String.valueOf(valor);
        System.out.println("Numero convertido: " + numeroString);
        int indiceInicial = numeroString.indexOf("."); //retorna o indice do caractere
        int indiceFinal = numeroString.length(); //tamanho do String
        String decimal = numeroString.substring(indiceInicial+1, indiceFinal);
        System.out.println("Parte decimal: " + decimal);

       int parteDecimal = Integer.parseInt(decimal);
       if (parteDecimal == 0 ) {
                   System.out.println("Não tem casas decimais");
       } else {
                   System.out.println("Tem casas decimais");
       }

       if (decimal.trim().equals("0")) {
                   System.out.println("Não tem casas decimais");
       } else {
                   System.out.println("Tem casas decimais");
       }

        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio4();
    }
}
