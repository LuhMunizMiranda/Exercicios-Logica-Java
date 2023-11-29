

public class Ex04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf(i);

            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue;
                }

                System.out.printf(j);
            }
            System.out.println();
        }
    }
}
