import java.util.Scanner;
public class Exercicios5 {

    //Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    
    public Exercicios5() {
    
        Scanner teclado = new Scanner(System.in);
          int valorA;
          int valorB;
          int valorC;
          int valorD;
        
          System.out.println("Indique o valor de A: ");
          valorA = teclado.nextInt();
          System.out.println("Indique o valor de B: ");
          valorB = teclado.nextInt();
          System.out.println("Indique o valor de C: ");
          valorC = teclado.nextInt();
          System.out.println("Indique o valor de D: ");
          valorD = teclado.nextInt();

          int calculo = (valorA*valorB) - (valorC*valorD);
          
          System.out.println("O valor da expressão acima é: " + calculo);
          teclado.close();

    }

    public static void main(String[] args) {
          new Exercicios5();


    }
    
}

