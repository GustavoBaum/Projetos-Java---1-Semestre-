import java.util.Scanner;

public class Exercicios14 {
    /*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
    As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
    A seguir mostre o valor lido e a relação de notas necessárias.*/

    public Exercicios14() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro qualquer: ");
        int valor = entrada.nextInt();

        int notas100 = valor / 100;
        valor -= notas100 * 100;
        int notas50 = valor / 50;
        valor -= notas50 * 50;
        int notas20 = valor / 20;
        valor -= notas20 * 20;
        int notas10 = valor / 10;
        valor -= notas10 * 10;
        int notas5 = valor / 5;
        valor -= notas5 * 5;
        int notas2 = valor / 2;
        valor -= notas2 * 2; 
        int notas1 = valor / 1;
        valor -= notas1 * 1;

        System.out.println(notas100 + " notas de R$100,00");
        System.out.println(notas50 + " notas de R$50,00");
        System.out.println(notas20 + " notas de R$20,00");
        System.out.println(notas10 + " notas de R$10,00");
        System.out.println(notas5 + " notas de R$5,00");
        System.out.println(notas2 + " notas de R$2,00");
        System.out.println(notas1 + " notas de R$1,00");
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios14();
    }
    
}
