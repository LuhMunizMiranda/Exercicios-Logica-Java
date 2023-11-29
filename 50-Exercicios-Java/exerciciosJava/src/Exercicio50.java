import java.util.ArrayList;
import java.util.List;

public class Exercicio50 {

    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3}; // Você pode alterar o conjunto conforme necessário

        List<List<Integer>> subconjuntos = gerarSubconjuntos(conjunto);

        System.out.println("Subconjuntos:");
        for (List<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }
    }

    private static List<List<Integer>> gerarSubconjuntos(int[] conjunto) {
        List<List<Integer>> result = new ArrayList<>();
        gerarSubconjuntosAux(conjunto, 0, new ArrayList<>(), result);
        return result;
    }

    private static void gerarSubconjuntosAux(int[] conjunto, int indice, List<Integer> subconjunto, List<List<Integer>> result) {
        result.add(new ArrayList<>(subconjunto));

        for (int i = indice; i < conjunto.length; i++) {
            subconjunto.add(conjunto[i]);
            gerarSubconjuntosAux(conjunto, i + 1, subconjunto, result);
            subconjunto.remove(subconjunto.size() - 1);
        }
    }
}

