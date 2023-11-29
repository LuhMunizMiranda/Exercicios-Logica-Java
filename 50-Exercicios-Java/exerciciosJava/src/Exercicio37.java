import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de notas: ");
        int numNotas = scanner.nextInt();

        double[] notas = new double[numNotas];
        double[] ponderacoes = new double[numNotas];

        // Preenche as notas
        for (int i = 0; i < numNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Preenche as ponderações
        for (int i = 0; i < numNotas; i++) {
            System.out.print("Digite a ponderação da nota " + (i + 1) + ": ");
            ponderacoes[i] = scanner.nextDouble();
        }

        double mediaPonderada = calcularMediaPonderada(notas, ponderacoes);

        System.out.println("A média ponderada é: " + mediaPonderada);

        scanner.close();
    }

    private static double calcularMediaPonderada(double[] notas, double[] ponderacoes) {
        if (notas.length != ponderacoes.length) {
            throw new IllegalArgumentException("Número de notas e ponderações deve ser o mesmo.");
        }

        double somaNotasPonderadas = 0;
        double somaPonderacoes = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotasPonderadas += notas[i] * ponderacoes[i];
            somaPonderacoes += ponderacoes[i];
        }

        return somaNotasPonderadas / somaPonderacoes;
    }
}

