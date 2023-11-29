import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        System.out.print("Digite a palavra para contar: ");
        String palavraParaContar = scanner.next().toLowerCase();

        int numeroOcorrencias = contarOcorrencias(frase, palavraParaContar);

        System.out.println("A palavra '" + palavraParaContar + "' ocorre " + numeroOcorrencias + " vezes na frase.");

        scanner.close();
    }

    private static int contarOcorrencias(String frase, String palavra) {
        String[] palavrasNaFrase = frase.split("\\s+");
        int contador = 0;

        for (String palavraNaFrase : palavrasNaFrase) {
            // Remover pontuações e verificar se a palavra é igual
            palavraNaFrase = palavraNaFrase.replaceAll("[^a-zA-Z]", "");
            if (palavraNaFrase.equals(palavra)) {
                contador++;
            }
        }

        return contador;
    }
}

