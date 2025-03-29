import java.util.Scanner;
public class Exercicio25 {
    /*Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. 
      Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

         um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
         o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.*/

         public Exercicio25() {
            Scanner entrada = new Scanner(System.in);
            int pontosEsquerda = 0;
            int pontosDireita = 0;

        while (true) {
            System.out.println("Digite o código do ponto (E para esquerda, D para direita):");
            char ponto = entrada.next().charAt(0);

            if (ponto == 'E') {
                pontosEsquerda++;
            } else if (ponto == 'D') {
                pontosDireita++;
            } else {
                System.out.println("Código inválido. Digite novamente.");
                continue;
            }

            if ((pontosEsquerda >= 21 || pontosDireita >= 21) &&
                Math.abs(pontosEsquerda - pontosDireita) >= 2) {
                if (pontosEsquerda > pontosDireita) {
                    System.out.println("Jogador da esquerda venceu!");
                } else {
                    System.out.println("Jogador da direita venceu!");
                }
                break;
            }
        }
        entrada.close();
}
  public static void main(String[] args) {
   new Exercicio25();
 }
}
