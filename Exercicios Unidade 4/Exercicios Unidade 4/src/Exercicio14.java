import java.util.Scanner;

public class Exercicio14 {
    /*Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês. 
    Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.*/

    public Exercicio14() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = entrada.nextInt();
        System.out.print("Digite o mes: ");
        int mes = entrada.nextInt();
        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
        }  if (mes == 1 || mes ==3) {
            System.out.println("Válida");
         } if (mes != 2 && dia < 31) {
             System.out.println("Válida");
         } if (mes == 2 && dia < 29) {
             System.out.println("Válida");
         } if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
             System.out.println("Válida");
         } else {
            System.out.println("Não válida");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio14();
    }
    
}
