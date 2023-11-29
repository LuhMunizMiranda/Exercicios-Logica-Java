

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 0, 10, 6};

        ordenarCrescente(numeros);

        System.out.printf("ordem crescente: %s", Arrays.toString(numeros));
    }

    public static void ordenarCrescente(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode ser vazio ou nulo.");
        }

        Arrays.sort(array);
    }
}
