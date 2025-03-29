import java.text.DecimalFormat;
public class Exercicio22 {
    /*Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. 
    A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.*/

    public Exercicio22() {
     int ano = 1995;
     double salario = 2000;
     double aumento = 0.015;
     DecimalFormat df = new DecimalFormat("0.00");

     while (ano < 2024) {
        salario += salario*aumento;

        aumento *= 2;

        ano++;
     }
     System.out.println("O salario atual do funcionario é de: R$ " + df.format(salario));
    }
    public static void main(String[] args) {
        new Exercicio22();
    }
}
