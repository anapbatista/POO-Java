package Lista11;

public class Conta {
    private int saldo;

    public Conta(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public /*synchronized*/ void deposita(int valor) {
        int saldoTemp = saldo+valor;
        System.out.println("Depósito realizado. Saldo temporário: " + saldoTemp);
        saldo = saldoTemp;
    }

    public /*synchronized*/ void saca(int valor) {
        int saldoTemp = saldo-valor;
        System.out.println("Saque realizado. Saldo temporário: " + saldoTemp);
        saldo = saldoTemp;
    }

    public int getSaldo() {
        return saldo;
    }
}
