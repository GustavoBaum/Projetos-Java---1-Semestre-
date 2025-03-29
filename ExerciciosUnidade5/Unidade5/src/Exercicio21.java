public class Exercicio21 {
    /*Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. 
    Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.*/

    public Exercicio21() {
    double alturaChico = 1.50;
    double crescimentoChico = 0.02;
    double alturaZe = 1.10;
    double crescimentoZe = 0.03;
    int anos = 0;

    while (alturaChico > alturaZe) {
        alturaChico += crescimentoChico;
        alturaZe += crescimentoZe;
        anos += 1;
    }
    if (alturaChico < alturaZe) {
        System.out.println("A quantidade de anos necessarios para que Ze fique maior que Chico é: " + anos + "anos");
     }
    }
    public static void main(String[] args) {
        new Exercicio21();
    }
}
