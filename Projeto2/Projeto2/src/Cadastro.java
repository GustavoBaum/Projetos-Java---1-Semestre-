import java.util.Scanner;

public class Cadastro {

    //Construtor:
    public Cadastro() {
       System.out.println("Bom dia!");

       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Digite o nome: ");
       String nome = entrada.next();
       System.out.println("Digite o ano de nascimento: ");
       int anoNascimento = entrada.nextInt();  

       int idade = (2024 - anoNascimento);

       System.out.println("Olá " + nome + ", sua idade é " + idade);       
           
       entrada.close();


}


    public static void main(String[] args) {
        new Cadastro();
    
    }
}
