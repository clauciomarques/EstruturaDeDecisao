import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o Valor Do seu salário: ");
        double salario = Double.parseDouble(scanner.nextLine());
        if (salario <= 280) {
            double aumentoDoSalario = getAumentoDoSalario(salario);
            double salarioFinal = obterSalarioFinal(salario, aumentoDoSalario);
            System.out.print("com um aumento de " + aumentoDoSalario + " seu salario saiu de: " + salario +
                    " para: " + salarioFinal + ", aumentando assim 20% de seu valor inicial!");
        } else if (salario > 280 && salario <= 700) {
            double aumentoDoSalario = obterAumentoDoSalario(salario);
            double salarioFinal = obterSegundoSalarioFinal(salario, aumentoDoSalario);
            System.out.print("com um aumento de " + aumentoDoSalario + " seu salario saiu de: " + salario +
                    " para: " + salarioFinal + ", aumentando assim 15% de seu valor inicial!");
        } else if (salario > 700 && salario <= 1500) {
            double aumentoDoSalario = obterTerceiroAumentoDoSalario(salario);
            double salarioFinal = obterTerceiroSalarioFinal(salario, aumentoDoSalario);
            System.out.print("com um aumento de " + aumentoDoSalario + " seu salario saiu de: " + salario +
                    " para: " + salarioFinal + ", aumentando assim 10% de seu valor inicial!");
        } else if (salario > 1500) {
            double aumentoDoSalario = obterQuartoAumentoDoSalario(salario);
            double salarioFinal = obterQuartoSalarioFinal(salario, aumentoDoSalario);
            System.out.print("com um aumento de " + aumentoDoSalario + " seu salario saiu de: " + salario +
                    " para: " + salarioFinal + "\naumentando assim 5% de seu valor inicial!");
        }
        scanner.close();
    }

    private static double obterQuartoSalarioFinal(double salario, double aumentoDoSalario) {
        return aumentoDoSalario + salario;
    }

    private static double obterQuartoAumentoDoSalario(double salario) {
        return salario * 0.05;
    }

    private static double obterTerceiroSalarioFinal(double salario, double aumentoDoSalario) {
        return aumentoDoSalario + salario;
    }

    private static double obterTerceiroAumentoDoSalario(double salario) {
        return salario * 0.10;
    }

    private static double obterSegundoSalarioFinal(double salario, double aumentoDoSalario) {
        return aumentoDoSalario + salario;
    }

    private static double obterAumentoDoSalario(double salario) {
        return salario * 0.15;
    }

    private static double obterSalarioFinal(double salario, double aumentoDoSalario) {
        return aumentoDoSalario + salario;
    }

    private static double getAumentoDoSalario(double salario) {
        return salario * 0.20;
    }
}