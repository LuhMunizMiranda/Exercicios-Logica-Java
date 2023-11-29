public class Ex04 {
    public static void main(String[] args) {
        int numero = 12;

        long resultadoFatorial = calcularFatorial(numero);

        System.out.printf("O fatorial de %s �: %s ", numero, resultadoFatorial);
    }
    public static long calcularFatorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("O fatorial n�o � definido para n�meros negativos.");
        }

        long fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
