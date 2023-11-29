

public class Ex03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf(i);
            
            for (int j = 1; j <= 5; j++) {
                System.out.printf(j);
                
                if (j == 3) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
