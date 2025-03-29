import java.util.Scanner;
public class Exercicio8 {
    /*Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. 
    Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. 
    Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor (veja exemplo a seguir).
    */
    public Exercicio8() {
    Scanner entrada = new Scanner(System.in);
    int v = 0;
    do {
    System.out.println("Digite o tamanho do vetor: ");
    v = entrada.nextInt();
    } while (v > 20);
    
    float[] vetor = new float[v];

    imprimirValores(vetor);

    popularVetor(entrada, vetor);

    entrada.close();
    }

    public void popularVetor(Scanner entrada, float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Popule o vetor[" + i + "]: ");
            vetor[i] = entrada.nextFloat();
          }
    }

    public void imprimirValores(float[] vetor) {
        float[] numerosDiferentes = new float[vetor.length];
        int tamanho = 0;
        for (int i = 0; i < vetor.length; i++) {
            //popula os elementos no vetor2;
            boolean achou = false;
            for (int a = 0; a < tamanho; a++) {
                if (vetor[i] == numerosDiferentes[a]) {
                    achou = true;
                }
            }
            if (!achou) {
                numerosDiferentes[tamanho] = vetor[i];
                tamanho++;
            }
        }

        for (int i = 0; i < tamanho; i++) {
            int quantidadeRepeticao = 0;
            for (int b = 0; b < vetor.length; b++) {
                if(numerosDiferentes[i] == vetor[b]) {
                   quantidadeRepeticao++;
                }
            }
            System.out.println(numerosDiferentes[i] + " | " + quantidadeRepeticao);
        }
    }
    public static void main(String[] args) {
        new Exercicio8();
    }
}
