public class Produto {

    private String nomeloja;
    private double preco;
    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
}