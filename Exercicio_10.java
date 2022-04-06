import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[M] Matutino; [V] Vespertino; [N] Noturno\nDiga em que turno você estuda: ");
        char turnoDoAluno = scanner.nextLine().charAt(0);

        if(turnoDoAluno=='M') {
            System.out.print("\n-----Bom Dia!-----");
        } else if(turnoDoAluno=='V') {
            System.out.print("\n-----Boa Tarde!-----");
        } else if(turnoDoAluno=='N') {
            System.out.print("\n-----Boa Noite!-----");
        } else {
            System.out.print("\n-----Valor Inválido!-----");
        }
        scanner.close();
    }
}

