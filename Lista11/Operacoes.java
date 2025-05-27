package Lista11;

public class Operacoes implements Runnable {
    private Conta conta;

    public Operacoes(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            conta.deposita(1);
            conta.saca(1);
        }
    }
}
