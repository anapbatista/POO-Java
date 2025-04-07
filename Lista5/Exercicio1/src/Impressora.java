public class Impressora implements Dispositivo {
    public void ligar() {
        System.out.println("Impressora ligada");
    }

    public void desligar() {
        System.out.println("Impressora desligada");
    }

    public int checarStatus() {
        System.out.println("Status da Impressora verificado");
        return 1;
    }

    public void calibrar() {
        System.out.println("Impressora calibrada");
    }
}