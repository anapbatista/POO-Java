public class BoletoBancario implements MetodoPagamento{

    private String codigoDeBarras;
    private String dataDeVencimento;

    public BoletoBancario(String codigoDeBarras, String dataDeVencimento) {
        this.codigoDeBarras = codigoDeBarras;
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    public String getDataDeVencimento() {
        return dataDeVencimento;
    }
    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public double getTaxaPagamento() {
        return 0.01;
    }

    @Override
    public void realizarPagamento(double valor) {
        
        System.out.println("Valor do pagamento: R$ " + valor);
        System.out.println("Data de Vencimento: " + dataDeVencimento+"\n");
        System.out.println("Pagamento em boleto realizado com sucesso!\n");
    }

    

    

}
