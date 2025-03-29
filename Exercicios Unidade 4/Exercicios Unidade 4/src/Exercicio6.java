
import java.util.Scanner;

public class Exercicio6 {

    /*Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. 
    Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”. 
    Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula. */
    
    public Exercicio6() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o seu genero com sua inicial (M = masculino ; F = feminino ; I = não informado): ");
        String caractere = entrada.next();

        //toUpperCase é um metodo da String que converte Todas as letras em maiusculas.
        caractere = caractere.toUpperCase();

        //charAt é um metodo da String que pega somente 1 caractere comforme o indice e converte para char.
        char letra = caractere.charAt(0);
        //char exemplo = entrada.nextLine().toUpperCase().charAt(0);
        
        if (letra == 'M') {
             System.out.println("Masculino");
        } else if(letra == 'F') {
            System.out.println("Feminino");
        } else if(letra == 'I') {
             System.out.println("Não informado");
        } else {
             System.out.println("Entrada Inválida");
        }
        entrada.close();
    }
    public static void main(String[] args) {
        new Exercicio6();
    }
}
