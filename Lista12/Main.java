package Lista12;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1000.0, 3000.0);

        try {
            cc.sacar(1500.0);
            cc.sacar(7000.0);
            

        } catch (ValorAcimaException e) {
            System.out.println(e.getMessage());

        }

        try {
            cc.depositar(500.0);
            cc.depositar(-500.0);
           
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

    }
}
