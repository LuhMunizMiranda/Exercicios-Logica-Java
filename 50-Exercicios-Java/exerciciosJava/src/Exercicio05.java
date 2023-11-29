import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] meuArray = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            meuArray[i] = scanner.nextInt();
        }

        int maiorElemento = encontrarMaiorElemento(meuArray);

        System.out.println("O maior elemento no array é: " + maiorElemento);

        scanner.close();
    }
    private static int encontrarMaiorElemento(int[]array){
        int maior = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }
        return maior;
    }
}
