// MainVideo.java
public class MainVideo {
    public static void main(String[] args) {
        Dispositivo[] dispositivosVideo = {
            new Monitor(),
            new Projetor()
        };

        for (Dispositivo v : dispositivosVideo) {
            v.ligar();
            v.checarStatus();
            v.calibrar();
            v.desligar();
            System.out.println("------");
        }
    }
}
