import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a 1º nota do aluno: ");
        Double nota1 = scanner.nextDouble();
        System.out.print("dighite a 2º nota do aluno:");
        Double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;

        if(media>=9 && media<=10) {
            System.out.print("o aluno foi aprovado com a nota: A");
        } else if(media>=7.5 && media<9) {
            System.out.print("o aluno foi aprovado com a nota: B");
        } else if(media>=6 && media<7.5) {
            System.out.print("o aluno foi aprovado com a nota: C");
        } else if(media>=4 && media<6) {
            System.out.print("o aluno foi reprovado com a nota: D");
        } else if(media>=0 && media<4) {
            System.out.print("o aluno foi reprovado com a nota: E");
        }
        scanner.close();
    }
}

