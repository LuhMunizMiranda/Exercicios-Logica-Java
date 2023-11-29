import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] meuArray = lerArray(tamanho);

        System.out.println("O quadrado de cada elemento no array é:");
        calcularQuadradoArray(meuArray);

        scanner.close();
    }

    private static int[] lerArray(int tamanho) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static void calcularQuadradoArray(int[] array) {
        for (int elemento : array) {
            int quadrado = elemento * elemento;
            System.out.print(quadrado + " ");
        }
    }
}
