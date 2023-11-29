import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        long numero = scanner.nextLong();

        int somaDigitos = calcularSomaDigitos(numero);

        System.out.println("A soma dos dígitos é: " + somaDigitos);

        scanner.close();
    }

    private static int calcularSomaDigitos(long numero) {
        // Converte o número para uma string
        String numeroString = Long.toString(numero);

        int soma = 0;

        // Itera sobre cada caractere da string e converte para inteiro
        for (int i = 0; i < numeroString.length(); i++) {
            char caractere = numeroString.charAt(i);
            int digito = Character.getNumericValue(caractere);
            soma += digito;
        }

        return soma;
    }
}

