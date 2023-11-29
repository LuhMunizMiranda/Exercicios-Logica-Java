import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] meuArray = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            meuArray[i] = scanner.nextInt();
        }

        int menorElemento = encontrarMenorElemento(meuArray);

        System.out.println("O menor elemento no array é: " + menorElemento);

        scanner.close();
    }

    private static int encontrarMenorElemento(int[] array) {
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        return menor;
    }
}

