import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int mdc = calcularMDC(numero1, numero2);

        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + mdc);

        scanner.close();
    }

    private static int calcularMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return Math.abs(a); // O MDC é sempre não negativo
    }
}

