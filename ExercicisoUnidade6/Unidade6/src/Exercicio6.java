import java.util.Scanner; 
public class Exercicio6 {
    /*Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. 
    Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. Após ter preenchido o vetor, 
    solicite que o usuário informe um outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor. 
    Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.*/
    public Exercicio6() {
     Scanner entrada = new Scanner(System.in);
     System.out.println("Informe o tamanho do vetor: ");
     int v = entrada.nextInt();
     int vetor[] = new int[v];

     popularVetor(entrada, vetor);

     System.out.println("Informe um valor inteiro aleatório: ");
     int a = entrada.nextInt();

     if (busca(vetor, a)) {
        System.out.println("Encontrou o valor!");
     } else {
        System.out.println("Valor não encontrado.");
     }
     
     entrada.close();
    }

    public void popularVetor(Scanner entrada, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Popule o vetor[" + i + "]: ");
            vetor[i] = entrada.nextInt();
          }
    }

    public boolean busca(int[] vetor, int a) {
     for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == a) {
            return true;
        } 
     }
     return false;
    }
    public static void main(String[] args) {
        new Exercicio6();
    }
}
