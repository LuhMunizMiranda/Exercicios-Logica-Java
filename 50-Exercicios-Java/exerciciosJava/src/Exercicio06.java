public class Exercicio06 {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        imprimirArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray ordenado:");
        imprimirArray(array);
    }

    private static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = particionar(array, inicio, fim);


            quickSort(array, inicio, indiceParticao - 1);
            quickSort(array, indiceParticao + 1, fim);
        }
    }

    private static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;


                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }


        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }

    private static void imprimirArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

