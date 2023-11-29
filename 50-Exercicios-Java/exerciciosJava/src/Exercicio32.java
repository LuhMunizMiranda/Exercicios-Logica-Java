import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean ehPotenciaDeDois = verificarPotenciaDeDois(numero);

        if (ehPotenciaDeDois) {
            System.out.println(numero + " é uma potência de 2.");
        } else {
            System.out.println(numero + " não é uma potência de 2.");
        }

        scanner.close();
    }

    private static boolean verificarPotenciaDeDois(int numero) {
        // Verifica se o número é maior que 0 e se é uma potência de 2
        return (numero > 0) && ((numero & (numero - 1)) == 0);
    }
}

