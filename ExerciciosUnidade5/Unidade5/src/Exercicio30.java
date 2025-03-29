import java.util.Scanner;
public class Exercicio30 {
    /*Implemente o problema da mochila. Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, 
    com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, 
    até que ela esteja cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

        os elementos a serem colocados na mochila;
        os elementos que entraram na mochila;
        os que ficaram fora da mochila;
        qual é a soma dos elementos que entraram na mochila;
        qual a soma dos elementos que não entraram na mochila.
        */

public Exercicio30() {
    Scanner entrada = new Scanner(System.in);
       String elementosDentroMochila = "";
       String elementosForaMochila = "";
       int somaMochila = 0;
       int somaForaMochila = 0;

       int N = 0;
       do {
       System.out.println("Digite o valor inicial(N): ");
       N = entrada.nextInt();
       } while (N > 0); 

       int K = 0;
       do {
       System.out.println("Digite o valor do decremento(K): ");
       K = entrada.nextInt();
       } while (K > 0);

       int M = 0;
       do {
       System.out.println("Digite o tamanho da mochila(M): ");
       M = entrada.nextInt();
       } while (M > 0);
       
       System.out.println("Os elementos a serem colocados na mochila é: ");
       while (N > 0) {
              System.out.println(N + " ");       
              
              if (M > 0) {
                elementosDentroMochila += N + ", ";
                somaMochila += N;
                M--;
              } else {
                elementosForaMochila += N + ", ";
                somaForaMochila += N;
              }
              N -= K;
       } 
       System.out.println();

       elementosDentroMochila = elementosDentroMochila.trim().substring(0, elementosDentroMochila.length()-2);
       System.out.println("Elementos na mochila: " + elementosDentroMochila);

       System.out.println("Elementos que ficaram fora da mochila: " + elementosForaMochila);
       elementosForaMochila = elementosForaMochila.trim().substring(0, elementosForaMochila.length()-2);

       System.out.println("A soma dos elementos que entraram na mochila: " + somaMochila);
       System.out.println("A soma dos elementos que não entraram na mochila é: " + somaForaMochila);

 entrada.close();
}
public static void main(String[] args) {
    new Exercicio30();
 }
}
