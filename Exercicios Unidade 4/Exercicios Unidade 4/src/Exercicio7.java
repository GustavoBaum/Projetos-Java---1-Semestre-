import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio7 {
    /*O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
    As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, 
    em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.*/
   
    public Exercicio7() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o peso da carta, em gramas: ");
        int peso = entrada.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        if (peso <= 50) {
            System.out.println("O custo do selo é de R$ 0,45.");
        } else {
            float pesoExcedido = peso - 50;
            float qAdicional = (pesoExcedido / 20) + 1;
            float valorPagar = 0.45f + 0.45f * qAdicional;
            System.out.println("Custo do selo: R$" + df.format(valorPagar));
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio7();
    } 
}
