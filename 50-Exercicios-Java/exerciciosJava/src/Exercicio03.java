import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if(primo(numero)) {
            System.out.println(numero + " é um número primo");
        }else{
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    private static boolean primo (int num){
        if (num <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
