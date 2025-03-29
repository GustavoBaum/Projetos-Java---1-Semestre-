import java.util.Scanner;

public class Exercicio22 {
    /*Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. Considerando que o sistema apresenta 3 cursos disponíveis 
    (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando 
    o título que o aluno vai receber caso opte por aquele curso. As titulações são respectivamente: "Bacharel em Ciência da Computação", 
    "Licenciado em Computação" e "Bacharel em Sistemas de Informação".*/

    public Exercicio22() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero do seu curso: ");
        int curso = entrada.nextInt();

            switch (curso) {
                case 1: System.out.println("Bacharel em Ciencia da Computação");
                break;

                case 2: System.out.println("Licenciatura em Computação");
                break;

                case 3: System.out.println("Bacharel em Sistemas de Informação");
                break;
            }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio22();
    }
}
