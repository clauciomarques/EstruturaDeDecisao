import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma Letra: ");
        char letra = scanner.nextLine().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i'|| letra == 'o'|| letra == 'u' || letra == 'A' || letra == 'E'
                || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.print("vogal");
        } else {
            System.out.print("consoante");
        }
        scanner.close();
    }
}

