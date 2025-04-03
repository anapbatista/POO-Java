public class Pix implements MetodoPagamento{

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public double getTaxaPagamento() {
        return 0.05;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com Pix no valor de R$ " + valor+"\n");
        
    }

    


}
