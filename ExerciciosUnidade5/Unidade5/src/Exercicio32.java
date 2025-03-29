import java.util.Scanner;
public class Exercicio32 {
    /*Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana correspondente. 
    A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) 
    e um inteiro especificando o número de dias que o mês possui.

Exemplo: p = 3 n = 31

D	S	T	Q	Q	S	S
        1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31	
*/

public Exercicio32() {
Scanner entrada = new Scanner(System.in);
System.out.println("Indique a posição do termo inicial (numeros entre 1 e 7): ");
int p = entrada.nextInt();
System.out.println("Indique o numero de dias do mes: ");
int n = entrada.nextInt();
System.out.println("D   S   T   Q   Q   S   S");

int dia = 1;
while (dia < p) {
    System.out.print("   ");
    dia++;
}
int contador = p;
while (contador <= n) {
    System.out.print(contador + "  ");
    if (contador % 7 == (8 - p) % 7) {
        System.out.println();
    }
    contador++;
}
entrada.close();
}
public static void main(String[] args) {
    new Exercicio32();
}
}
