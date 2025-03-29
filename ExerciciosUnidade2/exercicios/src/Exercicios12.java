import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicios12 {

    /*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
    p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula: */
    
    public Exercicios12() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        double x1 = entrada.nextDouble();
        System.out.println("Digite o valor de y1: ");
        double y1 = entrada.nextDouble();
        System.out.println("Digite o valor de x2: ");
        double x2 = entrada.nextDouble();
        System.out.println("Digite o valor de y2: ");
        double y2 = entrada.nextDouble();
        DecimalFormat df = new DecimalFormat("0.0000");
        
        double distancia1 = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        double distancia2 = Math.sqrt(distancia1);
        System.out.println("A distancia entre os dois pontos é: " + df.format(distancia2));
        entrada.close();

    }

    public static void main(String[] args) {
        new Exercicios12();
    }
}
