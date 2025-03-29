import java.util.Scanner;
public class Exercicio10 {
    /*Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

     “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
     “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
     “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). 
      Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
     “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. 
      A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
     “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
     “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
     “7 – Inverter valores”: desafio (ver abaixo);
     “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.

     Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.
    Para a opção "6 - Ordenar valores" se pode usar o "método bolha" explicado neste vídeo. 
    Existem também outros vídeos que mostram a lógica de ordenação usando o "método bolha", 
    no caso é só procurar por "Bubble Sort". Um deles é Bubble Sort | GeeksforGeeks. 
    Um outro um pouco mais "divertido" procura mostrar a lógica usando uma coreografia de dança: Bubble sort with Hungarian, folk dance.

    Desafio: adapte o código acima para ter mais uma opção no menu para também poder inverter os elementos dentro de um vetor. 
    Assim o último elemento passa a ser o primeiro, o penúltimo passa ser o segundo, e assim sucessivamente para todos os elementos da lista. 
    Mas lembre, não se deve considerar o vetor inteiro, mas somente os elementos que já foram adicionados no vetor. Como base use o código descrito em vetorInverter.java.*/
    public Exercicio10() {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];

        int codigo = 0;
        int tamanhoVetor = 0;
        inicializarVetor(vetor);
        do {
          System.out.print("Prompt de Comando: Selecione a opção que deseja: (1) - Incluir, (2) - Pesquisar, (3) - Alterar, (4) - Excluir, (5) - Mostrar, (6) - Ordenar, (7) - Inverter, (8) - Sair: ");
          codigo = entrada.nextInt();
          switch(codigo) {

            case 1: inserirValor(entrada, vetor, tamanhoVetor);
            break;

            case 2: pesquisarValor(entrada, vetor);
            break;

            case 3: alterarValor(entrada, vetor);
            break;

            case 4: excluirValor(entrada, vetor, tamanhoVetor);
            break;

            case 5: mostrarValores(vetor);
            break;

            case 6: ordenarValores(vetor);
            break;  

            case 7: inverterValores(vetor);
            break;

            case 8: System.out.println("Finalizando programa...");
            break;

            default: System.out.println("Codigo inválido, por favor tente novamente");
            codigo = entrada.nextInt();
          }
        } while (codigo != 8);

        entrada.close();
    }

    private void inverterValores(int[] vetor) {
        for (int i = (vetor.length -1); i >= 0; i--) {
         if (vetor[i] != -1) {    
         System.out.print(vetor[i] + ", ");
         }
        }
        System.out.println();
    }

    private void ordenarValores(int[] vetor) {
        int ordenador = 0;
        for (int i = 0; i < (vetor.length -1); i++) {
          for (int j = 0; j < (vetor.length -1); j++) {
               if (vetor[j] > vetor[j + 1]) {
                ordenador = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = ordenador;
                i = 0;
               } else {
                   i += 1;
                } 
               }
          }
          System.out.print("Vetor ordenado: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < (vetor.length - 1)) {
                System.out.print("][");
            }
        }
        System.out.println("]"); 
        }
      

    private void mostrarValores(int[] vetor) {
     for (int i = 0; i < vetor.length; i++) {
          System.out.print(vetor[i] + ", ");
        }
        System.out.println();
    } 

    private int excluirValor(Scanner entrada, int[] vetor, int tamanhoVetor) {
     System.out.println("Indique o valor que deseja excluir: ");
       int valor = entrada.nextInt();
       boolean achei = false;
       for (int i = 0; i < vetor.length; i++) {
          if (valor == vetor[i]) {
               System.out.println("Valor encontrado, excluindo...");
               vetor[i] = vetor[i + 1];
               tamanhoVetor--;
               achei = true;
          }
       }
       if (achei) {
          vetor[vetor.length -1] = -1;
          System.out.println("Valor excluido");
       } else {
          System.out.println("Valor informado não encontrado");
       }
       return tamanhoVetor;
    }

    private void alterarValor(Scanner entrada, int[] vetor) {
     System.out.println("Informe o valor que deseja alterar: ");
       int valor = entrada.nextInt();
     System.out.println("Informe o novo valor: ");
     int novoValor = entrada.nextInt();  
       boolean achei = false;
       for (int i = 0; i < vetor.length; i++) {
          if (valor == vetor[i]) {
               vetor[i] = novoValor;
               achei = true;
               break;
          }
       }
       if (achei) {
          System.out.println("Valor informado alterado com sucesso");
       } else {
          System.out.println("Valor informado não encontrado");
       }
    }

    private void pesquisarValor(Scanner entrada, int[] vetor) {
     System.out.println("Informe o valor que deseja pesquisar no vetor: " );
     int valor = entrada.nextInt();
     boolean achei = false;
       for (int i = 0; i < vetor.length; i++) {
          if (valor == vetor[i]) {
               achei = true;
               break;
          } 
       }
       if (achei) {
               System.out.println("Valor encontrado");
          } else {
               System.out.println("Valor informado não encontrado");
          }   
    }

    private int inserirValor(Scanner entrada, int[] vetor, int tamanhoVetor) {
     int verificador = -1;
     System.out.println("Informe o valor que deseja inserir no vetor: ");
     int valor = entrada.nextInt();
        for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] == -1 && verificador == -1) {
            vetor[i] = valor;
            verificador = 0;
            tamanhoVetor++;
         } else if (tamanhoVetor == vetor.length) {
             System.out.println("Vetor cheio");
             break;
         }
        }
        return tamanhoVetor;
    }

    private void inicializarVetor(int[] vetor) {
        for (int i = 0 ; i < vetor.length; i++) {
         vetor[i] = -1;
        }
    }

    public static void main(String[] args) {
        new Exercicio10();
    }
}
