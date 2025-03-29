import java.util.Scanner;
public class Exercicio29 {
    /*Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas que ele 
    precisará combinar para entregar o valor solicitado. 
    Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.*/

    public Exercicio29() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe o valor: R$");
    int valor = entrada.nextInt();
    int cedulas20 = valor / 20;
    valor = valor % 20;
    int cedulas10 = valor / 10;
    valor = valor % 10;
    int cedulas5 = valor / 5;
    valor = valor % 5;
    int cedulas2 = valor / 2;
    valor = valor % 2;
    int cedulas1 = valor / 1;
    valor = valor % 1;
    
    System.out.println("Numero de cedulas de R$20,00: " + cedulas20);
    System.out.println("Numero de cedulas de R$10,00: " + cedulas10);
    System.out.println("Numero de cedulas de R$5,00: " + cedulas5);
    System.out.println("Numero de cedulas de R$2,00: " + cedulas2);
    System.out.println("Numero de cedulas de R$1,00: " + cedulas1);
    entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio29();
    }
}
