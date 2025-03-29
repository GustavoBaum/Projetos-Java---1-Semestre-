import java.util.Scanner;

public class Questão3 {
    public Questão3() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Codigo = ");
        String codigoLetra = entrada.next();
        char codigo = codigoLetra.toUpperCase().charAt(0);
        
        if (codigo == 'B') {
            System.out.println("BYD"); 
        } else if (codigo == 'J') {
            System.out.println("JAC");
        } else if (codigo == 'C') {
            System.out.println("Caoa");
        } else {
            System.out.println("Entrada Inválida");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Questão3();
    }
}

