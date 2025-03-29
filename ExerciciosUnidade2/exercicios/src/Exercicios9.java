import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios9 {

     /*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
     Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa. */

     public Exercicios9() {

          Scanner entrada = new Scanner(System.in);
          double valorDolar;

          System.out.println("Indique o valor em dolares a ser convertido em reais: ");
          valorDolar = entrada.nextDouble();

          double valorReal = (valorDolar*4.98);
          DecimalFormat formatador = new DecimalFormat("0.00");

          System.out.println("O valor em reais fica: R$" + formatador.format(valorReal));
          entrada.close();
        
     }

     public static void main(String[] args) {
          new Exercicios9();

     }    
}
