import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("(1)Domingo (2)Segunda (3)Terça (4)Quarta (5)Quinta (6)Sexta (7)Sábado");
        System.out.print("digite um dia da semana: ");
        int diaDaSemana = scanner.nextInt();

        if(diaDaSemana == 1) {
            System.out.print(" voce escolheu o domingo");
        } else if(diaDaSemana == 2) {
            System.out.print(" voce escolheu a segunda");
        } else if(diaDaSemana == 3) {
            System.out.print(" voce escolheu a terça");
        } else if(diaDaSemana == 4) {
            System.out.print(" voce escolheu a quarta");
        } else if(diaDaSemana == 5) {
            System.out.print(" voce escolheu a quinta");
        } else if(diaDaSemana == 6) {
            System.out.print(" voce escolheu a sexta");
        } else if(diaDaSemana == 7) {
            System.out.print(" voce escolheu o sabado");
        } else {
            System.out.print("sua escolha n corresponde a nenhum dia da semana");
        }
        scanner.close();
    }
}

