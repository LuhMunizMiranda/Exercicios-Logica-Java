import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] meuArray = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            meuArray[i] = scanner.nextInt();
        }

        int segundoMaior = encontrarSegundoMaior(meuArray);

        System.out.println("O segundo maior elemento no array é: " + segundoMaior);

        scanner.close();
    }

    private static int encontrarSegundoMaior(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("O array deve ter pelo menos dois elementos.");
        }

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int elemento : array) {
            if (elemento > maior) {
                segundoMaior = maior;
                maior = elemento;
            } else if (elemento > segundoMaior && elemento < maior) {
                segundoMaior = elemento;
            }
        }

        return segundoMaior;
    }
}

