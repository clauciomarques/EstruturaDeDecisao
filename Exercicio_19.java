import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero inteiro menor que 1000: ");
        double numeroMenorQue1000 = scanner.nextInt();
        double primeiro_numero_invalido = scanner.nextDouble();
        boolean numero_Inteiro_Menor_Que_1000 = numeroMenorQue1000 < primeiro_numero_invalido;

        if (numero_Inteiro_Menor_Que_1000) {
            System.out.print("digite um numero valido");
        } else {
            double unidade = numeroMenorQue1000 % 10;
            numeroMenorQue1000 = (numeroMenorQue1000 - unidade) / 10;
            double dezena = numeroMenorQue1000 % 10;
            numeroMenorQue1000 = (numeroMenorQue1000 - dezena) / 10;
            double centena = numeroMenorQue1000;

            System.out.print(unidade + "unidade(s) || " + dezena + " dezena(s) || " + centena + " centena(s)");
        }
        scanner.close();
    }
}

