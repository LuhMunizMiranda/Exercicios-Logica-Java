import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos no conjunto: ");
        int numElementos = scanner.nextInt();

        int[] conjunto = new int[numElementos];

        // Preenche o conjunto
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            conjunto[i] = scanner.nextInt();
        }

        int[] moda = encontrarModa(conjunto);

        System.out.print("A moda do conjunto é: ");
        for (int i : moda) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    private static int[] encontrarModa(int[] conjunto) {
        // Cria um mapa para armazenar a contagem de cada elemento
        Map<Integer, Integer> contagem = new HashMap<>();

        // Preenche o mapa de contagem
        for (int elemento : conjunto) {
            contagem.put(elemento, contagem.getOrDefault(elemento, 0) + 1);
        }

        // Encontra a maior contagem
        int maiorContagem = 0;
        for (int cont : contagem.values()) {
            maiorContagem = Math.max(maiorContagem, cont);
        }

        // Encontra os elementos com a maior contagem (pode haver mais de um)
        final int finalMaiorContagem = maiorContagem;
        int quantidadeModas = (int) contagem.values().stream().filter(c -> c == finalMaiorContagem).count();
        int[] modas = new int[quantidadeModas];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() == finalMaiorContagem) {
                modas[index++] = entry.getKey();
            }
        }

        return modas;
    }
}
