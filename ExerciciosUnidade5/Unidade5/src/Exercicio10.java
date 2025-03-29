public class Exercicio10 {
    /*O número 3025 possui a seguinte característica:
        30 + 25 = 55 --> 55^2 = 3025

      Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:

        20 + 25 = 45 --> 45^2 = 2025
    */
    public Exercicio10() {
     int soma = 0;
     double potenciaçao = 0;

     for (int numero = 0; numero <= 10; numero++) {
         soma  = numero + 25;
         potenciaçao = Math.pow(soma, 2);
         System.out.println(numero + " + 25 = " + soma + " --> " + soma + "^2 = " + potenciaçao);
     }
}
    public static void main(String[] args) {
        new Exercicio10();
    }
}
