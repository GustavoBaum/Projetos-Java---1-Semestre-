import java.util.Scanner;
public class Exercicio5 {
     /*Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
        8, 10, 16, 18, 32, 34, 64...  
      O valor n deve ser lido e deve ser maior do que 2.*/
    public Exercicio5() {
     Scanner entrada = new Scanner(System.in);
     System.out.println("Indique a quantidade de numeros na sequencia: ");
     int quantidade = entrada.nextInt();
        
        if (quantidade > 2) {
            int numero1 = 8;
            int numero2 = 0;
            for (int contador = 0; contador < (quantidade/2); contador++) {
                 System.out.print(numero1 + " ");
                 numero2 = numero1 + 2;
                 System.out.print(numero2 + " ");
                 numero1 *= 2;
        }
        if (quantidade % 2 != 0) {
          numero2 = numero1;
          System.out.println(numero2 + " ");
        }
      entrada.close();
     }
    }
    public static void main(String[] args) {
        new Exercicio5();
    }
}
