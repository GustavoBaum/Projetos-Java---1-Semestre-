import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio21 {
    /*O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. 
    O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:
         IMC = massa/altura^2   
    Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:

            IMC	       Classificação
             < 18.5	     Magreza
        18.5 - 24.9	     Saudável
        25.0 - 29.9	     Sobrepeso
        30.0 - 34.9	     Obesidade Grau I
        35.0 - 39.9	     Obesidade Grau II (severa)
            >= 40.0	     Obesidade Grau III (mórbida)*/

    public Exercicio21() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu peso, em kg, e a sua altura, em metros: ");
        double peso = entrada.nextDouble();
        double altura = entrada.nextDouble();
        DecimalFormat df = new DecimalFormat("0.0");

        double IMC = peso/Math.pow(2,altura);
        System.out.println("O seu IMC é: " + df.format(IMC));

        if (IMC < 18.5) {
            System.out.println("Classificação: Magreza");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("Classificação: Saudável");
        } else if (IMC > 25.0 && IMC < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (IMC > 30.0 && IMC < 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (IMC > 35.0 && IMC < 39.9) {
            System.out.println("Classificação; Obesidade Grau II (severa)");
        } else if (IMC >= 40.0) {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio21();
    }
}
