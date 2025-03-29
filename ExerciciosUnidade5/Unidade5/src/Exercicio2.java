public class Exercicio2 {

    /*Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.*/
    public Exercicio2() {
         int somaPar  = 0;
         int somaImpar = 0;
         for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                somaPar += numero; 
            } else {
                somaImpar += numero;
            }
         }
         System.out.println("Soma dos numeros pares: " + somaPar);
         System.out.println("Soma dos numeros impares: " + somaImpar);
    }
    public static void main(String[] args) {
        new Exercicio2();
    }
}
