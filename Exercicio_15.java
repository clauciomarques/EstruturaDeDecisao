import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor do primeiro lado: ");
        double primeiroLado = scanner.nextDouble();
        System.out.print("digite o valor do segundo lado: ");
        double segundoLado = scanner.nextDouble();
        System.out.print("digite o valor do terceiro lado: ");
        double terceiroLado = scanner.nextDouble();

        if(primeiroLado + segundoLado < terceiroLado || primeiroLado + terceiroLado < segundoLado || terceiroLado + segundoLado < primeiroLado) {
            System.out.print("não é um triangulo");
        } else if(primeiroLado == segundoLado && primeiroLado == terceiroLado) {
            System.out.print("é um triangulo equilatero");
        } else if(primeiroLado == segundoLado || primeiroLado == terceiroLado || terceiroLado == segundoLado) {
            System.out.print("é um triangulo isóceles");
        } else {
            System.out.print("é um triangulo escaleno");
        }
        scanner.close();
    }
}

