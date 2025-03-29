import java.util.Scanner;

public class Exercicio3 {
    /*Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.*/
    public Exercicio3() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero inteiro qualquer: ");
        int valor1 = entrada.nextInt();
        System.out.print("Digite um segundo numero inteiro qualquer: ");
        int valor2 = entrada.nextInt();
        
        if (valor1 > valor2) {
            System.out.println("O primeiro numero é maior que o segundo.");
        } else {
            System.out.println("O segundo numero é maior que o primeiro.");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio3();
    }
}
