import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        int[] meuArray = new int[tamanho];

        System.out.print("Digite 5 valores para o Array: ");
        for (int i = 0; i < tamanho; i++) {
            meuArray[i] = scanner.nextInt();
        }

        double media = calcularMedia(meuArray);
        System.out.println("A média do Array é: " + media);

        scanner.close();
    }

    private static double calcularMedia(int[] array) {
        int soma = 0;

        for (int valor : array) {
            soma += valor;
        }

        return (double) soma / array.length;
    }
}
