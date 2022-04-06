import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe um numero qualquer: ");
        float numero = scanner.nextFloat();
        boolean numeroMaiorOuIgualAZero = numero >= 0;
        if (numeroMaiorOuIgualAZero) {
            System.out.print("o numero " + numero + " é positivo");
        } else {
            System.out.print("o numero " + numero + " é negativo");
        }
        scanner.close();
    }
}