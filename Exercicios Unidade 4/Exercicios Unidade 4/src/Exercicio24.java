import java.util.Scanner;

public class Exercicio24 {
    /*Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

        se opção = 1, escreva os 3 valores em ordem crescente
        se opção = 2, escreva os 3 valores em ordem decrescente
        se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio*/

    public Exercicio24() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 valores: ");
        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int valor3 = entrada.nextInt();
        
        int maior, menor, meio;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }
        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }
        if ((valor1 == maior || valor1 == menor) && (valor2 == maior || valor2 == menor)) {
            meio = valor3;
        } else if ((valor1 == maior || valor1 == menor) && (valor3 == maior || valor3 == menor)) {
            meio = valor2;
        } else {
            meio = valor1;
        }
        System.out.print("Digite 1 para 'ordem crescente', 2 para 'ordem decrescente' e 3 para o 'maior no meio': ");
        int opção = entrada.nextInt();
        switch (opção) {
           case 1: System.out.println("Ordem crescente");
                   System.out.println(menor + " " + meio + " " + maior);
                   break;
           case 2: System.out.println("Ordem decrescente");
                   System.out.println(maior + " " + meio + " " + menor);
                   break;
           case 3: System.out.println("Maior no meio");
                   System.out.println(menor + " " + maior + " "  + meio);
                   break;
              
           default: System.out.println("Opção Invalida"); 
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio24();
    }
}
