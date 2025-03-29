import java.util.Scanner;

public class Exercicio3{

    /*Modele a solução de um problema para calcular a área de uma sala retangular.
    Considere que as medidas estão expressas em metros*/
    
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        float altura;
        float largura;

        System.out.println("Digite a altura em metros: ");
        altura = teclado.nextFloat();
        
        System.out.println("Digite a largura em metros: ");
        largura = teclado.nextFloat();

        float área = (altura * largura); 

        System.out.println("A área da sala é " + área + "m2");
        
        teclado.close();
    
    }


}