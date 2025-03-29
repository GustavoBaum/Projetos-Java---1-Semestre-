import java.util.Scanner;

public class Exercicios7 {
    /*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
    Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.
    
            Dados: Ok
            
            Entrada: lata ; garrafa ; garrafa2

            Processo: ler lata
                      ler garrafa
                      ler garrafa2
                      litrosTotais: (lata*0.350) + (garrafa*0.600) + (garrafa2*2).

            Saída: escrever: litrosTotais  
            
            Teste: 1) lata: 2
                      garrafa: 5
                      garrafa: 1
                      litrosTotais: 5,7

                    2) lata: 7
                       garrafa: 4
                       garrafa2: 2
                       litrosTotais: 8,85
    */
    
    public Exercicios7() {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de latas de 350ml que vc deseja comprar: ");
        float lata = entrada.nextFloat();
        System.out.print("Digite a quantidade de garrafas de 600ml que vc deseja comprar: ");
        float garrafa = entrada.nextFloat();
        System.out.print("Digite a quantidade de garrafas de 2L que vc deseja comprar: ");
        float garrafa2 = entrada.nextFloat();

        double litrosTotais = (lata*0.350) + (garrafa*0.600) + (garrafa2*2);
        System.out.println("A quantidade de litros totais da sua compra é: " + litrosTotais + "L");
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios7();
    }
}
