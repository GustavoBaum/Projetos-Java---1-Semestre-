import java.util.Scanner;
public class Exercicios4 {

    //Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.
    
    public Exercicios4() {
    
    Scanner teclado = new Scanner(System.in);
    float nota1;
    float nota2;

    System.out.println("Indique o valor da primeira nota: ");
    nota1 = teclado.nextFloat();

    System.out.println("Indique o valor da segunda nota: ");
    nota2 = teclado.nextFloat();

    double media = (nota1 * 0.35) + (nota2 * 0.75);
    System.out.println("A media é igual a: " + media);
    teclado.close();

    }
    
    public static void main(String[] args) {
        new Exercicios4();
    }

}
