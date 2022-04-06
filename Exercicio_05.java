import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a 1º nota do aluno: ");
        Double primeiraNotaDoAluno = Double.valueOf(scanner.nextLine());
        System.out.print("Informe a 2º nota do aluno: ");
        Double segundaNotaDoAluno = Double.valueOf(scanner.nextLine());

        double media = obterMedia(primeiraNotaDoAluno, segundaNotaDoAluno);

        if (media == 10) {
            System.out.print("O ALUNO FOI APROVADO COM DISTINCAO");
        } else if (media < 7) {
            System.out.print("O ALUNO FOI REPROVADO");
        } else if (media >= 7 || media < 10) {
            System.out.print("O ALUNO FOI APROVADO");
        }
        scanner.close();
    }

    private static double obterMedia(Double primeiraNotaDoAluno, Double segundaNotaDoAluno) {
        return (primeiraNotaDoAluno + segundaNotaDoAluno) / 2;
    }
}
