import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (ehQuadradoPerfeito(numero)) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }

        scanner.close();
    }

    private static boolean ehQuadradoPerfeito(int numero) {
        // Verifica se a raiz quadrada é um número inteiro
        double raizQuadrada = Math.sqrt(numero);
        return raizQuadrada == Math.floor(raizQuadrada);
    }
}
