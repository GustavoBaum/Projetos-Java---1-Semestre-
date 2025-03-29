import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios11 {

    /*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159).
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B. */

    public Exercicios11() {
        
           Scanner entrada = new Scanner(System.in);

           System.out.println("Digite o valor de A: ");
           double valorA = entrada.nextDouble();
           System.out.println("Digite o valor de B: ");
           double valorB = entrada.nextDouble();
           System.out.println("Digite o valor de C: ");
           double valorC = entrada.nextDouble();
           DecimalFormat df = new DecimalFormat("0.0"); 

           double areaTriangulo = (valorA*valorC) / 2;
           System.out.println("A área de um triagulo retangulo que tem A por base e C por altura é: " + df.format(areaTriangulo));
           double PI = Math.PI;
           double areaCirculo = Math.pow(valorC,2)*PI;
           System.out.println("A área do circulo de raio C é: " + df.format(areaCirculo));
           double areaTrapezio1 = (valorA + valorB);
           double areaTrapezio2 = (areaTrapezio1*valorC) / 2;
           System.out.println("A área do trapezio que tem A e B por bases e C por altura é: " + df.format(areaTrapezio2));
           double areaQuadrado = Math.pow(valorB, 2);
           System.out.println("A área de um quadrado que tem B como lado é: " + df.format(areaQuadrado));
           double areaRetangulo = (valorA*valorB);
           System.out.println("A área de um retangulo que tem A e B como lados é: " + df.format(areaRetangulo));
           entrada.close();
    }
    
    public static void main(String[] args) {
        new Exercicios11();
    }
}
