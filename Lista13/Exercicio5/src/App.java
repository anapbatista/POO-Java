package Lista13.Exercicio5.src;

public class App {
    public static void main(String[] args) {

        Conta c = new Conta("Ana Paula de Abreu", 0);
        c.depositar(500.0);

        try{
            c.sacar(800.0);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }



    }
}
