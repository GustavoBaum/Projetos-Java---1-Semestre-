import java.util.Scanner;

public class Exercicio16 {
    /*Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). 
    Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.*/

    public Exercicio16() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da idade de 2 homens e duas mulheres, respectivamente (todas as idades necessitam de ser diferentes): ");
        int idadeHomem1 = entrada.nextInt();
        int idadeHomem2 = entrada.nextInt();
        int idadeMulher1 = entrada.nextInt();
        int idadeMulher2 = entrada.nextInt();
         
        if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2) {
            int calculo1 = idadeHomem1+idadeMulher2;
            int calculo2 = idadeHomem2*idadeMulher1;
            System.out.println(calculo1 + " ; " + calculo2 );
         }
         
        if (idadeHomem1 < idadeHomem2 && idadeMulher1 < idadeMulher2) {
            int calculo3 = idadeHomem2+idadeMulher1;
            int calculo4 = idadeHomem1*idadeMulher2;
            System.out.println(calculo3 + " ; " + calculo4 );
         } 
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio16();
    }
}
