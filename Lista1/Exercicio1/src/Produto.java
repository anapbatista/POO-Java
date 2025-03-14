package Lista1.Exercicio1.src;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // criar método exibirInformações que imprima os detalhes do produto
    public void exibirInformações() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    // Criar um método adicionarEstoque(int quantidade) que aumente o estoque
    public void adicionarEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
        System.out.println("Estoque atualizado para " + quantidadeEmEstoque);
    }

    // Criar um método removerEstoque(int quantidade) que reduza o estoque sem
    // permitir valores negativos
    public void removerEstoque(int quantidade) {
        if (quantidadeEmEstoque >= quantidade) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Estoque atualizado para " + quantidadeEmEstoque);
        } else {
            System.out.println("Não há estoque suficiente para remover " + quantidade + " unidades.");
        }
    }

    public double getValorTotal(){
        return( preco * quantidadeEmEstoque);
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

}
