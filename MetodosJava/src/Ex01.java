

public class Ex01 {
    public static void main(String[] args) {
        double numero1 = 5.5;
        double numero2 = 3.5;

        double resultado = soma(numero1, numero2);

        System.out.printf("A soma de %s e %s �: %s", numero1, numero2, resultado);
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
}
