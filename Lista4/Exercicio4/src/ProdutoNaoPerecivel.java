public class ProdutoNaoPerecivel extends Produto {
    private final int tempoGarantia; // em anos

    public ProdutoNaoPerecivel(int codigo, double preco, String descricao, int quantidade, int tempoGarantia) {
        super(codigo, preco, descricao, quantidade);
        this.tempoGarantia = tempoGarantia;
    }

    public int getTempoGarantia() {
        return tempoGarantia;
    }
}
