import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios5 {
    /*Uma granja possui um controle automatizado de cada frango da sua produção. 
    No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
    Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos. 
     
             Dados: Ok

             Entrada: frangos.

             Processo: ler frangos;
                       custoTotal = (frangos*11)
                       
             Saída: escrever: custoTotal
             
             Teste: 1) frangos: 50
                       custoTotal: 550,00

                    2) frangos: 378
                       custoTotal: 4158,00   
    */
    
    public Exercicios5(){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero total de frangos sendo criados na sua granja: ");
        int frangos = entrada.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");

        int custoTotal = (frangos*11);
        System.out.println("O custo total de anéis para sua granja é de: R$" + df.format(custoTotal));
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios5();
    }
}
