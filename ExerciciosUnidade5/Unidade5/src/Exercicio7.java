import java.util.Scanner;
public class Exercicio7 {
    /*Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.*/
    public Exercicio7() {
        Scanner entrada = new Scanner(System.in);
        double numero = 0;
        double maior = 0;
        double menor = 0;
             System.out.println("Digite a quantidade de numeros a ser informado: ");
             int quantidade = entrada.nextInt();
        for (int contador = 0; contador < quantidade; contador++) {
             System.out.println("Digite um numero aleatorio: ");
             numero = entrada.nextDouble();
             if (contador == 1) {
                maior = numero;
                menor = maior;
             } else if (numero > maior) {
                maior = numero;
             } else if (numero < menor) {
                menor = numero;
             }
        }
        System.out.println("O menor valor é: " + menor + ". O maior valor é: " + maior);
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio7();
    }
}
