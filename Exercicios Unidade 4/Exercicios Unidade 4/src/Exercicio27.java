import java.util.Scanner;

public class Exercicio27 {
    /*As tarifas de um estacionamento são as seguintes:

      1° e 2° hora - R$ 5,00 cada
      3° e 4° hora - R$ 7,50 cada
      5° hora e seguintes - R$ 10,00 cada

     O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. 
     Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. 
     Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. 
     Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de chegada e partida são apresentados na forma de pares de inteiros, 
     representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de partida e escreva 
     na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. 
     Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia.*/

     public Exercicio27() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a hora de entrada (0 a 23): ");
        int horaEntrada = s.nextInt();
        System.out.print("Digite o minuto de entrada (0 a 59): ");
        int minEntrada = s.nextInt();
        System.out.print("Digite a hora de saída (0 a 23): ");
        int horaSaida = s.nextInt();
        System.out.print("Digite o minuto de saida (0 a 59): ");
        int minSaida = s.nextInt();

        if (horaEntrada >= 0 && horaEntrada <= 23) {
            if (horaSaida >= 0 && horaSaida <= 23) {
                if (horaSaida > horaEntrada ||
                        (horaSaida == horaEntrada && minSaida > minEntrada)) {
                    if (minEntrada >= 0 && minEntrada <= 59) {
                        if (minSaida >= 0 && minSaida <= 59) {

                            int duracao = horaSaida - horaEntrada;

                            if ((minSaida - minEntrada) >= 30) {
                                duracao += 1;
                            }
                            float valorPagar = 0;
                            switch (duracao) {
                                case 0:
                                case 1:
                                    valorPagar = 5;
                                    break;
                                case 2:
                                    valorPagar = 10;
                                    break;
                                case 3:
                                    valorPagar = 17.5f;
                                    break;
                                case 4:
                                    valorPagar = 25;
                                    break;
                                default: //>= 5
                                    int horasMais = duracao - 4;
                                    valorPagar = 25 + (10 * horasMais);
                                    break;
                            }
                            System.out.println("Duração em horas: " + duracao);
                            System.out.println("Valor a pagar: R$" + valorPagar);
                        } else {
                            System.out.println("Minuto de saída inválido: deve ser entre 0 e 59");
                        }
                    } else {
                        System.out.println("Minuto de entrada inválido: deve ser entre 0 e 59");
                    }
                } else {
                    System.out.println("Hora de saída deve ser depois da hora de entrada");
                }
            } else {
                System.out.println("Hora de saída inválida: deve ser entre 0 e 23");
            }
        } else {
            System.out.println("Hora de entrada inválida: deve ser entre 0 e 23");
        }

        s.close();
    }

    public static void main(String[] args) {
        new Exercicio27();
    }

    
    
}
