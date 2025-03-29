import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio13 {
       /*Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, 
       o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, 
       foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
       Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. Calcule e escreva:

         A quilometragem obtida por litro de combustível em cada parada;
         A quilometragem média obtida por litro de combustível em toda a viagem.*/
    public Exercicio13() {
      Scanner entrada = new Scanner(System.in);
        double odometro = 0;
        int litragem = 0;
        double quilometragemMedia = 0;
        DecimalFormat df = new DecimalFormat("0,0");
        System.out.println("Indique a quantidade de paradas realizadas durante a viagem: ");
        float quantidade = entrada.nextInt();
        for (int contador = 0; contador < quantidade; contador++) {
          System.out.println("Indique o valor do odometro, em km/h: ");
          odometro = entrada.nextDouble();
          System.out.println("Indique a quantidade de combustivel que foi comprado, em litros: ");
          litragem = entrada.nextInt();
          double quilometragem = odometro/litragem;
          System.out.println("A quilometragem obtida por litro de combustivel nesta parada foi de: " + df.format(quilometragem) + "km");
          quilometragemMedia += quilometragem;
          quilometragemMedia = quilometragem/quantidade;
        }
        System.out.println("A quilometragem media obtida por litro de combustivel em toda a viagem foi de: " + df.format(quilometragemMedia) + "km");
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio13();
    }
}
