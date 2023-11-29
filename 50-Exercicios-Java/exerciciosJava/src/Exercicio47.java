import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] meuArray = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            meuArray[i] = scanner.nextInt();
        }

        int[] arraySemDuplicatas = removerDuplicatas(meuArray);

        System.out.println("Array sem elementos duplicados: " + Arrays.toString(arraySemDuplicatas));

        scanner.close();
    }

    private static int[] removerDuplicatas(int[] array) {
        // Utiliza um conjunto (Set) para armazenar elementos únicos
        Set<Integer> conjunto = new HashSet<>();

        for (int elemento : array) {
            conjunto.add(elemento);
        }

        // Converte o conjunto de volta para um array
        int[] arraySemDuplicatas = new int[conjunto.size()];
        int index = 0;

        for (int elemento : conjunto) {
            arraySemDuplicatas[index++] = elemento;
        }

        return arraySemDuplicatas;
    }
}

