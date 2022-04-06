import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe Uma Letra (m;M = masculino) ou (f;F = feminino): ");
            char letra = scanner.nextLine().charAt(0);

            if ('M' == letra || 'm' == letra) {
                System.out.print("Masculino");
            } else if (letra == 'F' || letra == 'f') {
                System.out.print("Feminino");
            } else {
                System.out.print("Sexo inválido");
            }
            scanner.close();
        }
    }



