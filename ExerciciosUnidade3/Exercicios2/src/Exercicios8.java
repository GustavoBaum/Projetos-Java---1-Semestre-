import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios8 {
    /*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
    
               Dados: Ok

               Entrada: valorDolar

               Processo: ler valorDolar
                         valorReais = (valorDolar*4.97).

               Saída: escrever valorReais
               
               Teste: 1) valorDolar: 150
                         valorReias: 745,50
                       
                      2) valorDolar: 700
                         valorReais: 3479,00   
    */
    
    public Exercicios8() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de doláres que deseja trocar: $");
        double valorDolar = entrada.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        
        double valorReais = (valorDolar*4.97);
        System.out.println("A quantidade de denheiro, em reais, que possuí é: R$" + df.format(valorReais));

        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios8();
    }
}
