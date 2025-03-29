
import java.util.Scanner;

public class Exercicios15 {
    /*Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
     X centena(s) Y desena(s) Z unidade(s)
     
             Dados: Ok
             
             Entradas: valor

             Processo: ler valor
                       valorCentena = (valor/100)
                       valorDezena = (valor/10)%10
                       valorUnidade = (valor)%10

             Saída: escrever valorCentena
                    escrever valorDezena
                    escreverUnidade 
             
             Teste: 1) valor: 345
                       valorCentena: 3
                       valorDezena: 4 
                       valorUnidade: 5

                    2) valor: 691
                       valorCentena: 6
                       valorDezena: 9 
                       valorUnidade: 1 
     */
     

     public Exercicios15() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro de até 3 digitos: ");
        int valor = entrada.nextInt();
         
        int valorCentena = (valor/100);
        valor = valor%100;
        int valorDezena = (valor/10);
        valor = valor%10;
        int valorUnidade = (valor);
        System.out.println("O valor da centena é: " + valorCentena);
        System.out.println("O valor da dezena é: " + valorDezena);
        System.out.println("O valor da unidade é: " + valorUnidade);
        entrada.close();
     }

     public static void main(String[] args) {
        new Exercicios15();
     }
    
}
