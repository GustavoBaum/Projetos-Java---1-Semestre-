public class Exercicio12 {
        /*Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:
         1
         2   3
         4   5   6 
         7   8   9   10
         11  12  13  14  15
         16  17  18  19  20  21
        */
    public Exercicio12() {
        int numero = 5;
        int a , b , c = 1;
        
        for (a = 1; a <= numero; a++) {
            
            for (b = 1; b <= a; b++) {
                
                System.out.print(c + "  ");
                c++;
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Exercicio12();
    }
}