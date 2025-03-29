import java.util.Scanner;
         /*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

        Escreva os nomes dos alunos que tem 18 anos;
        Escreva a quantidade de alunos que tem idade acima de 20 anos.*/
public class Exercicio9 {
        public Exercicio9() {
        Scanner entrada = new Scanner(System.in);
        String nome = "";
        int idade = 0;

            System.out.println("Informe a quantidade de alunos: ");
            int quantidade = entrada.nextInt();

        for (int numero = 0; numero < quantidade; numero++) {
            
            System.out.println("Digite o nome de cada aluno: ");
            nome = entrada.next();

            System.out.println("Digite a idade de cada aluno");
            idade = entrada.nextInt();

            String nomeAlunos18Anos = "";
            int quantidadeAlunos20Anos = 0;
            if (idade == 18) {
                nomeAlunos18Anos += nome + " ";
             } else if (idade >= 20) {
                quantidadeAlunos20Anos++;
             } 
             System.out.println();
             System.out.println("Os nomes dos alunos com 18 anos são: " + nomeAlunos18Anos);
             System.out.println("A quantidade de alunos com 20 anos ou mais é: " + quantidadeAlunos20Anos);
      }
      entrada.close();
 }

 public static void main(String[] args) {
    new Exercicio9();
 }
}

