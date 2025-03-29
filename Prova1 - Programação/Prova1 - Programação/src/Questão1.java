import java.util.Scanner;

public class Questão1{

    public Questão1() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("nome = ");
        String nome = entrada.nextLine();
        System.out.print("cidade = ");
        String cidade = entrada.nextLine();

        if (nome ==  "" && cidade == "" ) {
            System.out.println("Nao é possível informar os dados");
            System.out.println("Vazio");
        } else if (nome != "" && cidade != ""){
            System.out.println("Nome: " + nome);
            if (cidade == "") {
                System.out.println("Cidade Vazio");
            } else {
                System.out.println("Cidade: " + cidade);
            } 
        } 
        System.out.println("FIM");
        entrada.close();
    }
    public static void main(String[] args)  {
        new Questão1();
    }
}
