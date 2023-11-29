import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int tentativaUsuario;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativaUsuario = scanner.nextInt();
            tentativas++;

            if (tentativaUsuario < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (tentativaUsuario > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");
            }
        } while (tentativaUsuario != numeroAleatorio);

        scanner.close();
    }
}

