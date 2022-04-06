import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tendo em mente a formula ax² + bx + c = 0\ndigite o valor de a: ");
        double valorDeA = scanner.nextDouble();
        double valor_minimo_para_ser_uma_equacao_de_segundo_grau = scanner.nextDouble();
        boolean valorDaPrimeiraIncognita = valorDeA == valor_minimo_para_ser_uma_equacao_de_segundo_grau;

        if (valorDaPrimeiraIncognita) {
            System.out.print(" equação não é do segundo grau");
        } else {
            System.out.print("digite o valor de b: ");
            Double valorDaSegundaIncognita = scanner.nextDouble();
            System.out.print("digite o valor de c: ");
            Double valorDaTerceiraIncognita = scanner.nextDouble();

            double delta = valorDaSegundaIncognita * valorDaSegundaIncognita - 4 * valorDeA * valorDaTerceiraIncognita;
            if (delta < 0) {
                System.out.print("a equação não possui raizes reais");
            } else if (delta == 0) {
                System.out.print("a equação possui apenas uma raiz real e o valor de delta é:" + delta);
            } else if (delta > 0) {
                double raizPositiva = (-valorDaSegundaIncognita + Math.sqrt(delta)) / (2 * valorDeA);
                double raizNegativa = (-valorDaSegundaIncognita - Math.sqrt(delta)) / (2 * valorDeA);
                System.out.print("A primeira raiz é igual a: " + raizPositiva);
                System.out.print("\na segunda raiz é igual a: " + raizNegativa);
            }
            scanner.close();
        }
    }
}

