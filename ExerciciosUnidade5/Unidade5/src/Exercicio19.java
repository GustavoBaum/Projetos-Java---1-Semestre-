import java.util.Scanner;
public class Exercicio19 {
    /*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. 
    O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. 
    Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. 
    A leitura deve ser finalizada com a leitura 0 para o valor da compra.*/

    public Exercicio19() {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Indique o valor da compra ou 0 para encerrar: ");
      int valor = entrada.nextInt();
      double desconto = 0;
      double valorTotal = 0; 
      int totalCompras = 0;

      while (valor != 0)
      {
        if (valor > 500) {
            desconto = valor*0.20; 
            desconto = valor - desconto;
            valorTotal += desconto;
            System.out.println("O valor da compra é: R$" + desconto);
        } else if (valor <= 500) {
            desconto = valor*0.15;
            desconto = valor - desconto;
            valorTotal += desconto;
            System.out.println("O valor da compra é: R$" + desconto);
        } 
        
        valorTotal++;
        totalCompras++;

        System.out.println("Indique o valor da proxima compra ou 0 para encerrar: ");
            valor = entrada.nextInt();
      }
      if (totalCompras == 0) {
        System.out.println("Nenhum valor foi apresentado.");
      } else {
        System.out.println("O valor total recebido pela loja no final do dia é de: R$" + valorTotal);
      }
      entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio19();
    }
}
