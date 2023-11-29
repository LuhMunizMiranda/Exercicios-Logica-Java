import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        // Convertendo o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        double cosseno = Math.cos(anguloRadianos);

        System.out.println("O cosseno de " + anguloGraus + " graus é: " + cosseno);

        scanner.close();
    }
}

