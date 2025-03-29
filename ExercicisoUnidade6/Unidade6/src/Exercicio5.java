import java.util.Scanner;
public class Exercicio5 {
    /*Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:

Gosta de música sertaneja?
Gosta de futebol?
Gosta de seriados?
Gosta de redes sociais?
Gosta da Oktoberfest?

A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

se ambos deram a mesma resposta soma-se 3 pontos ao índice;
se um respondeu IND e o outro SIM ou NÃO soma-se 1;
se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. Crie um método que possa ler tanto as respostas do rapaz como da moça, 
e outro para calcular e retornar a afinidade. Por fim, escreva a afinidade considerando os seguintes intervalos:

      Afinidade	      Mensagem
         15	          “Casem!
       10 a 14	      “Vocês têm muita coisa em comum!”
        5 a 9	      “Vale um encontro.”
        0 a 4	      “Talvez não dê certo :(”
       -1 a -9	      “Melhor não perder tempo”
         -10	      “Vocês se odeiam!”
         */
    public Exercicio5() {
        String perguntas[] = new String[5];
        char respostaMoca[] = new char[5];
        char respostaRapaz[] = new char[5];
        int indice = 0;
       
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Qual pergunta: ");
            perguntas[i] = entrada.nextLine();

        popularResposta(entrada, perguntas, "rapaz");

        popularResposta(entrada, perguntas, "moca");

        calcularIndice(respostaRapaz, respostaMoca);

        if (indice == 15) {
            System.out.println("Casem");
        } else if (indice >= 10 && indice <= 14) {
            System.out.println("Voces tem muito em comum");
        } else if (indice >= 5 && indice <= 9) {
            System.out.println("Vale um encontro");
        } else if (indice >= 0 && indice <= 4) {
            System.out.println("Talvez não de certp :(");
        } else if (indice >= -9 && indice <= -1) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Voces se odeiam");
        }
        entrada.close();
    }
}

    public char[]  popularResposta(Scanner entrada, String[] perguntas, String nome) {
        char[] respostas = new char[5];
        System.out.println("Inicio das respostas do(a) " + nome);
        for (int i = 0; i < perguntas.length; i++) {
           System.out.println(perguntas[i] + " (Sim, Não, Indiferente): ");
           respostas[i] = entrada.nextLine().trim().toUpperCase().charAt(0);
        }
        return respostas;

    }

    public int calcularIndice(char[] v1, char[] v2) {
        int afinidade = 0;
        for (int i = 0; i < v1.length; i++) {
            if ((v1[i] == 'S' && v2[i] == 'N') || (v1[i] == 'N' && v2[i] == 'S')) {
                afinidade -= 2;
            } else if (v1[i] == v2[i]) {
                afinidade += 3;
            } else {
                afinidade += 1;
            }
        }
        return afinidade;
    } 
    public static void main(String[] args) {
        new Exercicio5();
    }
}
