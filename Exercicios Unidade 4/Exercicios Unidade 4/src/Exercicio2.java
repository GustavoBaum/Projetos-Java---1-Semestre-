import java.util.Scanner;
public class Exercicio2 {
    /*Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
      Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

      public Exercicio2() {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Entre um valor inteiro maior que 0: ");
            float valor = entrada.nextFloat();

            if (valor % 2 == 0) {
                System.out.println("Numero é par");
            } else {
                System.out.println("Numero é impar");
            }
            entrada.close();
      }
      public static void main(String[] args) {
        new Exercicio2();
      }
}
