import java.util.Scanner;
public class Exercicio20 {
    /*Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, 
    descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.*/

    public Exercicio20() {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Indique a massa inicial do material radioativo escolhido, em Kg: ");
      double massaInicial = entrada.nextInt();
      double massaFinal = 0.0005;
      int tempoDecorrido = 0;

      while (massaInicial > massaFinal) {
         massaInicial /= 2;
         tempoDecorrido += 50;
      }
      int minutos = tempoDecorrido / 60;
      int segundos = tempoDecorrido % 60;

      System.out.println("A massa inicial é de: " + massaInicial + " Kg");
      System.out.println("A massa final é de: " + massaFinal + " Kg");
      System.out.println("O tempo decorrido foi de: " + minutos + " minutos e " + segundos + " segundos.");
      entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio20();
    }
}
