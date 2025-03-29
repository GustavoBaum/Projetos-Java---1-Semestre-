import java.util.Scanner;
public class Prova2 {

    public Prova2() {

    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe o tamanho da sua mochila(utilize valores inteiros): ");
    int tamanho = entrada.nextInt();
    System.out.print("Informe a quantidade maxima da mochila(kg): ");
    int peso = entrada.nextInt(); 

    String[] vetorTamanho = new String[tamanho];
    int[] vetorPeso = new int[peso];

    int codigo = 0;
    do {
      System.out.println("Informe o método que deseja usar: (1) - Inserir, (2) - Imprimir, (3) - Item Mais Pesado, (4) - Ordenar, (5) - Excluir, (6) - Sair");
      codigo = entrada.nextInt();

      switch (codigo) {

        case 1: inserirValor(entrada, vetorPeso, vetorTamanho, tamanho, peso);
        
        break;

        case 2: imprimirMochila(vetorPeso, vetorTamanho);

        break;

        case 3: valorItemMaisPesado(vetorPeso, vetorTamanho);

        break;

        case 4: ordenadorMochila(vetorPeso);

        break;

        case 5: excluirItemMochila(entrada, vetorTamanho, vetorPeso, tamanho, peso);

        break;

        case 6:  System.out.println("Finalizando programa...");

        break;
      
        default: System.out.println("Opção inválida, favor digite novamente: ");
                 codigo = entrada.nextInt(); 
        break;
      }
    } while (codigo != 6);
    entrada.close();
    }

    private void inserirValor(Scanner entrada, int[] vetorPeso, String[] vetorTamanho, int tamanho, int peso) {

        System.out.println("Tamanho da mochila: " + tamanho);
        System.out.println("Capacidade máxima da mochila(kg): " + peso);

        String valor = "";
        int pesoObj = 0;

        System.out.println("Inserir item: "); 
        valor = entrada.next();
        System.out.println("Inserir peso: ");
        pesoObj = entrada.nextInt();

        for (int i = 0; i < vetorTamanho.length; i++) {
            if (vetorTamanho[i] == "" || vetorPeso[i] < vetorPeso.length) {
                vetorTamanho[i] = valor;
                vetorPeso[i] = pesoObj;
                tamanho++;
                peso = pesoObj;
            } else {
                System.out.println("Mochila cheia, impossivel adicionar item.");
            }
        }
    }

    private void imprimirMochila(int[] vetorPeso, String[] vetorTamanho) {
        System.out.println("Valores de tamanho e peso impressos na ordem INVERSA: ");
        for (int i = (vetorTamanho.length -1); i >= 0; i--) {
          System.out.print(vetorTamanho[i] + "; ");
        }
        System.out.println();

        for (int i = (vetorTamanho.length -1); i >= 0; i--) {
          System.out.print(vetorPeso[i] + "; ");
        } 
        System.out.println();
    }

    private void valorItemMaisPesado(int[] vetorPeso, String[] vetorTamanho) {
        int menor = Integer.MIN_VALUE;
        int maior = 0;
        for (int i = 0; i < vetorPeso.length; i++) {
            if (vetorPeso[i] > menor) {
                vetorPeso[i] = maior;
                maior = menor;
            }
        }
        System.out.println("O item mais pesado presente na mochila é: " + maior);
    }

    private void ordenadorMochila(int[] vetorPeso) {
        int ordenador = 0;
        for (int i = 0; i < (vetorPeso.length -1); i++) {
            for (int j = 0; j < (vetorPeso.length -1); j++) {
                if (vetorPeso[j] > vetorPeso[j + 1]) {
                    ordenador = vetorPeso[j];
                    vetorPeso[j] = vetorPeso[j + 1];
                    vetorPeso[j + 1] = ordenador;
                    i = 0;
                } else {
                    i += 1;
                }
            
            } 
        }
        System.out.print("Mochila ordenada: [");
        for (int i = 0; i < vetorPeso.length; i++) {
            System.out.print(vetorPeso[i]);
            if (i < (vetorPeso.length -1)) {
                System.out.print("][");
            }
        }
        System.out.println("].");
    }

   private void excluirItemMochila(Scanner entrada, String[] vetorTamanho, int[] vetorPeso, int tamanho, int peso) {

         String item = "";
         System.out.println("Indique o item que deseja excluir: ");
         item = entrada.next();
         boolean achei = false;

         for (int i = 0; i < vetorTamanho.length; i++) {
            if (vetorTamanho[i] == item) {
                vetorTamanho[i] = vetorTamanho[i + 1];
                vetorPeso[i] = vetorPeso[i + 1];
                tamanho--;
                peso--;
                achei = true;
            }
            if (achei) {
                vetorTamanho[vetorTamanho.length] = "";
                vetorPeso[vetorPeso.length] = 0;
                System.out.println("Item excluido da mochila");
            } else {
                System.out.println("Item não encontrado");
            }
         }
   }
        public static void main(String[] args)  {
        new Prova2();
    }
}
