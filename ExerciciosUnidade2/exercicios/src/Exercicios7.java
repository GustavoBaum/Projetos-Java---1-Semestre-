import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicios7 {

    /*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais. */

    public Exercicios7() {

        Scanner teclado = new Scanner(System.in);
        
        double salario;
        double totalVendasDinheiro;

        System.out.println("Indique o seu nome: ");
        String nomeVendedor = teclado.next();
        System.out.println("Indique o valor do seu salario: ");
        salario = teclado.nextFloat();
        System.out.println("Indique o valor total das suas vendas no mes: ");
        totalVendasDinheiro = teclado.nextFloat();

        double comissao = (totalVendasDinheiro * 0.15);
        double salarioTotal = (salario + comissao);
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println(nomeVendedor + ", o valor da sua comissao é: R$" + comissao + ". Logo, seu salario total será: R$" + formatador.format(salarioTotal));
        teclado.close();

    }
    
    public static void main(String[] args) {
          
        new Exercicios7();
    

}

}
        