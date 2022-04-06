import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um dia: ");
        Byte dia = scanner.nextByte();
        System.out.print("digite um mês: ");
        Byte mes = scanner.nextByte();
        System.out.print("digite um ano: ");
        Integer ano = scanner.nextInt();
        scanner.close();
    }
}

