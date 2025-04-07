public class Produto {
    protected int codigo;
    protected double preco;
    protected String descricao;
    protected int quantidade;

    public Produto(int codigo, double preco, String descricao, int quantidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int retirarDoEstoque(int quantidadeRetirada) {
        int retirada = Math.min(quantidadeRetirada, quantidade);
        quantidade -= retirada;
        return retirada;
    }

    public void acrescentarAoEstoque(int quantidadeAcrescida) {
        this.quantidade += quantidadeAcrescida;
    }

    public void imprimirDescricao() {
        System.out.printf("Produto %d, %s, custo de R$ %.2f, quantidade %d%n", 
            codigo, descricao, preco, quantidade);
    }
}
