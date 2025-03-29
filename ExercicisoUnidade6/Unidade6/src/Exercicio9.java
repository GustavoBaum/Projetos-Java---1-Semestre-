import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio9 {

   /** Uni6Exe09.java - Um cinema pretende fazer uma pesquisa para avaliar o grau de
     * satisfação de seus clientes. Trinta deles foram ouvidos e para cada um
     * perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero
     * até dez, valor inteiro) e a idade.
     * 
     * Baseado nisto faça um programa que informe:
     * 
     * qual a nota média recebida pelo cinema;
     * qual a nota média atribuída pelos homens;
     * qual a nota atribuída pela mulher mais jovem;
     * quantas das mulheres com mais de 50 anos deram nota superior a média recebida
     * pelo cinema.
     * Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e
     * métodos para a resolução deste exercício.*/
    public Exercicio9() {
        Scanner entrada = new Scanner(System.in);
        int notasHomens[] = new int[5];
        int notasMulheres[] = new int[5];
        int idadesMulheres[] = new int[5];

        inicializarVetores(notasMulheres, notasHomens, idadesMulheres);
        popularVetores(notasMulheres, notasHomens, idadesMulheres);
        int qtdHomens = quantidadeValores(notasHomens);

        int media = notaMedia(notasHomens, notasMulheres);
        System.out.println("A media dada ao cinema é: " + media);
        
        System.out.println("Nota média dos homens: " + notaMediaHomens(notasHomens, qtdHomens));
        
        System.out.println("A nota dada pela mulher mais jovem é: " + notaMulherMaisJovem(notasMulheres, idadesMulheres));
        
        System.out.println("A quantidade de mulheres com mais de 50 anos que deram uma nota superior à media é: " + quantidadeMulheres50anos(media, idadesMulheres, notasMulheres));
        
        entrada.close();
    }

    private int quantidadeMulheres50anos(int media, int[] idades, int[] notas) {
        int quantidadeMulheres50anos = 0;

        for (int i = 0; i < idades.length; i++) {
         do {
            if (idades[i] > 50 && notas[i] > media) {
                quantidadeMulheres50anos++;
            }
        } while (idades[i] > 50);
      }
        return quantidadeMulheres50anos;
    }

    private int notaMediaHomens(int[] vetHomens, int qtdHomens) {
        int notas = 0;
        for (int i = 0; i < vetHomens.length; i++) {
            notas += vetHomens[i];
        }
        return notas / qtdHomens;
    }

    private int notaMedia(int[] vet1, int[] vet2) {
        int notas = 0;
        for (int i = 0; i < vet1.length; i++) {
            notas += vet1[i] + vet2[i];
        }

        return notas / vet1.length;
    }

    private int quantidadeValores(int[] vetor) {
        int quantidade = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != -1) {
                quantidade++;
            } else {
                return quantidade;
            }
        }
        return quantidade;
    }

    private void inicializarVetores(int[] mulheres, int[] homens,
            int[] idadeMulheres) {
        for (int i = 0; i < mulheres.length; i++) {
            mulheres[i] = -1;
            homens[i] = -1;
            idadeMulheres[i] = -1;
        }
    }

    private void popularVetores(int[] mulheres, int[] homens,
            int[] idadeMulheres) {
        int qtdHomens = 0;
        int qtdMulheres = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Iniciando preenchimento das 30 pessoas: ");
        for (int i = 0; i < mulheres.length; i++) {

            int sexo = 0;
            do {
                try {
                    System.out.println("Sexo (1-F ou 2-M): ");
                    sexo = leitor.nextInt();
                } catch (InputMismatchException e) {
                    leitor = new Scanner(System.in);
                    System.out.println("Informação inválida, deve ser 1 ou 2");
                }
            } while (sexo != 1 && sexo != 2);

            int nota = -1;
            do {
                System.out.println("Nota (0 a 10): ");
                nota = leitor.nextInt();
            } while (nota < 0 || nota > 10);

            int idade = 0;
            do {
                try {
                    System.out.println("Idade: ");
                    idade = leitor.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Erro ao informar idade");
                    leitor = new Scanner(System.in);
                }
            } while (idade <= 0);

            if (sexo == 1) {
                mulheres[qtdMulheres] = nota;
                idadeMulheres[qtdMulheres] = idade;
                qtdMulheres++;
            } else {
                homens[qtdHomens] = nota;
                qtdHomens++;
            }
        }
    }

    private int notaMulherMaisJovem(int[] notas, int[] idades) {
        int idadeMenor = Integer.MAX_VALUE;
        int notaMenor = 0;

        int quantidadeMulheres = quantidadeValores(notas);
        for (int i = 0; i < quantidadeMulheres; i++) {
            if (idadeMenor > idades[i]) {
                idadeMenor = idades[i];
                notaMenor = notas[i];
            }
        }
        return notaMenor;
    }

    public static void main(String[] args) {
        new Exercicio9();
    }
}