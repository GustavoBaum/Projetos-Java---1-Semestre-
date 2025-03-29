import java.util.Scanner;
public class Exercicio1 {
    /*Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. 
    Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.*/
  
    public Exercicio1() {
    int numeros[] = new int[10];
    
    ler(numeros); //this.ler(numeros);

    escrever(numeros);
   
    }

    //Metodo sem retorno (void) e sem parametro(entrada).
    private void ler(int[] numeros) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        entrada.close();
    }

    public void escrever(int[] numeros) {
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
           }
    }
    public static void main(String[] args) {
        new Exercicio1();
    }
}
