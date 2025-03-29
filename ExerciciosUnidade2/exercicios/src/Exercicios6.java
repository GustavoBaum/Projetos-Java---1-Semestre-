import java.util.Scanner;
import java.text.DecimalFormat; 

public class Exercicios6 {

    /*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

    public Exercicios6() {

        Scanner teclado = new Scanner(System.in);
        float numeroHorasTrabalhadas;
        double valorporHora = 19.65;

        System.out.println("Indique o seu numero de funcionario: ");
        String numeroFuncionario = teclado.next();
        System.out.println("Indique o seu numero de horas trabalhadas: ");
        numeroHorasTrabalhadas = teclado.nextFloat();

        double salario = (numeroHorasTrabalhadas * valorporHora);

        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println(numeroFuncionario + ", o valor do seu salario é: R$" + formatador.format(salario));
        teclado.close();

    }

    public static void main(String[] args) {

        new Exercicios6();
    }
    
}
