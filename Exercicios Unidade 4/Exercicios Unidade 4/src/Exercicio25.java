import java.util.Scanner;

public class Exercicio25 {
    /*Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
       Escolha uma opção:
          1 - Soma de dois números.
          2 - Diferença entre dois números.
          3 - Produto entre dois números.
          4 - Divisão entre dois números (o denominador não pode ser zero).*/

    public Exercicio25() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 2 numeros: ");
        double valor1 = entrada.nextDouble();
        double valor2 = entrada.nextDouble();
        int operação = entrada.nextInt(); 

        switch (operação) {
            case 1: double conta1 = valor1 + valor2;
                    System.out.println("O resultado é: " + conta1);
            break;
            case 2: double conta2 = valor1 - valor2;
                    System.out.println("O resultado é: " + conta2);
            break;
            case 3: double conta3 = valor1 * valor2;
                    System.out.println("O resultado é: " + conta3);
            break;
            case 4: double conta4 = valor1 / valor2;
                    System.out.println("O resultado é: " + conta4);
            break;               
        }
        if (valor2 == 0) {
            System.out.println("Resultado inválido");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio25();
    }
}
