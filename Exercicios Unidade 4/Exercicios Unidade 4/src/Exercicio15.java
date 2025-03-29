import java.util.Scanner;

public class Exercicio15 {
    /*Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
    A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses. 
    Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
    O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.*/

    public Exercicio15() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Diigte a quantidade de meses em que foi admitido: ");
        int valor1 = entrada.nextInt();

        if (valor1 <= 12) {
            System.out.println("A empresa concederá um reajuste de 5% ao seu salário");
        } else if (valor1 > 13 && valor1 < 48) {
            System.out.println("A empresa concederá um reajuste de 7% ao seu salário");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio15();
    }
}
