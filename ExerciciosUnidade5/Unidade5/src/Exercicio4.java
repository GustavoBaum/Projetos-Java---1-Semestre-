public class Exercicio4 {
     /*Descreva um algoritmo para calcular o valor de S dado por:
     S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30...
     Considere os 20 primeiros termos da série.*/
  public Exercicio4() {
     float S = 0;
     float numerador = 3;
     int denominador = 2;
     int progressaoDenominador = 2;
     for (int contador = 1; contador <= 20; contador++) {
          S += numerador/denominador;

          System.out.println(numerador);
          System.out.println(denominador);
          System.out.println("A soma de S é de: " + S);
          
          numerador += 2;
          denominador += + 2;
          denominador += progressaoDenominador;
     }
     
     
  }
  public static void main(String[] args) {
    new Exercicio4();
  }
}