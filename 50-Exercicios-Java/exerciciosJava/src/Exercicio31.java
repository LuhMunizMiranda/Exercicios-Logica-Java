import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String minhaString = scanner.nextLine();

        int numeroCaracteres = contarCaracteres(minhaString);

        System.out.println("Número de caracteres na string: " + numeroCaracteres);

        scanner.close();
    }

    private static int contarCaracteres(String texto) {
        // Usa o método length() para obter o número de caracteres na string
        return texto.length();
    }
}

