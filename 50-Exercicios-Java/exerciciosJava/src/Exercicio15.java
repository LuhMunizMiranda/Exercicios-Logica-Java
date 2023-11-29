import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
        } else {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
        }

        scanner.close();
    }
}

