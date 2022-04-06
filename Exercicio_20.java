import java.util.Scanner;

public class Exercicio_20 {
    static final double NUMERO_MINIMO_PARA_SER_APROVADO = 7;
    static final double NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA = 10;
    static final double NUMERO_MINIMO_POSSIVEL_NA_PROVA = 0;
    public static class lista_de_exercicio_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite a 1º nota do aluno: ");
            Double primeiraNotaDoAluno = scanner.nextDouble();
            System.out.print("digite a 2º nota do aluno: ");
            Double segundaNotaDoAluno = scanner.nextDouble();
            System.out.print("digite a 3º nota do aluno: ");
            Double terceiraNotaDoAluno = scanner.nextDouble();

            double mediaDasTresNotas = obterMediaDasTresNotas(primeiraNotaDoAluno, segundaNotaDoAluno, terceiraNotaDoAluno);
            boolean nota_Minima_Maior_Que_Sete = mediaDasTresNotas>=NUMERO_MINIMO_PARA_SER_APROVADO;
            boolean nota_Maxima_Menor_Que_Dez = mediaDasTresNotas<NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA;
            boolean nota_Maxima_Para_Ser_Reprovado = mediaDasTresNotas<NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA;
            boolean nota_Minima_Da_Prova = mediaDasTresNotas>=0;
            boolean nota_Maxima_Possivel = mediaDasTresNotas==NUMERO_MAXIMO_POSSIVEL_EM_UMA_PROVA;

            if(nota_Minima_Maior_Que_Sete && nota_Maxima_Menor_Que_Dez){
                System.out.print("Aprovado");
            } else if(nota_Maxima_Para_Ser_Reprovado && nota_Minima_Da_Prova){
                System.out.print("Reprovado");
            } else if(nota_Maxima_Possivel){
                System.out.print("Aprovado com Distinção");
            }
            scanner.close();
        }

        private static double obterMediaDasTresNotas(Double primeiraNotaDoAluno, Double segundaNotaDoAluno, Double terceiraNotaDoAluno) {
            return (primeiraNotaDoAluno + segundaNotaDoAluno + terceiraNotaDoAluno) / 3;
        }
    }
}
