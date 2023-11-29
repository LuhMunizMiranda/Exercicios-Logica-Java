import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        determinarPositivoNegativoZero(numero);

        scanner.close();
    }

    private static void determinarPositivoNegativoZero(double numero) {
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}

