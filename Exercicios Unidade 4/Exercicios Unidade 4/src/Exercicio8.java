import java.util.Scanner;

public class Exercicio8 {
    /*Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.*/
    public Exercicio8() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a letra: ");
        String caractere = entrada.next();
        caractere = caractere.toUpperCase();
        char letra = caractere.charAt(0);

        if(letra == 'A' || letra == 'E' || letra ==  'I' || letra == 'O' || letra == 'U' ) {
                System.out.println("É vogal");
        } else {
                System.out.println("NÃO é vogal");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio8();
    }
}
