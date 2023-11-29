import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        double[] meuArray = new double[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            meuArray[i] = scanner.nextDouble();
        }

        System.out.print("Digite o número de elementos para a média móvel: ");
        int elementosMediaMovel = scanner.nextInt();

        double[] mediaMovel = calcularMediaMovel(meuArray, elementosMediaMovel);

        System.out.println("Média Móvel: ");
        for (double valor : mediaMovel) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }

    private static double[] calcularMediaMovel(double[] array, int elementos) {
        int tamanho = array.length;
        double[] resultado = new double[tamanho - elementos + 1];

        for (int i = 0; i <= tamanho - elementos; i++) {
            double soma = 0;

            // Calcula a média dos elementos consecutivos
            for (int j = i; j < i + elementos; j++) {
                soma += array[j];
            }

            resultado[i] = soma / elementos;
        }

        return resultado;
    }
}

