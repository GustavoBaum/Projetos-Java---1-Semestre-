import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicios14 {
    /*Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de final de semana, 
    calcule a velocidade média e a quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.
    
            Dados: Ok

            Entrada: distancia ; tempo

            Processo: ler distancia
                      ler tempo
                      vm = (distancia/tempo)
                      qc = (distancia/12)

            Saída: escrever vm 
                   escrever qc
                   
            Teste: 1) distancia = 120
                      tempo = 30
                      vm = 4.0
                      qc = 10
                      
                    2) distancia = 370
                       tempo = 4
                       vm = 92.5
                       qc = 30.83  
    */
    
    public Exercicios14() {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a distância, em km, percorrida durante sua viagem: ");
        float distancia = entrada.nextFloat();
        System.out.print("Digite o tempo, em horas, gasto em sua viagem: ");
        double tempo = entrada.nextDouble(); 
        DecimalFormat df = new DecimalFormat("0.00");    
        
        double vm = (distancia/tempo);
        double qc = (distancia/12);
        System.out.println("A velocidade média foi de: " + vm + "km/h. E a quantidade de gasolina gasta foi de: " + df.format(qc) + "L");
        entrada.close();
 
   }

   public static void main(String[] args) {
    new Exercicios14();
   }
}
