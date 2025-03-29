import java.util.Random;
import java.util.Scanner;

public class Trabalho {
    public Trabalho() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        // Inicializador do tabuleiro:

        char[][] Mapa = new char[8][8];
        char[][] Navios = new char[8][8];
        int[] Ordenação = new int[9];
        int[] Coordenadas = new int[30];

        System.out.println("Escreva qualquer coisa para começar: ");
        String Iniciar = entrada.nextLine();

        System.out.println("\nIniciando jogo...\n");

        // Inicio comando de 'jogar novamente':

        char Recomeçar;
        do {

            // Populando posições(Ordenação):

            for (int i = 0; i < Ordenação.length; i++) {
                Ordenação[i] = i;
                System.out.print(Ordenação[i] + "  ");
            }
            System.out.println();

            // Popular vetores do Mapa:

            for (int Linha = 0; Linha < Mapa.length; Linha++) {
                for (int Coluna = 0; Coluna < Mapa[Linha].length; Coluna++) {
                    Mapa[Linha][Coluna] = '~';
                }
            }

            for (int i = 0; i < Mapa.length; i++) {
                System.out.print(Ordenação[i + 1] + "  ");
                for (int j = 0; j < Mapa.length; j++) {
                    System.out.print(Mapa[i][j] + "  ");
                }
                System.out.println();
            }
            // Metodo que randomiza as posições dos Navios no Mapa:

            randomizador(Navios, 0, 0, random);

            // Iniciando o jogo...

            int Linha = 0;
            int Coluna = 0;
            int acertos = 0;
            int Tentativas = 0;
            do {
                Tentativas++; // Computando Tentativas;

                // Parte de interação do usuário usando um método de base:

                jogar(entrada, Mapa, Navios, Coordenadas, Linha, Coluna, Tentativas, acertos);

                System.out.println();

                for (int i = 0; i < Ordenação.length; i++) {
                    System.out.print(Ordenação[i] + "  ");
                }

                System.out.println();

                for (int i = 0; i < Mapa.length; i++) {
                    System.out.print(Ordenação[i + 1] + "  ");
                    for (int j = 0; j < Mapa.length; j++) {
                        System.out.print(Mapa[i][j] + "  ");
                    }
                    System.out.println();
                }

            } while (Tentativas != 30 && acertos != 10);
            if (acertos == 10) {
                System.out.println("\nVOCÊ VENCEU\nTODA A FROTA INIMIGA FOI DESTRUÍDA\n");
            } else {
                System.out.println("\nVOCÊ PERDEU\nAPESAR DOS SEUS EXFORÇOS, A FROTA INIMIGA CONSEGUIU FUGIR\n");

                for (int i = 0; i < Ordenação.length; i++) {
                    System.out.print(Ordenação[i] + "  ");
                }

                System.out.println();

                for (int i = 0; i < Mapa.length; i++) {
                    System.out.print(Ordenação[i + 1] + "  ");
                    for (int j = 0; j < Navios.length; j++) {
                        if (Navios[i][j] != 'N') {
                            System.out.print("~" + "  ");
                        } else {
                            System.out.print(Navios[i][j] + "  ");
                        }
                    }
                    System.out.println();
                }
            }

            // Comando para jogar novamente:

            System.out.println("\nDeseja jogar novamente? (s) - Sim, (n) - Não");
            Recomeçar = entrada.next().charAt(0);
        } while (Recomeçar == 'S' || Recomeçar == 's');

        entrada.close();
    }
    // Metodo para a randomização dos Navios:
    // O metodo randomizar utilizar a matriz char[][] Navios para posicionar os navios no mapa, 
    // int Linha para computar a posição(linha) dos navios, 
    // int Coluna para computar a posição(coluna) dos navios, e Random random para randomizar as posições dos navios no mapa
    // (neste caso, um metodo foi criado para impedir a sobreposição de navios, portanto, não é possivél dois navios estarem na mesma posição).

    private void randomizador(char[][] Navios, int Linha, int Coluna, Random random) {
        int Verificador = 10;
        for (int n = 0; n < Verificador; n += 0) {
            Linha = random.nextInt(8);
            Coluna = random.nextInt(8);
            if (Navios[Linha][Coluna] != 'N') {
                Navios[Linha][Coluna] = 'N';
                Verificador--;
            }
        }
        System.out.println("\nNavios posicionados\n");
    }
    // Metodo que contepla a escolha das coordenadas à atacar e seus respectivos resultados:
    // Scanner entrada é usado para obter do usuario as coordenadas desejadas, 
    // char[][] Mapa é usado tanto para computar a posição indicada pelo usuario no mapa quanto para mostrar o seus resultados, como 'X' ou 'O',
    // char[][] Navios é usado como base para comparar as coordenadas indicadas pelo usuario e a posição dos navios,
    // com o resultando sendo posteriormente comunicado para o char[][] Mapa para computar os resultados, 
    // int[] Coordenadas é usado para armazenar as coordenadas indicadas pelo usuario para posteriormente ser usado pelas outras classes,
    // int Linha é usado para computar a coordenada(Linha) indicada pelo usuario,
    // int Coluna é usado para computar a coordenada(Coluna) indicada pelo usuario,
    // int Tentativas computa as tentativas do usuario para seguir a regra do jogo do limite pré-estabelecido de tentativas,
    // int acertos computa a quantidade de navios atingidos, sendo ao final do metodo retornado para o construtor.


    private int jogar(Scanner entrada, char[][] Mapa, char[][] Navios, int[] Coordenadas, int Linha, int Coluna,
            int Tentativas, int acertos) {
        int Verificador = 0;
        do {
            try {
                System.out.println(
                        "\nDigite as coordenadas que deseja atacar (Favor informar a linha e a coluna, Exemplo: '12', Coluna = 1, Linha = 2): ");

                String resposta = entrada.nextLine().replace(" ", "");
                int a = Integer.parseInt(resposta);

                // Se a coordenada for menor que 11, será requisitado uma nova coordenada, pois
                // coordenada menor que 11 não exixte no jogo;

                while (a < 11) {
                    System.out.println("\nCoordenada inválida, por favor tente novamente ");
                    resposta = entrada.nextLine().replace(" ", "");
                    a = Integer.parseInt(resposta);
                }

                Verificador = 0;

                for (int i = 0; i < Tentativas; i++) {
                    if (Coordenadas[i] == a) {
                        Verificador = 1;
                    }
                }
                Coordenadas[Tentativas] = a;

                if (Verificador != 1) {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 1; j < 9; j++) {
                            String x = i + "" + j;
                            int b = Integer.parseInt(x);

                            if (a == b) {
                                Linha = i;
                                Coluna = j;
                            }
                        }
                    }
                } else {
                    System.out.println("\nCoordenada indicada já foi atacada anteriormente...");
                }

                // Verificação do mapa:

                if (Verificador == 0) {
                    Linha--;
                    Coluna--;
                }

                // Se o navio estiver na coordenada indicada pelo jogador, o mapa marcará 'X' na
                // posição:

                if (Navios[Linha][Coluna] == 'N') {
                    Mapa[Linha][Coluna] = 'X';
                    acertos++;
                    System.out.println("\nVoce acertou o navio. Faltam: " + (10 - acertos) + ".");

                    // Se o navio NÃO estiver na coordenada indicada pelo jogador, o mapa marcará
                    // "O" na posição:

                } else {
                    Mapa[Linha][Coluna] = 'O';
                    System.out.println("\nVoce acertou o mar, nenhum navio atingido. Restam " + (30 - Tentativas)
                            + " tentativas.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nCoordenada inválida, por favor tente novamente\n");
            } catch (NumberFormatException e) {
                System.out.println("\nFavor conceder coordenadas em valores numéricos válidos, tente novamente\n ");
            }

        } while (Verificador == 1);

        return acertos;
    }

    public static void main(String[] args) {
        new Trabalho();
    }
}