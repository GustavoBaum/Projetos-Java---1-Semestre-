import java.util.Scanner;
public class Exercicio14 {
      /*Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) 
        e o preço de venda (PV). Descreva um algoritmo que: 
            Escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), 
          onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
            Determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.*/   
    public Exercicio14() {
      Scanner entrada = new Scanner(System.in);
           double pc = 0;
           double pv = 0;
           double pcTotal = 0;
           double pvTotal = 0;
           double lucroTotal = 0;

           for (int contador = 0; contador <= 3; contador++) {

                System.out.println("Digite o preço de compra da mercadoria: ");
                pc = entrada.nextDouble();

                System.out.println("Digite o preço de venda da mercadoria: ");
                pv = entrada.nextDouble();

                double percentualLucro = (pv - pc) / (pc*100);

                if (percentualLucro < 0.001) {
                   System.out.println("Essa mercadoria proporciona um lucro de 10%");
                } else if (percentualLucro >= 0.001 && percentualLucro <= 0.002) {
                   System.out.println("Essa mercadoria proporciona um lucro entre 10% e 20%");
                } else if (percentualLucro > 0.002) {
                   System.out.println("Essa mercadoria proporciona um lucro acima de 20%");
                }
                lucroTotal += percentualLucro;
                pcTotal += pc;
                pvTotal += pv;
           }
           System.out.println("O valor total de compra é de: " + pcTotal);
           System.out.println("O valor toral de venda é de: " + pvTotal);
           System.out.println("O lucro total foi de: " + lucroTotal);
          entrada.close();
       }
       public static void main(String[] args) {
        new Exercicio14();
       }
}
