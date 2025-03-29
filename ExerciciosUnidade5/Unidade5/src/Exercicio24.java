import java.util.Scanner;

public class Exercicio24 {
    /*Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. 
    Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. 
    Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. 
    Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: 
    “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.*/

    public Exercicio24() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o limite diário de peso (em quilogramas):");
        double limiteDiario = entrada.nextDouble();
        limiteDiario *= 1000; 

        double pesoTotal = 0;

        char continuar;
        do {
            System.out.println("Digite o peso do próximo peixe (em gramas):");
            double pesoPeixe = entrada.nextDouble();

            pesoTotal += pesoPeixe;

            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário de peso excedido! Encerrando o programa");
                break;
            }

            System.out.println("Peso total da pesca até agora: " + pesoTotal + " gramas");

            System.out.println("Deseja informar o peso de mais um peixe? (s/n)");
            continuar = entrada.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        entrada.close();

    }
    public static void main(String[] args) {
        new Exercicio24();
    }
}
