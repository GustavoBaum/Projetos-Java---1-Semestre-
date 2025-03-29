import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio34 {
    /*Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

R$ 7,50 por diária, caso o número de diárias seja menor que 15;
R$ 6,50 por diária, caso o número de diárias seja igual a 15;
R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

(1) encerrar a conta de um hóspede;
(2) verificar número de contas encerradas;
(3) sair.
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. 
Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). 
Caso a opção escolhida seja a terceira finalize a execução do algoritmo.*/

public Exercicio34() {
Scanner entrada = new Scanner(System.in);
int codigo = 0;
String nome = "";
int numeroDiarias = 0;
double totalPagar = 0;
int numeroHospedes = 0;
DecimalFormat df = new DecimalFormat("0.00");

do {
System.out.println("Digite o código (1), (2) ou (3): ");
codigo = entrada.nextInt();
switch (codigo) {
    case 1: System.out.println("Informe o nome do hóspede: ");
            nome = entrada.next();
            numeroHospedes += 1;
            System.out.println("Informe a quantidade de diárias do hóspede citado: ");
            numeroDiarias = entrada.nextInt();
            if (numeroDiarias < 15) {
                totalPagar = numeroDiarias * 7.50;
            } else if (numeroDiarias == 15) {
                totalPagar = numeroDiarias * 6.50;
            } else if (numeroDiarias > 15) {
                totalPagar = numeroDiarias * 5.00;
            } else {
                System.out.println("Numero de diarias inválidos");
            }
            totalPagar += 50;
            System.out.println("Hóspede: " + nome + ", total a ser pago: R$ " + df.format(totalPagar));
    break;

    case 2: System.out.println("Numero de hóspedes que deixaram o hotel: " + numeroHospedes);
    break;

    case 3: System.out.println("Finalizando...");
    break;

    default: System.out.println("Codigo incorreto, tente novamente.");
 }
} while (codigo != 3);
entrada.close();
}
public static void main(String[] args) {
    new Exercicio34();
}
}
