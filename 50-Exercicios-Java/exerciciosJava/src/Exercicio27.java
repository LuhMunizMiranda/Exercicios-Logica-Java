import java.util.Scanner;

public class Exercicio27 {

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

        boolean simetrica = verificarSimetria(matriz);

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        scanner.close();
    }

    private static boolean verificarSimetria(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        // Verifica se a matriz é quadrada
        if (linhas != colunas) {
            return false;
        }

        // Verifica se a matriz é igual à sua transposta
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}

