import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = calcularAreaCirculo(raio);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }

    private static double calcularAreaCirculo(double raio) {
        // Fórmula da área do círculo: A = π * r^2
        return Math.PI * Math.pow(raio, 2);
    }
}

