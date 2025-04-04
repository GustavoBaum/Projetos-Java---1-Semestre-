import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio20 {
    /*Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:

         media=(notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7

      A atribuição dos conceitos obedece à tabela abaixo: 

           media	      conceito
           >= 9.0	         A
           >= 7.5 e < 9.0	 B
           >= 6.0 e < 7.5	 C
           >= 4.0 e < 6.0	 D
           < 4.0	         E

O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.*/

    public Exercicio20() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor das 3 provas e a nota da média dos exercícios, respectivamente: ");
        double prova1 = entrada.nextDouble();
        double prova2 = entrada.nextDouble();
        double prova3 = entrada.nextDouble();
        double médiaExercicios = entrada.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        double média = (prova1+prova2*2+prova3*3+médiaExercicios)/7;
        System.out.println("A média de aproveintamento é de: " + df.format(média));

        if (média >= 9.0) {
            System.out.println("Conceito = A");
            System.out.println("Aprovado");
        } else if (média >= 7.5 && média < 9.0) {
            System.out.println("Conceito = B");
            System.out.println("Aprovado");
        } else if (média >= 6.0 && média < 7.0) {
            System.out.println("Conceito = C");
            System.out.println("Aprovado");
        } else if (média >= 4.0 && média < 6.0) {
            System.out.println("Conceito = D");
            System.out.println("Reprovado");
        } else if (média < 4.0) {
            System.out.println("Conceito = E");
            System.out.println("Reprovado");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio20();
    }
}
