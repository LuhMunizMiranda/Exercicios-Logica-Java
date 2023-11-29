import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String inputString = scanner.nextLine();
        String stringInvertida = inverterString (inputString);

        System.out.println("String invertida: "+ stringInvertida);

                scanner.close();
    }

    private static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim){
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}
