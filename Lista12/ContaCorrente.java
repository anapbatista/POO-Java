package Lista12;

public class ContaCorrente {
    private double saldo;
    private double creditoLimite;

    public ContaCorrente(double saldo, double creditoLimite){
        this.saldo=saldo;
        this.creditoLimite = creditoLimite;
    }

    public void sacar(double valor) throws ValorAcimaException{
        if (valor>creditoLimite+saldo){
            throw new ValorAcimaException("Valor de saque maior que o limite de crédito e saldo\n");
        }
        saldo=saldo-valor;
        System.out.println("Saque realizado com sucesso.\n");
        
    }
    public void depositar(double valor) throws ValorInvalidoException{
        if (valor<=0){
            throw new ValorInvalidoException("Valor de depósito inválido. Deposite um valor maior que zero\n");
        }
        saldo=saldo+valor;
        System.out.println("Depósito realizado com sucesso.\n");
        
    }

    public void setValorLimite(double valor){
        creditoLimite=valor;
    }

}
