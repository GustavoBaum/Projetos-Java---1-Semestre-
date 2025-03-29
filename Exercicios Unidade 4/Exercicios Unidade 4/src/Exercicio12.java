import java.util.Scanner;

public class Exercicio12 {
    /*Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo, 
    descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo. 
    Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". 
    Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

      o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
      um triângulo equilátero tem três lados iguais
      um triângulo isóscele tem dois lados iguais e um diferente
      um triângulo escaleno tem três lados diferentes*/

      public Exercicio12() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double lado1 = entrada.nextDouble();
        System.out.print("Digite um valor: ");
        double lado2 = entrada.nextDouble();
        System.out.print("Digite um valor: ");
        double lado3 = entrada.nextDouble();

        if (lado1 < lado2+lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2) {
            System.out.println("O triangulo com estes comprimentos é possível");
            if (lado1 == lado2 && lado2 == lado3) {
              System.out.println("Triangulo Equilátero");
          } else if (lado1 == lado2 && lado2 != lado3) {
              System.out.println("Triangulo Isósceles");
          } else if (lado1 != lado2 && lado2 != lado3) {
              System.out.println("Triangulo Escaleno");
        } else  {
          System.out.println("Os comprimentos dados não formam um triangulo");
         } 
        }
        entrada.close();
      }
      public static void main(String[] args) {
        new Exercicio12();
      }
}
