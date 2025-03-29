import java.util.Scanner;

public class Exercicio6 {
    /*Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.*/
    public Exercicio6() {
        Scanner entrada = new Scanner(System.in); 
        double media = 0;
        double numero = 0;
        System.out.println("Digite a quantidade de pessoas: ");
        int quantidade = entrada.nextInt();
        for (int altura = 0; altura < quantidade; altura++) {
             System.out.println("Digite a altura das pessoas, em metros: ");
             numero = entrada.nextDouble();
             media += numero;
        }
        System.out.println("Media da altura: " + media/quantidade + "m");
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio6();
    }
}
