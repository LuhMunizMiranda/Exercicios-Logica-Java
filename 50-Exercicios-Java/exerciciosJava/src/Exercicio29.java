import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = calcularVolumeEsfera(raio);

        System.out.println("O volume da esfera é: " + volume);

        scanner.close();
    }

    private static double calcularVolumeEsfera(double raio) {
        double pi = Math.PI;
        return (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }
}

