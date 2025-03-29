import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios9 {
    /*Descreva um programa que calcule o volume de uma lata de óleo.
      
          Dados: Ok

          Entrada: raio ; altura.

          Processo: ler raio
                    ler altura
                    areaBase = Math.pow(raio,2);
                    volume: (areaBase*altura)*PI

          Saída: escrever volume 
          
          Teste: 1) raio: 4
                    altura: 10
                    voulme: 502,65

                 2) raio: 16
                    altura: 32
                    volume: 25735,93

    */
    
    public Exercicios9() {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio da base: ");
        double raio = entrada.nextDouble();
        System.out.print("Digite o valor da altura da lata: ");
        double altura = entrada.nextDouble();
        double PI = Math.PI;
        DecimalFormat df = new DecimalFormat("0.00");

        double areaBase = Math.pow(raio, 2);
        double volume = (areaBase*altura)*PI;
        System.out.println("O volume da lata de óleo com as dimensões descritas acima é: " + df.format(volume) + "m3");
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios9();
    }
}
