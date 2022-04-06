import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o 1º número: ");
        double primeiroNumero = Double.parseDouble(scanner.nextLine());
        System.out.print("Informe o 2º número: ");
        double segundoNumero = Double.parseDouble(scanner.nextLine());
        System.out.print("Informe o 3º número: ");
        double terceiroNumero = Double.parseDouble(scanner.nextLine());

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero && segundoNumero >= terceiroNumero) {
            System.out.print("a ordem decrescente dos numeros é: [" + primeiroNumero + "] [" + segundoNumero + "] [" + terceiroNumero + "]");
        } else if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero && terceiroNumero >= segundoNumero) {
            System.out.print("a ordem decrescente dos numeros é: [" + primeiroNumero + "] [" + terceiroNumero + "] [" + segundoNumero + "]");
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero && primeiroNumero >= terceiroNumero) {
            System.out.print("a ordem decrescente dos numeros é: [" + segundoNumero + "] [" + primeiroNumero + "] [" + terceiroNumero + "]");
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero && terceiroNumero >= primeiroNumero) {
            System.out.print("a ordem crescente dos numeros é: [" + segundoNumero + "] [" + terceiroNumero + "] [" + primeiroNumero + "]");
        } else if (terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero && primeiroNumero >= segundoNumero) {
            System.out.print("a ordem crescente dos numeros é: [" + terceiroNumero + "] [" + primeiroNumero + "] [" + segundoNumero + "]");
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero && terceiroNumero >= primeiroNumero) {
            System.out.print("a ordem crescente dos numeros é: [" + terceiroNumero + "] [" + segundoNumero + "] [" + primeiroNumero + "]");
        }
        scanner.close();
    }
}


