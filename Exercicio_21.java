import java.util.Scanner;

public class exercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser sacado (entre 10 e 600): ");
        int valor_Do_Saque = scanner.nextInt();

        if (valor_Do_Saque < 10 || valor_Do_Saque > 6000) {
            System.out.print("O valor inserido é inválido...");
        } else
        {
            int centena = valor_Do_Saque/100;
            valor_Do_Saque = (Integer) (valor_Do_Saque - centena * 100);
            int cinquenta = valor_Do_Saque / 50;
            valor_Do_Saque = (Integer) (valor_Do_Saque - cinquenta * 50);
            int dez = valor_Do_Saque / 10;
            valor_Do_Saque = (Integer) (valor_Do_Saque - dez * 10);
            int cinco = valor_Do_Saque / 5;
            valor_Do_Saque = (Integer) (valor_Do_Saque - cinco * 5);
            int um = valor_Do_Saque;

            if(centena > 0)
                System.out.print(centena+ " nota(s) de cem.\n");
            if(cinquenta > 0)
                System.out.print(cinquenta+ " nota(s) de cinquenta.\n");
            if(dez > 0)
                System.out.print(dez+ " nota(s) de dez.\n");
            if(cinco > 0)
                System.out.print(cinco+ " nota(s) de cinco");
            if(um > 0)
                System.out.print(um + " nota(s) de um.");
        }
        scanner.close();
    }
}

