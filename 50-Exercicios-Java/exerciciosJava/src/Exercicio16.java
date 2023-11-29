import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da sequência de Fibonacci a gerar: ");
        int n = scanner.nextInt();

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    private static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}

