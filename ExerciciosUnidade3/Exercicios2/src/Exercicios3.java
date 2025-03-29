import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios3 {

    /*Um motorista deseja abastecer seu tanque de combustivel. 
    Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque 
            
              Dados: Ok
          
              Entrada: preçoGasolina ; deposito.

              Processo: ler preçoGasolina
                        ler deposito
                        q1 = deposito/preçoGasolina
              
              Saída: escrever: q1 
              
              Teste: 1) preçoGasolina: 6,09
                        deposito: 150,00
                        q1 = 24,6

                     2) preçoGasolina: 5,93  
                        deposito: 250
                        q1: 42,2

    */

    public Exercicios3() {

       Scanner entrada = new Scanner(System.in);

       System.out.print("Indique o preço da gasolina no posto em que esteja abastecendo: R$");
       double preçoGasolina = entrada.nextDouble();
       System.out.print("Qual o valor que deseja depositar: R$");
       double deposito = entrada.nextDouble();

       double ql = (deposito/preçoGasolina);
       DecimalFormat df = new DecimalFormat("0.0");

       System.out.println("Foi adicionado " + df.format(ql) + " litros ao seu tanque de combustivel");
       entrada.close();

    }
    
    public static void main(String[] args) {
        new Exercicios3();
        }
}
