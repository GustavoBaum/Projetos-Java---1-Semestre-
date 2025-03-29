
import java.util.Scanner;

public class Exercicio5 {
    /*Dada uma pergunta, “a cor é azul?”, 
    faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.*/

    public Exercicio5() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("A cor é azul? ");
        boolean resposta = entrada.nextBoolean();

        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio5();
    }
}
