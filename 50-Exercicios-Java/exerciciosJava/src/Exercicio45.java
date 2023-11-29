import java.util.Scanner;

public class Exercicio45 {

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

        if (ehMatrizEsparsa(matriz)) {
            System.out.println("A matriz é esparsa.");
        } else {
            System.out.println("A matriz não é esparsa.");
        }

        scanner.close();
    }

    private static boolean ehMatrizEsparsa(int[][] matriz) {
        int elementosZero = 0;
        int totalElementos = matriz.length * matriz[0].length;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento == 0) {
                    elementosZero++;
                }
            }
        }

        // Se mais da metade dos elementos for zero, consideramos a matriz esparsa
        return elementosZero > totalElementos / 2;
    }
}
