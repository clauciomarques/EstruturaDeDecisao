import java.util.Scanner;

public class Exercicio_12 {
    static final double VINTE_PORCENTO_DE_DESCONTO = 0.20;
    static final double DEZ_PORCENTO_DE_DESCONTO = 0.10;
    static final double CINCO_PORCENTO_DE_DESCONTO = 0.05;
    static final double ONZE_PORCENTO_DE_DESCONTO = 0.11;
    static final double TRES_PORCENTO_DE_DESCONTO = 0.03;
    public static class lista_de_exercicio_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("informe quanto você ganha por hora trabalhada: ");
            Double salarioHora = scanner.nextDouble();
            System.out.print("informe quantas horas você trabalha por mês: ");
            Double horasTrabalhadas = scanner.nextDouble();
            System.out.println("");

            double salarioBruto = obterSalarioBruto(salarioHora, horasTrabalhadas);
            double sindicato = obterValorDoSindicato(salarioBruto);
            double fgts = obterValorDoFGTS(salarioBruto);
            double inss = obterValorDoINSS(salarioBruto);
            double totalDeDescontos = obterValorTotalDeDescontos(sindicato, inss);

            if(salarioBruto > 900 && salarioBruto <= 1500)
            {
                double impostoDeRenda = obterValorDoImpostoDeRenda(salarioBruto);
                double salarioLiquido = obterValorDoSalarioLiquido(salarioBruto, inss, impostoDeRenda);

                System.out.println("Salário bruto: " + salarioBruto+ "\n(-) Imposto de renda (5%): " + impostoDeRenda +
                        "\n(-) INSS (10%): " + inss + "\nFGTS (11%): " + fgts + "\nTotal de descontos: " + totalDeDescontos +
                        "\nSalário líquido: " + salarioLiquido);
            } else if(salarioBruto > 1500 && salarioBruto <= 2500) {
                double impostoDeRenda = obterSegundoPossivelImpostoDeRenda(salarioBruto);
                double salarioLiquido = obterSegundoPossivelSalarioLiquido(salarioBruto, inss, impostoDeRenda);

                System.out.println("Salário bruto: " + salarioBruto+ "\n(-) Imposto de renda (10%): " + impostoDeRenda +
                        "\n(-) INSS (10%): " + inss + "\nFGTS (11%): " + fgts + "\nTotal de descontos: " + totalDeDescontos +
                        "\nSalário líquido: " + salarioLiquido);
            } else if(salarioBruto > 2500) {
                double impostoDeRenda = obterTerceiroPossivelImpostoDeRenda(salarioBruto);
                double salarioLiquido = obterTerceiroPossivelSalarioLiquido(salarioBruto, inss, impostoDeRenda);

                System.out.println("Salário bruto: " + salarioBruto+ "\n(-) Imposto de renda (20%): " + impostoDeRenda +
                        "\n(-) INSS (10%): " + inss + "\nFGTS (11%): " + fgts + "\nTotal de descontos: " + totalDeDescontos +
                        "\nSalário líquido: " + salarioLiquido);
            }
            scanner.close();
        }

        private static double obterTerceiroPossivelSalarioLiquido(double salarioBruto, double inss, double impostoDeRenda) {
            return salarioBruto - impostoDeRenda - inss;
        }

        private static double obterTerceiroPossivelImpostoDeRenda(double salarioBruto) {
            return salarioBruto * VINTE_PORCENTO_DE_DESCONTO;
        }

        private static double obterSegundoPossivelSalarioLiquido(double salarioBruto, double inss, double impostoDeRenda) {
            return salarioBruto - impostoDeRenda - inss;
        }

        private static double obterSegundoPossivelImpostoDeRenda(double salarioBruto) {
            return salarioBruto * DEZ_PORCENTO_DE_DESCONTO;
        }

        private static double obterValorDoSalarioLiquido(double salarioBruto, double inss, double impostoDeRenda) {
            return salarioBruto - impostoDeRenda - inss;
        }

        private static double obterValorDoImpostoDeRenda(double salarioBruto) {
            return salarioBruto * CINCO_PORCENTO_DE_DESCONTO;
        }

        private static double obterValorTotalDeDescontos(double sindicato, double inss) {
            return sindicato + inss;
        }

        private static double obterValorDoINSS(double salarioBruto) {
            return salarioBruto * DEZ_PORCENTO_DE_DESCONTO;
        }

        private static double obterValorDoFGTS(double salarioBruto) {
            return salarioBruto * ONZE_PORCENTO_DE_DESCONTO;
        }

        private static double obterValorDoSindicato(double salarioBruto) {
            return salarioBruto * TRES_PORCENTO_DE_DESCONTO;
        }

        private static double obterSalarioBruto(Double salarioHora, Double horasTrabalhadas) {
            return salarioHora * horasTrabalhadas;
        }
    }
}