import java.util.Scanner;
public class Exercicio31 {
    /*Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo abaixo:

número	decomposição
180	         2
90	         2
45	         3
15	         3
5	         5
1	
*/

public Exercicio31() {
Scanner entrada = new Scanner(System.in);
System.out.println("Informe o numero a ser decomposto (o numero deve ser positivo): ");
int numero = entrada.nextInt();
System.out.println("Numero     Decomposição");

int divisor = 2;
while (numero > 1) {
    if (numero % divisor == 0) {
        System.out.println(numero + "             " + divisor);
    numero /= divisor;
    } else {
        divisor++;
    }
}
System.out.println("1                   ");
entrada.close();
}
public static void main(String[] args) {
    new Exercicio31();
 }
}
