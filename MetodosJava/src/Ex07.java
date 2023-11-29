public class Ex07 {
    public static void main(String[] args) {
        double temperaturaCelsius = 264;

        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);

        System.out.printf("%s graus Celsius equivalente a %s graus Fahrenheit.", temperaturaCelsius, temperaturaFahrenheit);
    }

    public static double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }
}
