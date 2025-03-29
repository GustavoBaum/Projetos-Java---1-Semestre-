import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio17 {
    /*Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o número de dependentes do contribuinte. 
    A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte. 
    O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. 
    Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; 
    para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. 
    Rendas superiores a R$ 10.000,00 pagam 15% de imposto.*/

    public Exercicio17() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua renda atual e seu número de depentes: ");
        double rendaAtual = entrada.nextDouble();
        int dependentes = entrada.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        double rendaLiquida = rendaAtual - (rendaAtual*(dependentes*0.02));
        
        if (rendaLiquida <= 2.000) {
            System.out.println("Não paga imposto");
        } else if (rendaLiquida > 2.000 && rendaLiquida <= 5.000) {
            System.out.println("O imposto total é de: R$" + df.format(rendaLiquida));
        } else if (rendaLiquida >= 5.000 && rendaLiquida <= 10.000) {
            double imposto1 = rendaLiquida*0.10;
            System.out.println("O imposto total é de: R$" + df.format(imposto1));
        } else if (rendaLiquida > 10.000) {
            double imposto2 = rendaLiquida*0.15;
            System.out.println("O imposto total é de: R$" + df.format(imposto2));
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio17();
    }
}
