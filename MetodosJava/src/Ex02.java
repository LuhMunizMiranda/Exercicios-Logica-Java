public class Ex02 {
    public static void main(String[] args) {
        int numero = 11;

        if (ehPrimo(numero)) {
            System.out.printf("%s � um n�mero primo.", numero);
        } else {
            System.out.printf("%s n�o � um n�mero primo.", numero);
        }
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
