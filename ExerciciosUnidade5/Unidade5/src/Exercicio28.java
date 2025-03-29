import java.util.Scanner;

public class Exercicio28 {
    /*Uma emissora de rádio decidiu promover uma eleição para determinar o melhor conjunto do ano segundo a opinião dos ouvintes. 
    Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os votos são informados através de códigos:

        código	conjunto
          1	       Nenhum de Nós
          2	       CPM22
          3	       Skank
          4	       Jota Quest
     Descreva um algoritmo que:

       informe o total de votos para cada grupo;
       informe o percentual dos votos para cada grupo;
       informe o grupo vencedor.
       O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.*/

public Exercicio28() {
        Scanner entrada = new Scanner(System.in);

        int[] votos = new int[4];
        String[] conjuntos = {"Nenhum de Nós", "CPM22", "Skank", "Jota Quest"};
        int totalVotos = 0;

        char continuar;
        do {
            System.out.println("Informe o código do conjunto (1 a 4):");
            int codigo = entrada.nextInt();

            if (codigo >= 1 && codigo <= 4) {
                votos[codigo - 1]++;
                totalVotos++;
            } else {
                System.out.println("Código inválido. Tente novamente.");
            }

            System.out.println("Mais um voto? (s/n)");
            continuar = entrada.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("Total de votos para cada grupo:");
        for (int i = 0; i < votos.length; i++) {
            System.out.println(conjuntos[i] + ": " + votos[i]);
        }

        System.out.println("Percentual dos votos para cada grupo:");
        for (int i = 0; i < votos.length; i++) {
            double percentual = votos[i] / totalVotos * 100;
            System.out.println(conjuntos[i] + ": " + percentual + "%");
        }

        int indiceVencedor = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > votos[indiceVencedor]) {
                indiceVencedor = i;
            }
        }
        System.out.println("Grupo vencedor: " + conjuntos[indiceVencedor]);

        entrada.close();
}
public static void main(String[] args) {
    new Exercicio28();
 }
}
