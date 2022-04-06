import java.util.Scanner;

public class Exercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numeroDadoPeloUsuario = scanner.nextInt();

        if(numeroDadoPeloUsuario % 2 == 0) {
            System.out.print("O numero " + numeroDadoPeloUsuario +  " é par.");
        } else {
            System.out.print("O numero " + numeroDadoPeloUsuario + " é impar.");
        }
        scanner.close();
    }
}
