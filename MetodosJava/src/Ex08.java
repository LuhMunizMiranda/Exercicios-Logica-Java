public class Ex08 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maiorElemento = encontrarMaiorElemento(matriz);

        System.out.printf("Maior elemento é: %s", maiorElemento);
    }

    public static int encontrarMaiorElemento(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("A matriz n�o pode ser vazia ou nula.");
        }

        int maiorElemento = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
        }

        return maiorElemento;
    }
}
