import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas para o Triângulo de Pascal: ");
        int numeroLinhas = scanner.nextInt();

        gerarTrianguloPascal(numeroLinhas);

        scanner.close();
    }

    private static void gerarTrianguloPascal(int numeroLinhas) {
        for (int linha = 0; linha < numeroLinhas; linha++) {
            for (int espacos = 0; espacos < numeroLinhas - linha - 1; espacos++) {
                System.out.print("   ");
            }

            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(formatarNumero(calcularCoeficienteBinomial(linha, coluna)) + "   ");
            }

            System.out.println();
        }
    }

    private static int calcularCoeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcularCoeficienteBinomial(n - 1, k - 1) + calcularCoeficienteBinomial(n - 1, k);
        }
    }

    private static String formatarNumero(int numero) {
        if (numero < 10) {
            return "  " + numero;
        } else if (numero < 100) {
            return " " + numero;
        } else {
            return String.valueOf(numero);
        }
    }
}

