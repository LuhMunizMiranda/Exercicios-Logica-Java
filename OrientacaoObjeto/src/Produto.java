
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void realizarCompra(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.printf("Compra de %d unidades de %s realizada com sucesso.%n", quantidade, nome);
        } else {
            System.out.printf("Quantidade inválida para compra do produto %s.%n", nome);
        }
    }

    public void exibirInformacoes() {
        System.out.printf("Produto:%nNome: %s%nPre�o: R$ %.2f%nQuantidade em Estoque: %d%n",
                nome, preco, quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("TV", 1500.00, 20);

        produto.exibirInformacoes();

        produto.realizarCompra(1);

        produto.exibirInformacoes();
    }
}

