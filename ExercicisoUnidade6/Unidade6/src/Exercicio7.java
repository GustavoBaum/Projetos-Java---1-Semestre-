import java.util.Scanner;
public class Exercicio7 {
    /*Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. 
    Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, 
    e se o valor já existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, 
    o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. 
    Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

       Vetor origem: [0][4][2][6][3]
       Vetor ordenado: [0][2][3][4][6]

       Crie um método para inserir os valores no vetor, outro para ordenar o vetor e outro para informar o vetor resultante*/
    public Exercicio7() {
       Scanner entrada = new Scanner(System.in);

       System.out.println("Digite o valor de N(valor limite = 20): ");
       int N = entrada.nextInt();
       if (N > 20) {
         System.out.println("O valor informado excede o valor limite, por favor, tente novamente.");
       }

       int vetor[] = new int[N];
       int valor = 0;
       do {
        System.out.print("Popule o vetor: ");
        int numero = entrada.nextInt();
        if (popularVetor(vetor, valor, numero)) {
            valor++;
        }
       } while (valor < N);

       ordenarVetor(vetor);

       imprimirResultado(vetor);

       entrada.close();
    }

    private static boolean popularVetor(int[] vetor, int valor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
          if (vetor[i] == numero) {
            System.out.println("Numero informado já existente, favor tente novamente");
            return false;
          }
        }
        vetor[valor] = numero;
        return true;
    }

    private void ordenarVetor(int[] vetor) {
        int bolha = 0;
        for (int i = 0; i < (vetor.length - 1); i++) {
           for (int j = 0; j < (vetor.length - 1); j++) {
            if (vetor[j] > vetor[j + 1]) {
                bolha  = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = bolha;
                i = 0;
            } else {
                i += 1;
            }
           }
        }
    }

    private void imprimirResultado(int[] vetor) {
        System.out.print("Vetor ordenado: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < (vetor.length - 1)) {
                System.out.print("][");
            }
        }
        System.out.println("]");
        
    }

    
    public static void main(String[] args) {
        new Exercicio7();
    }
}
