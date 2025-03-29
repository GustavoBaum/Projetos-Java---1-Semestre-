import java.util.Scanner;

public class Exercicios11 {
    /*Descreva um programa que dado uma temperatura em °C informe o seu valor em °F.
     
             Dados: Ok
             
             Entrada: temperaturaCelsius

             Processo: ler temperaturaCelsius
                       temperaturaFahrenheit = ((9*temperaturaCelsius)/5) + 32

             Saída: escrever temperaturaFahrenheit.
             
             Teste: 1) temperaturaCelsius: 25
                       temperaturaFahrenheit: 77

                    2) temperaturaCelsius: 37
                       temperaturaFahrenheit: 98,6
    
    */

    public Exercicios11() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em graus °C: ");
        float temperaturaCelsius = entrada.nextFloat();

        float temperaturaFahrenheit = ((9*temperaturaCelsius)/5) + 32;
        System.out.println("A temperatura em Fahrenheit é igual a: " + temperaturaFahrenheit + "°F");
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicios11();
    }
    
}
