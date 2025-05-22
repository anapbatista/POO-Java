public class SolicitacaoCompra {
    private double valorDeCompra;
    private String descricao;

    public SolicitacaoCompra(double aValor, String aDescricao){
        valorDeCompra = aValor;
        descricao = aDescricao;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
