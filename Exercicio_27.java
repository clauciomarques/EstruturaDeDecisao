import java.util.Scanner;

public class Exercicio_27 {
    static final double CINCO = 5;
    static final double OITO = 8;
    static final double VINTE_E_CINCO = 25;
    static final double PRECO_DA_MACA = 1.80;
    static final double PRECO_DO_MORANGO = 2.50;
    static final double TRINTA_PORCENTO = 0.30;
    static final double NOVENTA_PORCENTO = 0.90;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Kg de morangos você deseja: ");
        double pesoDoMorango = scanner.nextDouble();
        System.out.print("Quantos Kg de maças você deseja: ");
        double pesoDaMaca = scanner.nextDouble();

        double precoFinalDoMorango = 0;
        double precoFinalDaMaca = 0;
        double precoFinal = 0;

        if(pesoDoMorango > CINCO) {
            precoFinalDoMorango = obterPrecoFinalDoMorangoSeMaiorQueCinco(pesoDoMorango);
        } else {
            precoFinalDoMorango = obterPrecoFinalDoMorangoSeMenorQueCinco(pesoDoMorango);
        } if(pesoDaMaca > CINCO) {
            precoFinalDaMaca = obterPrecoFinalDaMacaSeMaiorQueCinco(pesoDaMaca);
        } else {
            precoFinalDaMaca = obterPrecoFinalDaMacaSeMenorQueCinco(pesoDaMaca);
        } if ((precoFinalDoMorango + precoFinalDaMaca) > VINTE_E_CINCO || (pesoDaMaca + pesoDoMorango) > OITO) {
            precoFinal = obterPrecoFinalComDesconto(precoFinalDoMorango, precoFinalDaMaca);
        } else {
            precoFinal = obterPrecoFinalSemDesconto(precoFinalDoMorango, precoFinalDaMaca);
        }
        System.out.printf("O preço final da compra foi de: R$ %.2f" , precoFinal);
        scanner.close();
    }

    private static double obterPrecoFinalSemDesconto(double precoFinalDoMorango, double precoFinalDaMaca) {
        return precoFinalDaMaca + precoFinalDoMorango;
    }

    private static double obterPrecoFinalComDesconto(double precoFinalDoMorango, double precoFinalDaMaca) {
        return (precoFinalDaMaca + precoFinalDoMorango) * NOVENTA_PORCENTO;
    }

    private static double obterPrecoFinalDaMacaSeMenorQueCinco(double pesoDaMaca) {
        return PRECO_DA_MACA * pesoDaMaca;
    }

    private static double obterPrecoFinalDaMacaSeMaiorQueCinco(double pesoDaMaca) {
        return (PRECO_DA_MACA - TRINTA_PORCENTO) * pesoDaMaca;
    }

    private static double obterPrecoFinalDoMorangoSeMenorQueCinco(double pesoDoMorango) {
        return PRECO_DO_MORANGO * pesoDoMorango;
    }

    private static double obterPrecoFinalDoMorangoSeMaiorQueCinco(double pesoDoMorango) {
        return (PRECO_DO_MORANGO - TRINTA_PORCENTO) * pesoDoMorango;
    }
}
