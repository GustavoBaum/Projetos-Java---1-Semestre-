import java.util.Scanner;
public class Exercicio3 {
    /*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
    Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. 
    Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.*/
    public Exercicio3() {
        double vetor[] = new double[12];
        Scanner entrada = new Scanner(System.in);

        ler(entrada, vetor);

        ajustarValores(vetor);

        impressao(vetor);

        entrada.close();
    }

    public void ler(Scanner entrada, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite valores para vetor [" + i + "]: ");
            vetor[i] = entrada.nextInt();
        }
    }

    public double[] ajustarValores(double[] vetor) {
        //Utilizando metodo FOR com IF:
        /*for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] += (vetor[i] * 0.02);
            } else {
                vetor[i] += (vetor[i] * 0.05);
        }
      }*/

      //Utilizando dois metodos FOR:
      for (int i = 0; i < vetor.length; i += 2) {
           vetor[i] += (vetor[i] * 0.02);
      }

      for (int i = 1; i < vetor.length; i += 2) {
           vetor[i] += (vetor[i] * 0.05);
      }
      return vetor;
    }

    public void impressao(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
    }
    public static void main(String[] args) {
        new Exercicio3();
    }
 }


