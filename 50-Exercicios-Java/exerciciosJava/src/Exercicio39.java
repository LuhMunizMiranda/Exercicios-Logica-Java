import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int numeroPalavras = contarPalavras(frase);

        System.out.println("O número de palavras na frase é: " + numeroPalavras);

        scanner.close();
    }

    private static int contarPalavras(String frase) {
        // Verifica se a frase é nula ou vazia
        if (frase == null || frase.isEmpty()) {
            return 0;
        }

        // Divide a frase em palavras usando espaços como delimitadores
        String[] palavras = frase.split("\\s+");

        // Retorna o número de palavras
        return palavras.length;
    }
}

