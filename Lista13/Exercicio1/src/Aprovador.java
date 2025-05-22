public abstract class Aprovador {
    protected Aprovador proximo;

    public Aprovador(Aprovador proximo){
        this.proximo = proximo;
    }

    public abstract void aprovar(SolicitacaoCompra s);

}
