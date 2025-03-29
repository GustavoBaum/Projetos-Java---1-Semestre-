import java.util.Scanner;

public class Exercicio11 {
    /*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
    Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.*/
        public Exercicio11() {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite o ano de nascimento do primeiro irmão: ");
            int ano1 = entrada.nextInt();
            System.out.print("Digite o ano de nascimento do segundo irmão: ");
            int ano2 = entrada.nextInt();
            System.out.print("Digite o ano de nascimento do terceiro irmão: ");
            int ano3 = entrada.nextInt();

            if (ano1 == ano2 && ano1 != ano3) {
                System.out.println("GÊMEOS");
            } else if (ano2 == ano3 && ano3 != ano1) {
                System.out.println("GÊMEOS");
            } else if (ano1 == ano2 && ano2 == ano3 ){
                System.out.println("TRIGÊMIOS");
            } else {
                System.out.println("IRMÃOS");
            }

            entrada.close();
        }
        public static void main(String[] args) {
            new Exercicio11();
        }
}  
