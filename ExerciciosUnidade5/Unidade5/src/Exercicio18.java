import java.util.Scanner;
public class Exercicio18 {
    /*Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. 
    Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) 
    e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. 
    Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. 
    Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência. A leitura deve ser finalizada quando for informado canal 0.*/

    public Exercicio18() {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Informe a quantidade de casas");
      int quantidade = entrada.nextInt();
      int canal = 0;
      int quantidadePessoas4 = 0;
      int quantidadePessoas5 = 0;
      int quantidadePessoas9 = 0;
      int quantidadePessoas12 = 0;
      int audiencia4 = 0;
      int audiencia5 = 0;
      int audiencia9 = 0;
      int audiencia12 = 0;

      while (quantidade != 0)
      {
         System.out.println("Informe o numero do canal ou 0 para encerrar: ");
         canal = entrada.nextInt();
         if (canal != 0) {

         if (canal == 4) {
            System.out.println("Indique o numero de pessoas que estavam assistindo ao canal: ");
            quantidadePessoas4 = entrada.nextInt();
            audiencia4 += quantidadePessoas4;
         } else if (canal == 5) {
            System.out.println("Indique o numero de pessoas que estavam assistindo ao canal: ");
            quantidadePessoas5 = entrada.nextInt();
            audiencia5 += quantidadePessoas5;
         } else if (canal == 9) {
            System.out.println("Indique o numero de pessoas que estavam assistindo ao canal: ");
            quantidadePessoas9 = entrada.nextInt();
            audiencia9 += quantidadePessoas9;
         } else if (canal == 12) {
            System.out.println("Indique o numero de pessoas que estavam assistindo ao canal: ");
            quantidadePessoas12 = entrada.nextInt();
            audiencia12 += quantidadePessoas12;
         } else {
            System.out.println("Numero de canal inválido");
         }
        }
        System.out.println("Informe o numero do proximo canal ou 0 para encerrar: ");
        canal = entrada.nextInt();
      }
      if (canal == 0) {
         System.out.println("Não foi indicado o numero do canal.");
      } else {
 
         System.out.println();
         System.out.println("A audiencia do canal '4' é de: " + audiencia4);
         System.out.println("A audiencia do canal '5' é de: " + audiencia5);
         System.out.println("A audiencia do canal '9' é de: " + audiencia9);
         System.out.println("A audiencia do canal '12' é de: " + audiencia12);

         entrada.close();
    }
   }
    public static void main(String[] args) {
        new Exercicio18();
    }
}
