import java.util.Scanner;
public class Exercicio8 {
        /*Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
        Escreva o menor valor negativo;
        Escreva a média dos números positivos.*/ 
    public Exercicio8() {
        Scanner entrada = new Scanner(System.in);
        double numero = 0;
        double menor = 0;
        double media = 0;
        for (int contador = 0; contador <= 10; contador++) {
             System.out.println("Digite 10 numeros aleatorios: ");
             numero = entrada.nextDouble();
             media += numero;
             if (contador == 1) {
                numero = menor;
             } else if (numero < 0 && numero < menor) {
                menor = numero;
             }
             if (numero > 0) {
                media += numero;
             }
                      
        }
        System.out.println("O menor valor é; " + menor);
        System.out.println("A media dos numeros descritos acima é: " + media/10);
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio8();
    }
}
