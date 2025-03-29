import java.util.Random;
import java.util.Scanner;
public class Trabalho {
    public Trabalho() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        //Inicio comando de 'jogar novamente':

        String Recomeçar;
        do {
        
        //Inicializador do tabuleiro:

        char[][] Mapa = new char[8][8];
        char[][] Navios = new char[8][8];
        int [] Ordenação = new int[9];
        int[] Coordenadas = new int[30];

        System.out.println("Escreva qualquer coisa para começar: ");
        String Iniciar = entrada.nextLine();

        System.out.println("\nIniciando jogo...\n");

         //Populando posições(Ordenação): 

         for (int i = 0; i < Ordenação.length; i++) {
            Ordenação[i] = i;
            System.out.print(Ordenação[i] + "  ");
        }
        System.out.println();

        //Popular vetores do Mapa: 

        for (int Linha = 0; Linha < Mapa.length; Linha++) {
            for (int Coluna = 0; Coluna < Mapa[Linha].length; Coluna++) {
                Mapa[Linha][Coluna] = '~';
        }    
    }
        for (int i = 0; i < Mapa.length; i++) { //Linhas
            for (int j = 0; j < Mapa[0].length; j++) { //Colunas
                System.out.print(Mapa[i][j] + "  ");
        }
        System.out.println("");
}
        //Metodo que randomiza as posições dos Navios no Mapa:

        randomizador(Mapa, Navios, 0, 0, random);

        //Iniciando o jogo...
       
        int Linha = 0;
        int Coluna = 0;
        int acertos = 0;
        int Tentativas = 0;
        do {
            Tentativas++; //Computando Tentativas;

            //Parte de interação do usuário: 

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
            System.out.println("\nVOCÊ VENCEU\nTODA A FROTA INIMIGA FOI TOTALMENTE DESTRUÍDA\n");
        } else {
            System.out.println("\nVOCÊ PERDEU\nAPESAR DOS SEUS EXFORÇOS, A FROTA INIMIGA CONSEGUIU FUGIR\n");
        }

        //Comando para jogar novamente:

        System.out.println("Deseja jogar novamente? (s) - Sim, (n) - Não");
        Recomeçar = entrada.nextLine();
        } while (Recomeçar != "N" || Recomeçar != "n");

        entrada.close();    
}
    //Randomizando dos Navios:

    private void randomizador(char[][] Mapa, char[][] Navios, int Linha, int Coluna, Random random) {
        int Verificador = 10;
        for (int n = 0; n < Verificador; n += 0) {
            Linha = random.nextInt(8);
            Coluna = random.nextInt(8);
            if (Navios[Linha][Coluna] != 'N') {
                Navios[Linha][Coluna] = 'N';
                Verificador--;
            }
        }
        System.out.println("Navios posicionados");
    }
    //Metodo que contempla a escolha das Coordenadas à atacar e seus respectivos resultados: 

    private int jogar(Scanner entrada, char[][] Mapa, char[][] Navios, int[] Coordenadas, int Linha, int Coluna, int Tentativas, int acertos) {
        int Verificador = 0;
        do {
            System.out.println("Digite as Coordenadas que deseja atacar (Favor informar a Linha e a Coluna): ");

            String resposta = entrada.nextLine().replace(" ", "");
            int a = Integer.parseInt(resposta);

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
                System.out.println("Coordenada indicada já atacada anteriormente...");
            }

            //Verificação do Mapa: 

            if (Verificador == 0) {
                Linha--;
                Coluna--;
            }

            //Se o navio estiver na coordenada, o Mapa marcará 'X' na posição: 

            if (Navios[Linha][Coluna] == 'N') {
                Mapa[Linha][Coluna] ='X';
                acertos++;
                System.out.println("Voce acertou o navio. Faltam: " + (10 - acertos) + ".");

            //Se o navio NÃO estiver na coordenada, o Mapa marcará "O" na posição:

            } else {
                Mapa[Linha][Coluna] = 'O';
                System.out.println("Voce acertou o mar, nenhum navio atingido. Restam " + (30 - Tentativas) + " Tentativas.");
            }

        } while (Verificador == 1);

        return acertos;
    }
    public static void main(String[] args) {
        new Trabalho();
    }
}