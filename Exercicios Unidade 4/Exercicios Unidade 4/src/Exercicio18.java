import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio18 {
    /*Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, 
    o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, 
    e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, 
    o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. 
    Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.*/

    public Exercicio18() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do pagamento, o dia do vencimento e o dia do pagamento, respectivamente: ");
        double valorPagamento = entrada.nextDouble();
        int diaVencimento = entrada.nextInt();
        int diaPagamento = entrada.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");

        if (diaPagamento <= diaVencimento) {
            double desconto = valorPagamento - (valorPagamento*0.10);
            System.out.println("O valor fica: R$" + df.format(desconto) + "O pagamento está em dia");
        } 
        
        if (diaPagamento <= diaVencimento+5) {
            System.out.println("Você perdeu o seu desconto");
        } 
        
        if (diaPagamento > diaVencimento+5) {
            double valorPrestação = ((diaPagamento-diaVencimento+5)*0.02)*valorPagamento;
            System.out.println("A multa total é: R$" + df.format(valorPrestação));
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio18();
    }
}
