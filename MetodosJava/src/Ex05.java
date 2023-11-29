public class Ex05 {
    public static void main(String[] args) {
        String texto = "Oi! Tudo bem?";

        int quantidadeVogais = contarVogais(texto);

        System.out.println("Quantidade de vogais: : " + quantidadeVogais);
    }

    public static int contarVogais(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("A string não pode ser nula ou vazia.");
        }

        int countVogais = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                countVogais++;
            }
        }

        return countVogais;
    }
}
