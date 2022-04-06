import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe Primeiro numero: ");
        int primeiroNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe Segundo numero: ");
        int segundoNumero = Integer.parseInt(scanner.nextLine());

        if (segundoNumero < primeiroNumero) {
            System.out.print("o numero " + primeiroNumero + " é maior que o numero " + segundoNumero);
        } else {
            System.out.print("o numero " + segundoNumero + " é maior que o numero " + primeiroNumero);
        }
        scanner.close();
    }
}






