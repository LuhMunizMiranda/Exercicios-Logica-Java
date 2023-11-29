

public class Ex10 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, -2, 8, 10, -5, 7};

        for (int numero : numeros) {
            System.out.println(numero);

            if (numero < 0) {

                break;
            }
        }
    }
}
