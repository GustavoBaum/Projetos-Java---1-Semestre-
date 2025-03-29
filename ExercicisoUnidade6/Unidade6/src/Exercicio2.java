import java.util.Scanner;
public class Exercicio2 {
    /*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
    Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, 
    outro para calcular a média e outro para informar os valores maiores que a média.*/
    public Exercicio2() {
       int[] vetor = new int[12];
       
       Scanner entrada = new Scanner(System.in);
       
       ler(vetor);

       int mediaVetores = media(vetor);

       valoresMaiores(mediaVetores, vetor);

       entrada.close();
    }

    public void ler(int[] vetor) {
        Scanner entrada = new Scanner(System.in);
       for (int i = 0; i < vetor.length; i++) {
       System.out.println("Digite 12 valores para vetor [" + (i + 1) + "]: ");
       vetor[i] = entrada.nextInt();
       }
       entrada.close();
    }

    public int media(int[] vetor) {
        int media = 0;
        for (int i = 0; i < vetor.length; i++) {
         media = vetor[i] + vetor[i];   
        }
         return media;
    }

    public void valoresMaiores(int media, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i] + " é maior que a media total dos valores.");
            } else {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        new Exercicio2();
    }
}

