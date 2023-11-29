import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase com espaços: ");
        String fraseComEspacos = scanner.nextLine();

        String fraseSemEspacos = removerEspacos(fraseComEspacos);

        System.out.println("Frase sem espaços: " + fraseSemEspacos);

        scanner.close();
    }

    private static String removerEspacos(String frase) {
        // Substitui todos os espaços em branco na string por uma string vazia
        return frase.replaceAll("\\s", "");
    }
}

