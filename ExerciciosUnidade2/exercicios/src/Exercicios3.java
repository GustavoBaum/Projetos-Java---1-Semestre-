import java.util.Scanner;
public class Exercicios3 {   

    //Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π.

    public Exercicios3() {
        
        Scanner teclado = new Scanner(System.in);
        
        float raio;
        double PI = Math.PI;
        System.out.println("Indique o valor do raio da circunferência: ");
        raio = teclado.nextFloat();

        double area = Math.pow(raio, 2) * PI;
    
        System.out.println("A area da circunferencia descrita com os valores acima é:" + area + "m2");
        teclado.close();

    }

    public static void main(String[] args) {
        new Exercicios3();
    
    }
    
}
