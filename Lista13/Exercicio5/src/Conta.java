package Lista13.Exercicio5.src;

public class Conta {
    private String titular;
    private double saldo;


    public Conta(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor>saldo){
            throw new SaldoInsuficienteException("O valor de saque é maior que o saldo disponível: "+ saldo);
        }
        this.saldo-=valor;
        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
    }


    public void depositar(double valor) {
        this.saldo+=valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
    }

}
