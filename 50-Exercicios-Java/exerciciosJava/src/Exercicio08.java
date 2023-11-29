import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (ehPalindromo(numero)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }

    private static boolean ehPalindromo(int numero) {
        int original = numero;
        int reverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }

        return original == reverso;
    }
}


