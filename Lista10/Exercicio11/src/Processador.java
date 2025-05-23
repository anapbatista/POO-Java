public abstract class Processador {
    protected Processador proximoProcessador = null;

    public Processador(Processador prox){
        this.proximoProcessador = prox;
    }

    public void setProximo(Processador proximo) {
        this.proximoProcessador = proximo;
    }

    public abstract void processar(int numero);
}
