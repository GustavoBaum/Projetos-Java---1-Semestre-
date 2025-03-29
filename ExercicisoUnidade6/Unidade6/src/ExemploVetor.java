import java.util.Scanner;
public class ExemploVetor {

    public ExemploVetor() {
          //int numeros[] = new int[5];
          /*numeros[0] = 5;
          numeros[1] = 7;
          numeros[2] = 2;
          numeros[3] = 10;
          numeros[4] = 5; 
          */

          Scanner entrada = new Scanner(System.in);
          //System.out.println("Digite o numero 1: ");
          //numeros[0] = entrada.nextInt();

          /*for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
          }*/

          System.out.println("Digite a quantidade de elementos: ");
          int tamanho = entrada.nextInt();
          
          int numeros[] = new int[tamanho];
          for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

          System.out.println(numeros[0]);
          System.out.println(numeros[1] + " " + numeros[2]);

          System.out.println("Impressão do vetor por for: ");
          for (int a = 0; a < 5; a++) {
               System.out.println(numeros[a]);
          }

          int inteiros[] = new int[tamanho];
          for (int b = 0; b < inteiros.length; b++) {
            //if (i % 2 == 0) {
            //System.out.println("Digite o numero " + (b + 1) + ": ");
            //numeros[b] = entrada.nextInt();
            //}
            int informado = entrada.nextInt();
            if (informado % 2 == 0 ) {
                numeros[i] = informado;
            }
          entrada.close();   
        }
     }
    }
    public static void main(String[] args) {
        new ExemploVetor();
    }
}

