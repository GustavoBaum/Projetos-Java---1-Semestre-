import java.util.Scanner;
public class Exercicio33 {
    /*Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. Os dados utilizados para votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.
Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção correto. 
Para interromper a operação, o usuário poderá fornecer o número 0.

*/

public Exercicio33() {
Scanner entrada = new Scanner(System.in);
int codigo = 0;
int voto1 = 0;
int voto2 = 0;
int voto3 = 0;
int voto4 = 0;
int voto5 = 0;
int voto6 = 0;
do {
    System.out.println("Digite o codigo do candidato: ");
    codigo = entrada.nextInt();

    switch (codigo) {
        case 1: voto1 += 1;
        break;

        case 2: voto2 += 1;
        break;

        case 3: voto3 += 1;
        break;

        case 4: voto4 += 1;
        break;

        case 5: voto5 += 1;
        break;

        case 6: voto6 += 1;
        break;

        default: System.out.println("Opção incorreta");
     }
    } 
    while (codigo != 0);
    
    int votosTotais = voto1 + voto2 + voto3 + voto4 + voto5 + voto6;
   
    System.out.println();
    System.out.println("Quantidade de votos para candidato '1': " + voto1);
    System.out.println("Quantidade de votos para candidato '2': " + voto2);
    System.out.println("Quantidade de votos para candidato '3': " + voto3);
    System.out.println("Quantidade de votos para candidato '4': " + voto4);
    System.out.println("Quantidade de votos nulos: " + voto5);
    System.out.println("Quantidade de votos em branco: " + voto6);

    double percentualNulos = (voto5 / votosTotais) * 100;
    double percentualBrancos = (voto6 / votosTotais) * 100;

    System.out.println("Percentual de votos nulos sobre o total: " + percentualNulos);
    System.out.println("Percentual de votos brancos sobre o total: " + percentualBrancos);
    entrada.close();
}
public static void main(String[] args) {
    new Exercicio33();
}
}
