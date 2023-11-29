import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero =  scanner.nextInt();
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + "é: " + fatorial);
        scanner.close();
    }
    private static long calcularFatorial(int n){
        if (n<0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
            return -1;
        }else if(n==0 || n == 1) {
            return 1;
        }else{
            long resultado = 1;
            for (int i = 2; i <= n; i++){
                resultado *= i;
            }
            return resultado;
        }
    }
}
