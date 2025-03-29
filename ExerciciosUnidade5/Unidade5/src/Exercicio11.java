import java.text.DecimalFormat;
public class Exercicio11 {
        /*Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, 
         na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. 
         Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).*/
    public Exercicio11() {
         double soma = 0;
         DecimalFormat df = new DecimalFormat("0.0");
         for (int quantidade = 0; quantidade <= 16; quantidade++) {
              soma = Math.pow(3, 15)+1;
        }
        System.out.println("O numero total de biscoitos quebrados no dia é: " + df.format(soma));
    }
    public static void main(String[] args) {
        new Exercicio11();
    }
}
