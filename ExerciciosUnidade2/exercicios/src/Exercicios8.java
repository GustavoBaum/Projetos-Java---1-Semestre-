import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios8 {

    /*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, 
    o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago. */

    public Exercicios8() {

        Scanner entrada = new Scanner(System.in);

        int codigoPeça1;
        int numeroPeça1;
        double valorPeça1;
        int codigoPeça2;
        int numeroPeça2;
        double valorPeça2;

        System.out.println("Indique o codigo da peça 1: ");
        codigoPeça1 = entrada.nextInt();
        System.out.println("Indique o numero de peças 1: ");
        numeroPeça1 = entrada.nextInt();
        System.out.println("Indique o valor unitario de cada peça 1: ");
        valorPeça1 = entrada.nextDouble();

        System.out.println("Indique o codigo da peça 2: ");
        codigoPeça2 = entrada.nextInt();
        System.out.println("Indique o numero de peças 2: ");
        numeroPeça2 = entrada.nextInt();
        System.out.println("Indique o valor unitario de cada peça 2: ");
        valorPeça2 = entrada.nextDouble();

        double valor = (numeroPeça1*valorPeça1) + (numeroPeça2*valorPeça2);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("O valor total da sua compra é R$" + formatador.format(valor));
        entrada.close();

    }

    public static void main(String[] args) {

        new Exercicios8();
    }


    
}
