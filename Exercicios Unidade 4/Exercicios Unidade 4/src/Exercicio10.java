import java.util.Scanner;

public class Exercicio10 {
    /*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
    Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.*/

    public Exercicio10() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a idade de Marquinhos: ");
        int idadeM = entrada.nextInt();
        System.out.print("Digite a idade de Zezinho: ");
        int idadeZ = entrada.nextInt();
        System.out.print("Digite a idade de Luluzinha: ");
        int idadeL = entrada.nextInt();
        
        if (idadeM > idadeZ) {
             System.out.println("Zezinho é o caçula da família");
        } else if (idadeZ > idadeL) {
             System.out.println("Luluzinha é a caçula da família");
        } else if (idadeM > idadeL) {
             System.out.println("Marquinhos é o caçula da família");
        } else if (idadeM < idadeZ) {
             System.out.println("Marquinhos é o caçula da família");
        } else if (idadeZ < idadeL) {
             System.out.println("Luluzinha é a  caçula da família");
        } else if (idadeZ < idadeM) {
             System.out.println("Zezinho é o caçula da família");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio10();
    }
}
