import java.util.Scanner;

public class ExemploRepetição {

    public ExemploRepetição() {
        
        //FOR
        //for (inicialização, condição, finalização)
        for (int contador = 0; contador < 5; contador++) {
            System.out.println(contador);
        }
        //WHILE
        int contador = 0;
        while (contador < 0) {
            System.out.println("While" + contador);
            contador++;
        }
        //DO-WHILE 
        int contador2 = 0;
        do {
            System.out.println("Do-while: " + contador2);
            contador2++;
        } while (contador2 < 0);


        Scanner entrada = new Scanner(System.in);
        String nome = "";
        do {
        System.out.println("Digite o nome: ");
        nome = entrada.nextLine();
        } while (nome.trim().equals("")); 
        System.out.println("Nome = " + nome);
        

        System.out.println("Digite o nome: ");
        String nome2 = entrada.nextLine();
        while (nome2.trim().equals("")) {
            System.out.println("Digite o nome: " );
            nome2 = entrada.nextLine();
        }
        System.out.println("Nome = " + nome2);
        entrada.close();
     }      
    }
    public static void main(String[] args)  {
        new ExemploRepetição();
    }

