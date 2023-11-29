

public class Ex07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }

            switch (i) {
                case 1:
                    System.out.println("Número 1");
                    break;
                case 2:
                    System.out.println("Número 2");
                    break;
                case 3:
                    System.out.println("Número 3");
                    break;
                case 4:
                    System.out.println("Número 4");
                    break;
                case 5:
                    System.out.println("Número 5");
                    break;
                default:
                    System.out.println("Não é um número!");
            }
        }
    }
}
