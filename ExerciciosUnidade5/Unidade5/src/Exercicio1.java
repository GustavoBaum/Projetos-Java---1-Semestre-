public class Exercicio1 {

    /*Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.*/
    public Exercicio1() {
         for (int numero = 0; numero <= 20; numero++) {
             if (numero % 2 == 0) {
                System.out.println(numero + "-> numero par");
         } else {
                System.out.println(numero + "-> numero impar");
         }
    }
         
}
    public static void main(String[] args) {
        new Exercicio1();
    }
}
