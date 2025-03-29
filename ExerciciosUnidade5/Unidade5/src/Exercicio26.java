import java.util.Scanner;

public class Exercicio26 {
    /*Astolfo resolveu fazer uma viagem para conhecer o nosso país Ele pretende visitar várias cidades, dividindo assim a viagem em vários trechos. 
    Entretanto Astolfo se nega a passar por estradas cujo custo do pedágio exceda um determinado valor. Faça um programa que leia inicialmente o valor do pedágio 
    ao qual Astolfo se nega a pagar. A seguir leia várias duplas de valores representando respectivamente o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:

    quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo nega­se a pagar;
    quantos trechos foram informados;
    quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar.
    OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo. Neste caso a leitura da distância não deve ser executada. 
    Os resultados devem ser impressos no final do programa.

    Exemplo de entrada:

     Valor máximo de pedágio: 7,00
     Pedágio	    Distância
     R$ 6,50	       200
     R$ 5,00	        70
     R$ 10,00	        80
     R$ 12,00	       250
     R$ 4,00	       180
     R$ 15,00	        30
                        -1	
Saída para o exemplo de entrada:

3 (trechos com valor acima do qual ele nega-se a pagar);
6 (quantidade de trechos informados);
2 (trechos acima de 150km com valor aceito por ele).*/

public Exercicio26() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor máximo de pedágio:");
        double valorMaxPedagio = entrada.nextDouble();

        int trechosAcimaMaxPedagio = 0;
        int totalTrechos = 0;
        int trechosAcima150Km = 0;

        while (true) {
            System.out.println("Pedágio (ou -1 para encerrar):");
            double custoPedagio = entrada.nextDouble();

            if (custoPedagio < 0) {
                break;
            }

            totalTrechos++;

            if (custoPedagio > valorMaxPedagio) {
                trechosAcimaMaxPedagio++;
            }

            if (custoPedagio <= valorMaxPedagio) {
                System.out.println("Distância (em Km):");
                int distancia = entrada.nextInt();

                if (distancia > 150) {
                    trechosAcima150Km++;
                }
            }
        }
        System.out.println(trechosAcimaMaxPedagio + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosAcima150Km + " (trechos acima de 150km com valor aceito por ele)");
        entrada.close();
}
public static void main(String[] args) {
    new Exercicio26();
 }
}
