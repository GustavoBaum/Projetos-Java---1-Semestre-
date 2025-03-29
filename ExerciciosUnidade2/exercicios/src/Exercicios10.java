import java.util.Scanner;

public class Exercicios10 {
    
    /*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos. */

    public Exercicios10() {
        Scanner entrada =  new Scanner(System.in);
        int valorInteiro;


        System.out.println("Indique o valor em segundos do x evento da fábrica: ");
        valorInteiro = entrada.nextInt();


        double valorHoras = (valorInteiro/3600);
        double valorMinutos = (valorInteiro/60);


        System.out.println("O valor em horas do evento mencionado acima é: " + valorHoras + ". O valor em minutos do evento mencionado acima é: " + valorMinutos + ". O valor em seugndos do evento mencionado acima é: " + valorInteiro);
        entrada.close();

    }

    public static void main(String[] args) {
        new Exercicios10();
    }
}
