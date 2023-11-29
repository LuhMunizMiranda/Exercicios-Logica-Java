import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");

        encontrarNumerosPrimosNoIntervalo(inicio, fim);

        scanner.close();
    }

    private static void encontrarNumerosPrimosNoIntervalo(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

