import java.util.Scanner;

public class Exercicios16 {
    /*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, 
    faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
    Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos. 
    
           Dados: Ok

           Entrada: valorFinal ; valor 

           Processo: ler valorFinal
                     ler valor
                     valorTroco1 = (valor - valorFinal)
                     valorC = (valorTroco1/100)
                     valorTroco1 -= valorC*100
                     valorD = (valorTroco1/10)
                     valorTroco1 -= valorD*10
                     valorU = (valorTroco1/1)
                     valorTroco1 -= valorU*1
                     valorT = (valorC+valorD+valorU)

                     int valorTroco2 = (valor - valorFinal)
                     int notas100 = (valorTroco2/100)
                     valorTroco2 -= notas100*100
                     int notas10 = (valorTroco2/10)
                     valorTroco2 -= notas10*10
                     int notas1 = (valorTroco2/1)
                     valorTroco2 -= notas1*1
           
            Saída: escrever valorT
                   escrever notas100
                   escrever notas10
                   escrever notas1
                   
            Teste: 1) valorFinal: 279
                      valor: 300
                      O número mínimo de notas que o caixa deve fornecer como troco é: 3
                      O número de notas de R$100,00 a ser fornecido como troco é: 0
                      O número de notas de R$10,00 a ser fornecido como troco é: 2
                      O número de notas de R$1,00 a ser fornecido como troco é: 1
                   
                      2) valorFinal: 689
                      valor: 800   
                      O número mínimo de notas que o caixa deve fornecer como troco é: 3
                      O número de notas de R$100,00 a ser fornecido como troco é: 1
                      O número de notas de R$10,00 a ser fornecido como troco é: 1
                      O número de notas de R$1,00 a ser fornecido como troco é: 1
    */ 

    public Exercicios16() {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor final da compra: R$");
        int valorFinal = entrada.nextInt();
        System.out.print("Digite o valor que dispoem: R$ ");
        int valor = entrada.nextInt();


        int valorTroco1 = (valor - valorFinal);
        int valorC = (valorTroco1/100);
        valorTroco1 = valorTroco1%100;
        int valorD = (valorTroco1/10);
        valorTroco1 = valorTroco1%10;
        int valorU = (valorTroco1/1);
        valorTroco1 = valorTroco1%1;
        int valorT = (valorC+valorD+valorU);

        int valorTroco2 = (valor - valorFinal);
        int notas100 = (valorTroco2/100);
        valorTroco2 = valorTroco2%100;
        int notas10 = (valorTroco2/10);
        valorTroco2 = valorTroco2%10;
        int notas1 = (valorTroco2/1);
        valorTroco2 = notas1%1;
        System.out.println("O número mínimo de notas que o caixa deve fornecer como troco é: " + valorT);
        System.out.println("O número de notas de R$100,00 a ser fornecido como troco é: " + notas100);
        System.out.println("O número de notas de R$10,00 a ser fornecido como troco é: " + notas10);
        System.out.println("O número de notas de R$1,00 a ser fornecido como troco é: " + notas1);
        entrada.close();
    }

    public static void main(String[] args) {
        new Exercicios16();
    }
}
