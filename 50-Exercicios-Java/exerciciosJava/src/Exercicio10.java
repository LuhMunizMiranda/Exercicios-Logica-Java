import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOrdenado = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.print("Digite o valor a ser pesquisado: ");
        int valorPesquisado = scanner.nextInt();

        int indice = pesquisaBinaria(arrayOrdenado, valorPesquisado);

        if (indice != -1) {
            System.out.println("O valor " + valorPesquisado + " está no índice " + indice + " do array.");
        } else {
            System.out.println("O valor " + valorPesquisado + " não está presente no array.");
        }

        scanner.close();
    }

    private static int pesquisaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}

