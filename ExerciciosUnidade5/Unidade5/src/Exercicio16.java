import java.util.Scanner;
public class Exercicio16 {
    /*Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero 
    (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe 
    a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.*/

    public Exercicio16() {
        Scanner entrada = new Scanner(System.in);
        
        int totalPessoas = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTotal = 0;
        int quantidadeMulheres = 0;

        System.out.println("Digite a altura da pessoa ou 0 para encerrar:");
        double altura = entrada.nextDouble();
        while (altura != 0) {
            System.out.println("Digite o gênero da pessoa ('M' para masculino, 'F' para feminino, 'O' para outro):");
            char genero = entrada.next().toUpperCase().charAt(0);

            if (genero == 'F') {
                somaAlturaMulheres += altura;
                quantidadeMulheres++;
            }
            
            somaAlturaTotal += altura;
            totalPessoas++;

            System.out.println("Digite a altura da próxima pessoa ou 0 para encerrar:");
            altura = entrada.nextDouble();
        }

        if (totalPessoas == 0) {
            System.out.println("Nenhuma pessoa foi informada.");
        } else {
            double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
            double mediaAlturaTotal = somaAlturaTotal / totalPessoas;

            System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
            System.out.println("Média de altura do grupo: " + mediaAlturaTotal);
        }

        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio16();
    }
}
    

