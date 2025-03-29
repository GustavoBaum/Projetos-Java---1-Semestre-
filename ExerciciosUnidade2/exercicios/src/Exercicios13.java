import java.util.Scanner;

public class Exercicios13 {
    /*Dois carros (X e Y) partem em uma mesma direção. 
    O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. 
    Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos. 
    Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro. */
    
    public Exercicios13() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique a distancia que o carro Y se encontra ao carro X em Km: ");
        double distanciaCarroY = entrada.nextDouble();

        double calculo = 2*(distanciaCarroY - 60);
        System.out.println("O tempo, em minutos, que o carro Y leva para tomar essa distancia do carro X é: " + calculo + "min");
        entrada.close();
        
    }

    public static void main(String[] args) {
        new Exercicios13();
    }
}
