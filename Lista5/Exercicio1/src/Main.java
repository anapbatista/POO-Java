// Main.java
public class Main {
    public static void main(String[] args) {
        Dispositivo[] dispositivos = {
            new Impressora(),
            new Mouse()
        };

        for (Dispositivo d : dispositivos) {
            d.ligar();
            d.checarStatus();
            d.calibrar();
            d.desligar();
            System.out.println("------");
        }
    }
}
