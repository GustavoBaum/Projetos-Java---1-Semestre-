import java.util.Scanner;

public class Exercicios10 {
    /*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
      
           Dados: Ok
           
           Entrada: cateto1 ; cateto2.

           Processo: ler cateto1
                     ler cateto2
                     calculo1 = Math.pow(cateto1,2) + Math.pow(cateto2, 2)
                     calculo2 = Math.sqrt(calculo1)
                
           Saída: escrever calculo2
           
           Teste: 1) cateto1: 4
                     cateto2: 3
                     hipotenusa: 5

                  2) cateto1: 12
                     cateto2: 5   
                     hipotenusa: 13   
    */ 

    public Exercicios10() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do cateto1: ");
        float cateto1 = entrada.nextFloat();
        System.out.print("Digite o valor do cateto2: ");
        float cateto2 = entrada.nextFloat();
         
        double calculo1 = Math.pow(cateto1,2) + Math.pow(cateto2, 2);
        double calculo2 = Math.sqrt(calculo1);
        System.out.println("O valor da hipotenusa é: " + calculo2);
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios10();
    }
    
}
