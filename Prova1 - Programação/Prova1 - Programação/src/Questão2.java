import java.util.Scanner;

public class Questão2 {
   
    public Questão2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os valores de aluguel recebidos nos últimos 3 meses: ");
        System.out.println("Digite o comando do menu que lhe deseja: 'a' = valor do mes mais alto; 'b' = valor do mes mais baixo ; 'c' = valores em ordem crescente ; 'd' = media dos valores.");
        double aluguel1 = entrada.nextDouble();
        double aluguel2 = entrada.nextDouble();
        double aluguel3 = entrada.nextDouble();
        String comando = entrada.next();
        char opção = comando.toLowerCase().charAt(0);
        
        switch(opção) {
            case 'a': 
                  if (aluguel1 > aluguel2 && aluguel1 > aluguel3) {
                  System.out.println(aluguel1 + " é o valor mais alto");
                  } else if (aluguel2 > aluguel1 && aluguel2 > aluguel3) {
                    System.out.println(aluguel2 + " é o maior valor");
                  } else {
                    System.out.println(aluguel3 + " é o maior valor");
                  }
                  break;

            case 'b': 
                  if (aluguel1 < aluguel2 && aluguel1 < aluguel3) {
                  System.out.println(aluguel1 + " é o menor valor");
                  } else if (aluguel2 < aluguel1 && aluguel2 < aluguel3) {
                    System.out.println(aluguel2 + " é o menor valor");
                  } else {
                    System.out.println(aluguel3 + " é o menor valor");
                  }
                  break;

            case 'c': 
            double maior , menor , meio; 
                  if (aluguel1 > aluguel2 && aluguel1 > aluguel3) {
                      maior = aluguel1;
                  } else if (aluguel2 > aluguel1 && aluguel2 > aluguel3) {
                      maior = aluguel2;
                  } else {
                      maior = aluguel3;
                  }
                  if (aluguel1 < aluguel2 && aluguel1 < aluguel3) {
                      menor = aluguel1;
                    } else if (aluguel2 < aluguel1 && aluguel2 < aluguel3) {
                      menor = aluguel2;
                    } else {
                      menor = aluguel3;
                    }
                    if (aluguel1 > aluguel2 && aluguel1 < aluguel3) {
                        meio = aluguel1;
                    } else if (aluguel2 > aluguel3 && aluguel2 < aluguel1 || aluguel2 < aluguel3 && aluguel2 > aluguel1)  {
                        meio = aluguel2;
                    } else {
                        meio = aluguel3;
                    }
                    System.out.println(menor + " " + meio + " " + maior);
                  break;

            case 'd':
                   double media = (aluguel1 + aluguel2 + aluguel3)/3;
                   System.out.println("A media é: " + media);
            break;

            default:
                   System.out.println("Comando Invalido");
            break;
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Questão2();
    }
}
