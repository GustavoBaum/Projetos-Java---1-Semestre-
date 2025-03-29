public class Exercicio3 {
    /*Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:*/
    public Exercicio3() {
        float soma = 0;   
        for (int contador = 1; contador <= 100; contador++) {
             soma  = soma + 1f/contador;
             System.out.println("1/"+ contador + ", ");
    }
        System.out.println();    
        System.out.println("Soma = " + soma);
    }
    public static void main(String[] args) {
        new Exercicio3();
    }
}
