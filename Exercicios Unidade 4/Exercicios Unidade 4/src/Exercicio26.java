import java.util.Scanner;

public class Exercicio26 {
    /*Dado um caractere indicando uma opção, escreva um algoritmo para:

        se opção = ‘T’: calcular a área de um triângulo de base b e altura h
        se opção = ‘Q’: calcular a área de um quadrado de lado l
        se opção = ‘R’: calcular a área de um retângulo de base b e altura h
        se opção = ‘C’: calcular a área de um círculo de raio r*/

    public Exercicio26() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Determine valores para: b , h , l e r ");
        double b = entrada.nextDouble();
        double h = entrada.nextDouble();
        double l = entrada.nextDouble();
        double r = entrada.nextDouble();
        String caractere = entrada.next();
        caractere = caractere.toUpperCase();
        char opção = caractere.charAt(0);


        switch (opção) {
            case 'T': double areaTriangulo = (b * h)/2;
                      System.out.println("T  = " + areaTriangulo);
            break;

            case 'Q': double areaQuadrado = l*l;
                      System.out.println("Q = " + areaQuadrado);
            break;
            
            case 'R': double areaRetangulo = b * h;
                      System.out.println("R = " + areaRetangulo);
            break;

            case'C': double areaCirculo = (r*r)*3.1415;
                     System.out.println("R = " + areaCirculo);
            break;
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio26();
    }
}
