import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio1 {

    /*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, 
    cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
    Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, 
    que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/

    public Exercicio1() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com as horas trabalhadas no mes: ");
        int horasMes = entrada.nextInt();
        System.out.print("Entre com o valor pago por hora: ");
        int horasValor = entrada.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        double salarioTotal = (horasMes*horasValor);

        if(horasMes > 160) {
                double salarioExtra = (horasMes - 160) * (horasValor/2);
                salarioTotal += salarioExtra;
                System.out.println("O salario extra será de: R$" + df.format(salarioExtra));
        } else {
                System.out.println("O salario é: R$ " + df.format(salarioTotal));
        }
                  
         entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio1();
    }
}