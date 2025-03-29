import java.util.Scanner;

public class Exercicios4 {
    /*Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2)
         
             Dados: Ok

             Entrada: nota1 ; nota2 ; nota3.

             Processo: (npta1*0.5) + (nota2*0.3) + (nota3*0.2).

             Saída: escrever: media

             Teste: 1) nota1: 10
                       nota2: 6
                       nota3: 8 
                       media: 8.4
                    
                    2) nota1: 4
                       nota2: 7
                       nota3: 3
                       media: 4.7
    */ 
    
    public Exercicios4() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota1: ");
        double nota1 = entrada.nextInt();
        System.out.print("Digite a nota2: ");
        double nota2 = entrada.nextDouble();
        System.out.print("Digite a nota3: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1*0.5) + (nota2*0.3) + (nota3*0.2);
        System.out.println("A média do aluno na respectiva disciplina é: " + media);
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios4();
    }
}
