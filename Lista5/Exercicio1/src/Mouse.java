public class Mouse implements Dispositivo {
    public void ligar() {
        System.out.println("Mouse ligado");
    }

    public void desligar() {
        System.out.println("Mouse desligado");
    }

    public int checarStatus() {
        System.out.println("Status do Mouse verificado");
        return 2;
    }

    public void calibrar() {
        System.out.println("Mouse calibrado");
    }
}