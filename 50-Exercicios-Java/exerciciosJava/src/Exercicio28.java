import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número limite: ");
        int limite = scanner.nextInt();

        System.out.println("Números primos até " + limite + ":");

        gerarNumerosPrimos(limite);

        scanner.close();
    }

    private static void gerarNumerosPrimos(int limite) {
        for (int i = 2; i <= limite; i++) {
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

