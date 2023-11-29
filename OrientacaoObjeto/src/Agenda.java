

import java.util.ArrayList;

public class Agenda {
    private ArrayList<String> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.printf("Contato '%s' adicionado!", contato);
    }

    public void removerContato(String contato) {
        if (contatos.remove(contato)) {
            System.out.printf("Contato '%s' removido!", contato);
        } else {
            System.out.printf("Contato '%s' não encontrado!", contato);
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda Vazia!");
        } else {
            System.out.println("Contatos:");
            for (String contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato("Luiza");
        minhaAgenda.adicionarContato("Maysa");
        minhaAgenda.adicionarContato("Gabriella");
        minhaAgenda.adicionarContato("Sophia");
        minhaAgenda.adicionarContato("Hanna");
        minhaAgenda.adicionarContato("Luana");
        
        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Luiza");

        minhaAgenda.exibirContatos();
    }
}

