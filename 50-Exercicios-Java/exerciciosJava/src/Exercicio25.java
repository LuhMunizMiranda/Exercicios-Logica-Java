import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] meuArray = new int[tamanho];

        // Removed duplicated code here
        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            meuArray[i] = scanner.nextInt();
        }

        System.out.print("Digite o elemento a ser pesquisado: ");
        int elementoProcurado = scanner.nextInt();

        int indice = pesquisaLinear(meuArray, elementoProcurado);

        if (indice != -1) {
            System.out.println("Elemento encontrado no índice: " + indice);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }

        scanner.close();
    }

    private static int pesquisaLinear(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i; // Retorna o índice se o elemento for encontrado
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }
}

