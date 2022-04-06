import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe um Numero: ");
        int primeiroNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("informe um Numero: ");
        int segundoNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe um Numero: ");
        int terceiroNumero = Integer.parseInt(scanner.nextLine());

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("o Numero " + primeiroNumero + " é o maior dentre todos");
        } else  if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("o Numero " + segundoNumero + " é o maior dentre todos");
        } else  if (terceiroNumero > segundoNumero && terceiroNumero > primeiroNumero) {
            System.out.println("o Numero " + terceiroNumero + " é o maior dentre todos");
        }
        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
            System.out.print("o Numero " + primeiroNumero + " é o menor dentre todos");
        } else  if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
            System.out.print("o Numero " + segundoNumero + " é o menor dentre todos");
        } else  if (terceiroNumero < segundoNumero && terceiroNumero < primeiroNumero) {
            System.out.print("o Numero " + terceiroNumero + " é o menor dentre todos");
        }
        scanner.close();
    }
}


