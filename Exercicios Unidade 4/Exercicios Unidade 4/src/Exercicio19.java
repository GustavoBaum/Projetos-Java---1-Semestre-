import java.util.Scanner;

public class Exercicio19 {
    /*Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

       0, se os dois valores forem zero
       1, se os dois valores forem positivos
       2, se x for positivo e y, negativo
       3, se os dois valores forem negativos
       4, se x for negativo e y, positivo*/

    public Exercicio19() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("x = ");
        int x = entrada.nextInt();
        System.out.print("y = ");
        int y = entrada.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 4");
        } 
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio19();
    }
}