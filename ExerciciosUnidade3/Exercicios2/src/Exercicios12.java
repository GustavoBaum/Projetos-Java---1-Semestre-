import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios12 {
     /*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
     A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos 
     descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
     Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
     
           Dados: Ok
           
           Entrada: nome ; horasTrabalhadas ; dependentes

           Processo: ler nome
                     ler horasTrabalhadas
                     ler dependentes
                     salarioBruto1 = (horasTrabalhadas*10) + (dependentes*60)
                     salarioLiquido = (salarioBruto1) * 0.87

           Saídas:   escrever salarioBruto
                     escrever salarioLiquido
                     
           Testes: 1) horasTrabalhadas = 250
                      dependentes = 4
                      salarioBruto = 2740,00
                      salarioLiquido = 2383,00
                      
                   2) horasTrabalhadas = 300
                      dependentes = 2
                      salarioBruto = 3120,00
                      salarioLiquido = 2714,40
     */

     public Exercicios12() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = entrada.next();
        System.out.print("Informe o seu numero de horas mensais trabalhadas: ");
        float horasTrabalhadas = entrada.nextFloat();
        System.out.print("Informe o numero de dependentes: ");
        float dependentes = entrada.nextFloat();
        DecimalFormat df = new DecimalFormat("0.00");

        double salarioBruto1 = (horasTrabalhadas*10) + (dependentes*60);
        double salarioLiquido = (salarioBruto1) * 0.87;
        System.out.println(nome + ", o valor do seu salario bruto é: R$" + df.format(salarioBruto1) + ". O valor do seu salario liquido é: R$" + df.format(salarioLiquido));
        entrada.close();
     }
     public static void main(String[] args) {
        new Exercicios12();
     }
    
}
