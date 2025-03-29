import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios13 {
    /*Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
    Faça um programa para ler o comprimento e altura de uma parede (em metros), 
    e depois escrever o valor gasto com a compra de azulejos. 
    Considere que um metro quadrado é formado por 9 azulejos
    
           Daos: Ok
           
           Entradas: comprimento ; altura

           Processo: ler comprimento
                     ler altura
                     area = (comprimento*altura)
                     qtAzulejos = (area/9)
                     valor = (qtAzulejos*112.5)

            Saída: escrever valor
            
            Teste: 1) comprimento = 20
                      altura = 3
                      valor = 750,00

                   2) comprimento = 15
                      altura = 5
                      valor = 937,50   
    */
    
    public Exercicios13() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do comprimento da sua parede em metros: ");
        double comprimento = entrada.nextDouble();
        System.out.print("Digite o valor da altura da sua parede em metros: ");
        double altura = entrada.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        
        double area = (comprimento*altura);
        double qtAzulejos = (area/9);
        double valor = (qtAzulejos*112.5);

        System.out.println("O valor de azulejos para satisfazer suas necessidades é: R$" + df.format(valor));

        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios13();
    }
}
