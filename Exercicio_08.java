import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe o valor do produto 1: ");
        double valorDoProduto1 = Double.parseDouble(scanner.nextLine());
        System.out.print("informe o valor do produto 2: ");
        double valorDoProduto2 = Double.parseDouble(scanner.nextLine());
        System.out.print("informe o valor do produto 3: ");
        double valorDoProduto3 = Double.parseDouble(scanner.nextLine());

        if (valorDoProduto1 < valorDoProduto2 && valorDoProduto1 < valorDoProduto3) {
            System.out.println("aconselha-se a você que compre o produto 1 por ter seu valor menor. ");
        } else if (valorDoProduto2 < valorDoProduto1 && valorDoProduto2 < valorDoProduto3) {
            System.out.println("aconselha-se a você que compre o produto 2 por ter seu valor menor. ");
        } else if (valorDoProduto3 < valorDoProduto2 && valorDoProduto3 < valorDoProduto1) {
            System.out.println("aconselha-se a você que compre o produto 3 por ter seu valor menor. ");
        }
        scanner.close();
    }
}



