public class Ex03 {
    public static void main(String[] args) {
        double[] numeros = { 23, 8, 98.8, 1.3, 5.3 };

        double media = calcularMedia(numeros);

        System.out.printf("A m�dia dos n�meros �: %.2s", media);
    }

    public static double calcularMedia(double[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("A lista de n�meros n�o pode ser nula ou vazia.");
        }

        double soma = 0.0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.length;
    }
}
