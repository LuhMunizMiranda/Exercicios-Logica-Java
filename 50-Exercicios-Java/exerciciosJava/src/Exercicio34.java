import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String binario = converterParaBinario(numeroDecimal);

        System.out.println("O número binário equivalente é: " + binario);

        scanner.close();
    }

    private static String converterParaBinario(int numeroDecimal) {
        // Usando a classe Integer para converter decimal para binário
        return Integer.toBinaryString(numeroDecimal);
    }
}
