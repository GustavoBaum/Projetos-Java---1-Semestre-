import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios6 {
    /*Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
    Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
 
               Dados: Ok

               Entrada: peso.

               Processo: ler peso
                         valor = (peso*25).

               Saída: escrever: valor
               
               Teste: 1) peso: 2.5
                         valor: 62,50

                      2) peso: 1,24   
                         valor: 31,00
    */
    
    public Exercicios6() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o peso, em kilogramas, do seu prato: ");
        double peso = entrada.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        double valor = (peso*25);
        System.out.println("O valor do seu prato é: R$" + df.format(valor));
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios6();
    }
}
