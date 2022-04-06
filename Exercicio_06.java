import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int primeiroNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe um numero: ");
        int segundoNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe um numero: ");
        int terceiroNumero = Integer.parseInt(scanner.nextLine());

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.print("o numero " + primeiroNumero + " é o maior dentre todos");
        } else  if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.print("o numero " + segundoNumero + " é o maior dentre todos");
        } else  if (terceiroNumero > segundoNumero && terceiroNumero > primeiroNumero) {
            System.out.print("o numero " + terceiroNumero + " é o maior dentre todos");
        }
        scanner.close();
    }
}

