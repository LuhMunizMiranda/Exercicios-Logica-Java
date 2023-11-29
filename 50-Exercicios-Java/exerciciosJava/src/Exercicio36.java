import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean diagonal = verificarDiagonal(matriz);

        if (diagonal) {
            System.out.println("A matriz é diagonal.");
        } else {
            System.out.println("A matriz não é diagonal.");
        }

        scanner.close();
    }

    private static boolean verificarDiagonal(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        // Verifica se a matriz é quadrada
        if (linhas != colunas) {
            return false;
        }

        // Verifica se todos os elementos fora da diagonal principal são zero
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}

