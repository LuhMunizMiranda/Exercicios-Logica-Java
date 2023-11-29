import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        if (ehNumeroInteiro(entrada)) {
            System.out.println("A string é um número inteiro.");
        } else {
            System.out.println("A string não é um número inteiro.");
        }

        scanner.close();
    }

    private static boolean ehNumeroInteiro(String str) {
        try {
            // Tenta converter a string para um número inteiro
            Integer.parseInt(str);
            return true; // A conversão foi bem-sucedida, é um número inteiro
        } catch (NumberFormatException e) {
            return false; // A conversão falhou, não é um número inteiro
        }
    }
}

