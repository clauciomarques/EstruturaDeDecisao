import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um ano: ");
        int ano = scanner.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.print("este ano é bissexto");
        } else {
            System.out.print("este ano não é bissexto");
        }
        scanner.close();
    }
}

