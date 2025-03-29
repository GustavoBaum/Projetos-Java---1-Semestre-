import java.util.Scanner;

public class Exercicio9 {
    /*Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.*/
    public Exercicio9() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int valor1 = entrada.nextInt();
        System.out.print("Informe um segundo numero inteiro: ");
        int valor2 = entrada.nextInt();

        if (valor1 % valor2 == 0) {
            System.out.println("Os numeros são multiplos.");
        } else if (valor2 % valor1 == 0) {
            System.out.println("Os numeros são multiplos.");
        } else if (valor1 % valor2 != 0) {
            System.out.println("Os numeros não são multiplos.");
        } else if (valor2 % valor1 != 0) {
            System.out.println("Os numeros não são multiplos.");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio9();
    }
}
