import java.util.Arrays;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine().toLowerCase();

        boolean saoAnagramas = verificarAnagrama(palavra1, palavra2);

        if (saoAnagramas) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }

        scanner.close();
    }

    private static boolean verificarAnagrama(String palavra1, String palavra2) {
        // Remover espaços e transformar as palavras em arrays de caracteres
        char[] arrayPalavra1 = palavra1.replaceAll("\\s", "").toCharArray();
        char[] arrayPalavra2 = palavra2.replaceAll("\\s", "").toCharArray();

        // Ordenar os arrays de caracteres
        Arrays.sort(arrayPalavra1);
        Arrays.sort(arrayPalavra2);

        // Comparar os arrays ordenados
        return Arrays.equals(arrayPalavra1, arrayPalavra2);
    }
}

