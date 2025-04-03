public class CartaoCredito implements MetodoPagamento {

    private String numDoCartao;
    private double limiteDisponivel;

    public CartaoCredito(String aNumDoCartao, double limiteDisponivel){
        this.numDoCartao = aNumDoCartao;
        this.limiteDisponivel = limiteDisponivel;
    }

    

    public String getNumDoCartao() {
        return numDoCartao;
    }



    public void setNumDoCartao(String numDoCartao) {
        this.numDoCartao = numDoCartao;
    }



    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }



    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }



    public void realizarPagamento(double valor) {
        if (valor <= this.limiteDisponivel) {
            this.limiteDisponivel -= valor;
            System.out.println("Pagamento no cartão realizado com sucesso!\n");
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    public double getTaxaPagamento(){
        return 1.25;
    }

}
