import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ehBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
    }

    private static boolean ehBissexto(int ano) {
        // Verifica se o ano é divisível por 4 e não é divisível por 100, exceto quando é divisível por 400
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
