import java.util.Scanner;
public class Exercicio17 {
    /*Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:
          o número de inscrição e a altura do atleta mais alto;
          o número de inscrição e a altura do atleta mais baixo;
          a altura média do grupo de atletas.
      A leitura deve ser finalizada ao digitar 0 para o número de inscrição.*/

      public Exercicio17() {
        Scanner entrada = new Scanner(System.in);

        int numInscricaoMaisAlto = 0;
        double alturaMaisAlto = Double.MIN_VALUE;
        int numInscricaoMaisBaixo = 0;
        double alturaMaisBaixo = Double.MAX_VALUE;
        double somaAltura = 0;
        int totalAtletas = 0;

        System.out.println("Digite o número de inscrição do atleta ou 0 para encerrar:");
        int numInscricao = entrada.nextInt();

        while (numInscricao != 0) {
            System.out.println("Digite a altura do atleta:");
            double altura = entrada.nextDouble();

            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                numInscricaoMaisAlto = numInscricao;
            }

            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                numInscricaoMaisBaixo = numInscricao;
            }

            somaAltura += altura;
            totalAtletas++;

            System.out.println("Digite o número de inscrição do próximo atleta ou 0 para encerrar:");
            numInscricao = entrada.nextInt();
        }

        if (totalAtletas == 0) {
            System.out.println("Nenhum atleta foi informado.");
        } else {
            double mediaAltura = somaAltura / totalAtletas;

            System.out.println("Número de inscrição do atleta mais alto: " + numInscricaoMaisAlto);
            System.out.println("Altura do atleta mais alto: " + alturaMaisAlto);
            System.out.println("Número de inscrição do atleta mais baixo: " + numInscricaoMaisBaixo);
            System.out.println("Altura do atleta mais baixo: " + alturaMaisBaixo);
            System.out.println("Altura média do grupo de atletas: " + mediaAltura);
        }

        entrada.close();
    }
    public static void main(String[] args) {
      new Exercicio17();
    }
}
