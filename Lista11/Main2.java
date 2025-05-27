package Lista11;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        Conta conta = new Conta(0);

        Thread userThread = new Thread(new Operacoes(conta), "UserThread");
        Thread bankThread = new Thread(new Operacoes(conta), "BankThread");

        userThread.start();
        bankThread.start();

        userThread.join();
        bankThread.join();

        System.out.println("\nSaldo final: " + conta.getSaldo());
    }
}
