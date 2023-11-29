import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int mmc = calcularMMC(numero1, numero2);

        System.out.println("O MMC de " + numero1 + " e " + numero2 + " é: " + mmc);

        scanner.close();
    }

    private static int calcularMMC(int a, int b) {
        // Utilizando a fórmula do MMC: MMC(a, b) = |a * b| / MDC(a, b)
        int mdc = calcularMDC(a, b);
        return Math.abs(a * b) / mdc;
    }

    private static int calcularMDC(int a, int b) {
        // Algoritmo de Euclides para calcular o MDC
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

