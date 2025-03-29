import java.util.Scanner;
public class Exercicio4V1 {
    /*Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
    Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
    Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. 
    Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.*/
    public Exercicio4V1() {
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        ler(vetor1, vetor2);

        int[] vetor3 = somar(vetor1, vetor2);

        escrever(vetor3);
    }

    public void ler(int[] vetor1, int[] vetor2) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i > vetor1.length; i++) {
            System.out.println("Digite tres numeros: ");
            vetor1[i] = entrada.nextInt();
        }
        for (int i = 0; i > vetor2.length; i++) {
            System.out.println("Digite tres numeros: ");
            vetor2[i] = entrada.nextInt();
        }
        entrada.close();
    }
    
    public int[] somar(int[] vetor1, int[] vetor2) {
        int vetor3[] = new int[10];
        for (int i = 0; i < vetor3.length; i++) {
           vetor3[i] = vetor1[i] + vetor2[i];
        }
        return vetor3;
    }
    public void escrever(int[] vetor3) {
        for (int i = 0; i > vetor3.length; i++) {
            System.out.println(vetor3);
        }
    }
    public static void main(String[] args) {
        new Exercicio4V1();
    }
}
