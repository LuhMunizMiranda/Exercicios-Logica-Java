
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<String> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(String nomeFuncionario) {
        funcionarios.add(nomeFuncionario);
        System.out.printf("Funcionario '%s' contratado pela empresa %s.%n", nomeFuncionario, nome);
    }

    public void demitirFuncionario(String nomeFuncionario) {
        if (funcionarios.remove(nomeFuncionario)) {
            System.out.printf("Funcionario '%s' demitido pela empresa %s.%n", nomeFuncionario, nome);
        } else {
            System.out.printf("Funcionario '%s' não encontrado na empresa %s.%n", nomeFuncionario, nome);
        }
    }

    public void exibirFuncionarios() {
        System.out.printf("Funcionarios da Empresa %s:%n%s%n", nome, funcionarios.isEmpty() ? "Sem funcion�rios" : funcionarios);
    }

    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("Rocha's Ltda", "40028922");
        minhaEmpresa.contratarFuncionario("Lulu");
        minhaEmpresa.contratarFuncionario("Soso");
        minhaEmpresa.contratarFuncionario("Gabi");
        minhaEmpresa.exibirFuncionarios();
        minhaEmpresa.demitirFuncionario("Lulu");
        minhaEmpresa.exibirFuncionarios();
    }
}

