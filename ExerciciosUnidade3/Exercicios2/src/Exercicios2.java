import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicios2 {

    /*Uma loja de calçados está concedendo 12% de desconto nos produtos. 
    Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto.
    O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
    
    O valor do desconto é de R$ xxx,xx
    O preço do par de sapatos com desconto é R$ xxx,xx

           Dados: Ok

           Entrada: valorPar.

           Processo: ler valorPar

                     valorDesconto = parSapatos*0.12
                     valorFinal = parSapatos - valorDesconto

           Saída: escrever: valorDesconto
                  escrever: valorFinal.

           Teste: 1) valorPar = 120
                     valorDesconto = 14,40
                     valorFinal = 105,60

                  2) valorPar = 249,00
                     valorDesconto = 29,88
                     valorFinal = 219,12
     */

     public Exercicios2() {

       Scanner entrada = new Scanner(System.in);

       System.out.println("Indique o valor do produto o qual você deseja comprar: ");
       double parSapatos = entrada.nextDouble();
       double valorDesconto = (parSapatos*0.12);
       double valorFinal = (parSapatos - valorDesconto);
       DecimalFormat df = new DecimalFormat("0.00");

       System.out.println("O valor do desconto é: R$" + df.format(valorDesconto));
       System.out.println("O valor total da compra fica: R$" + df.format(valorFinal));
       entrada.close();

     }

     public static void main(String[] args) {
        new Exercicios2();
     }
}
