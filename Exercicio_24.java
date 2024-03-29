import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        Double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite a operação que voce deseja fazer [+][-][*][/]: ");
        char operacaoDesejada = scanner.next().charAt(0);
        System.out.print("Digite o 2º número: ");
        Double segundoNumero = scanner.nextDouble();

        if(operacaoDesejada == '+') {
            double resultado = primeiroNumero + segundoNumero;
            if (resultado < 0) {
                System.out.print("O resultado da sua soma foi de: " + resultado);
                System.out.print("\nO numero é negativo\n");
            } else {
                System.out.print("\nO numero é positivo\n");
            } if (resultado % 2 == 0) {
                System.out.print("O numero é par\n");
            } else {
                System.out.print("O numero é impar\n");
            } if (resultado % 1 == 0) {
                System.out.print("O numero é inteiro\n");
            } else {
                System.out.print("O numero é decimal\n");
            }
            System.out.print("O resultado da sua soma foi de: " + resultado);
        } else if (operacaoDesejada == '-') {
            double resultado = primeiroNumero - segundoNumero;
            if (resultado < 0) {
                System.out.print("\nO numero é negativo\n");
            } else {
                System.out.print("\nO numero é positivo\n");
            } if (resultado % 2 == 0) {
                System.out.print("O numero é par\n");
            } else {
                System.out.print("O numero é impar\n");
            } if (resultado % 1 == 0) {
                System.out.print("O numero é inteiro\n");
            } else {
                System.out.print("O numero é decimal\n");
            }
            System.out.print("O resultado da sua subtração foi de: " + resultado);
        } else if (operacaoDesejada == '*') {
            double resultado = primeiroNumero * segundoNumero;
            if (resultado < 0) {
                System.out.print("\nO numero é negativo\n");
            } else {
                System.out.print("\nO numero é positivo\n");
            } if (resultado % 2 == 0) {
                System.out.print("O numero é par\n");
            } else {
                System.out.print("O numero é impar\n");
            } if (resultado % 1 == 0) {
                System.out.print("O numero é inteiro\n");
            } else {
                System.out.print("O numero é decimal\n");
            }
            System.out.print("O resultado da sua multiplicação foi de: " + resultado);
        } else if (operacaoDesejada == '/') {
            double resultado = primeiroNumero / segundoNumero;
            if (resultado < 0) {
                System.out.print("\nO numero é negativo\n");
            } else {
                System.out.print("\nO numero é positivo\n");
            } if (resultado % 2 == 0) {
                System.out.print("O numero é par\n");
            } else {
                System.out.print("O numero é impar\n");
            } if (resultado % 1 == 0) {
                System.out.print("O numero é inteiro\n");
            } else {
                System.out.print("O numero é decimal\n");
            }
            System.out.print("O resultado da sua divisão foi de: " + resultado);
        } else {
            System.out.print("Insira uma operação válida");
        }
        scanner.close();
    }
}
