import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio23 {
    /*Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
    que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde, 
    para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) 
    e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. 
    Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. 
    O número de produtos (n) de cada vendedor deve ser informado.*/

    public Exercicio23() {
       Scanner entrada = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("0.00");

        char continuar;
        
        do {
            System.out.println("Digite o nome do vendedor:");
            String nome = entrada.nextLine();
            
            System.out.println("Digite o número de produtos vendidos:");
            int numeroProdutos = entrada.nextInt();
            
            double totalVendas = 0;
            for (int i = 1; i <= numeroProdutos; i++) {
                System.out.println("Digite o preço unitário do produto " + i + ":");
                double precoUnitario = entrada.nextDouble();
                
                System.out.println("Digite a quantidade vendida do produto " + i + ":");
                int quantidade = entrada.nextInt();
                
                totalVendas += precoUnitario * quantidade;
            }
            
            double salario = totalVendas * 0.30; 
            
            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + df.format(salario));
            
            System.out.println("Deseja digitar os dados de mais um vendedor? (s/n)");
            continuar = entrada.next().charAt(0);
            entrada.nextLine(); 
            
        } while (continuar == 's' || continuar == 'S');

        entrada.close();

    }
    public static void main(String[] args) {
        new Exercicio23();
    }
}

