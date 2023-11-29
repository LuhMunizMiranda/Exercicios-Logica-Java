import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus); // Converte o ângulo para radianos
        double seno = Math.sin(anguloRadianos);

        System.out.println("O seno de " + anguloGraus + " graus é: " + seno);

        scanner.close();
    }
}

