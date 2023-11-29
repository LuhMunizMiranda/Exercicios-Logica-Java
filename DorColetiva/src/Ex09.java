

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um número, se quiser parar, digite 0: ");
            int numero = leia.nextInt();
            if (numero == 0) {
                break;
            }

        }
        leia.close();
    }
}
