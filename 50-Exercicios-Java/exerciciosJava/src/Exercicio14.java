import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int numeroVogais = contarVogais(input);

        System.out.println("Número de vogais na string: " + numeroVogais);

        scanner.close();
    }

    private static int contarVogais(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ehVogal(ch)) {
                count++;
            }
        }

        return count;
    }

    private static boolean ehVogal(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}

