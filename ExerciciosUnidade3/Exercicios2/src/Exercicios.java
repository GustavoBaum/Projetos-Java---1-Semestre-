import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios {
    
    /* Uma imobiliaria vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno
     
    Dados: Ok

     Entrada: largura ; comprimento.

     Processo: ler largura
               ler comprimento
               largura*comprimento.
     
     Saída: escrever: area.

     Teste: 1) comprimento: 4
               largura: 5
               area: 20

            2) comprimento: 20
               largura: 50
               area: 1000  
    */ 

    public Exercicios() {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Indique o valor da largura do seu terreno em metros: ");
    int largura = entrada.nextInt();
    System.out.println("Indique o valor do comprimento do seu terreno em metros: ");
    int comprimento = entrada.nextInt();
    double area = (largura*comprimento);
    DecimalFormat formatador = new DecimalFormat("0.00"); 

    System.out.println("A área do seu terreno é: " + formatador.format(area) + "m2");
    entrada.close();
    
    }

    public static void main(String[] args) {
        new Exercicios();
    }
}

