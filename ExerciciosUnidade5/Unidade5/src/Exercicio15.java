import java.util.Scanner;
public class Exercicio15 {
    /*Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
    Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.*/
    
    public Exercicio15() {
           Scanner entrada = new Scanner(System.in);
           double prova1 = 0;
           double prova2 = 0;
           double media = 0;
           int quantidade = 0;
           String nome = "";

           System.out.println("Informe a quantidade de alunos: ");
           quantidade = entrada.nextInt();

           int contador = 0;
           while (contador < quantidade)
           {
            System.out.println("Digite o nome do aluno: ");
            nome = entrada.next();
            System.out.println("Digite a nota da primeira prova: ");
            prova1 = entrada.nextDouble();
            System.out.println("Digite a nota da segunda prova: ");
            prova2 = entrada.nextDouble();
            media = (prova1 + prova2) / 2;
            System.out.println(nome + " possui media igual a: " + media);
            contador++;
           }
           System.out.println("FIM");
           entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio15();
    }
}
